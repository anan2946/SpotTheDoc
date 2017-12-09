
import java.sql.Time;
import java.util.*;

/**
 *
 */
public class AppointmentController implements Subject {

    /**
     * Default constructor
     */
    public AppointmentController() {
    }
    public ArrayList<Observer> observers;
    public static ArrayList<Appointment> appointmentList;
    //public ArrayList <Appointment> subjectState;

    /**
     * @param appointmentID
     * @param userName
     * @return
     */
    public void approveAppointment(Integer appointmentID, String userName) {
        // TODO implement here
        Doctor d = Doctor.getObjectByuserName(userName);
        for (Appointment appointment : d.observerState) {
            if (Objects.equals(appointmentID, appointment.getAppointmentId())) {
                int appointmentIndex = d.observerState.indexOf(appointment);
                d.observerState.remove(appointmentIndex);
                d.addToAppointmentList(appointment);
                appointment.setStatus(Status.Approved);
            }
        }
    }

    /**
     * @param appointmentID
     * @param userName
     * @return
     */
    public void rejectAppointment(Integer appointmentID, String userName) {
        // TODO implement here
        Doctor d = Doctor.getObjectByuserName(userName);
        for (Appointment appointment : d.observerState) {
            if (Objects.equals(appointmentID, appointment.getAppointmentId())) {
                int appointmentIndex = d.observerState.indexOf(appointment);
                d.observerState.remove(appointmentIndex);
                appointment.setStatus(Status.Rejected);
            }
        }
    }

    /**
     * @param userName
     * @return
     */
    public ArrayList<Appointment> viewAppointmentSchedule(String userName) {
        // TODO implement here
        Doctor d = Doctor.getObjectByuserName(userName);
        return d.getAppointmentList();
    }

    /**
     * @param userName
     * @return
     */
    public ArrayList<Appointment> viewAppointmentRequests(String userName) {
        // TODO implement here
        Doctor d = Doctor.getObjectByuserName(userName);
        return d.observerState;
    }

    /**
     * @param t
     * @return
     */
    public void selectTimeSlot(Time t) {
        // TODO implement here

    }

    /**
     * @param userName
     * @param time
     * @param date
     * @return
     */
    public void createAppointment(String userName, Time time, Date date) {
        // TODO implement here
        Appointment a = new Appointment(userName, time, date);
        appointmentList.add(a);
        notify(a);
    }

    /**
     * @param o
     * @return
     */
    public void attach(Observer o) {
        // TODO implement here
        observers.add(o);
    }

    /**
     * @param o
     * @return
     */
    public void detach(Observer o) {
        // TODO implement here
        int observerIndex = observers.indexOf(o);
        observers.remove(observerIndex);
    }

    /**
     * @param appointment
     * @return
     */
    public void notify(Appointment appointment) {
        // TODO implement here
        for (Observer observer : observers) {
            observer.updateAppointmentList(appointment);
            //call update appointment list on doctor
        }

    }

}
