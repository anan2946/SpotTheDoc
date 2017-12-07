
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

    /**
     * 
     */
    public ArrayList <Appointment> appointmentList;

    /**
     * 
     */
    public ArrayList <Appointment> subjectState;



    /**
     * @param appointmentID 
     * @param username 
     * @return
     */
    public void approveAppointment(Integer appointmentID, String username) {
        // TODO implement here

    }

    /**
     * @param appointmentID 
     * @param username 
     * @return
     */
    public void rejectAppointment(Integer appointmentID, String username) {
        // TODO implement here

    }

    /**
     * @param username 
     * @return
     */
    public Appointment viewAppointmentSchedule(String username) {
        // TODO implement here
        return null;
    }

    /**
     * @param username 
     * @return
     */
    public Appointment viewAppointmentRequest(String username) {
        // TODO implement here
        return null;
    }

    /**
     * @param t 
     * @return
     */
    public void selectTimeSlot(Time t) {
        // TODO implement here

    }

    /**
     * @param username 
     * @param time 
     * @param date 
     * @return
     */
    public void createAppointment(String username, Time time, Date date) {
        // TODO implement here

    }

    /**
     * @param o 
     * @return
     */
    public void attach(Observer o) {
        // TODO implement here

    }

    /**
     * @param o 
     * @return
     */
    public void detach(Observer o) {
        // TODO implement here

    }

    /**
     * @param appointment 
     * @return
     */
    public void notify(Appointment appointment) {
        // TODO implement here

    }

}