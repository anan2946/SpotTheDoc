
import java.sql.Time;
import java.util.*;

/**
 *
 */
public class Controller {
/*
    private ArrayList<Doctor> doctorobject;
    private ArrayList<Patient> patientobject;
*/
    /**
     * Default constructor
     */
    public Controller() {
        /*doctorobject = new ArrayList<Doctor>();
        patientobject = new ArrayList<Patient>();*/
    }

    /**
     * @param password
     * @param name
     * @param userName
     * @param address
     * @param specialization
     * @param contact
     * @param officehours
     * @return
     */
// public String registerDoctor(String password, String name, String userName, Address address, ArrayList <String> specialization, String contact, <Time, Time> officehours) 
    public String registerDoctor(String password, String name, String userName, Address address, ArrayList<String> specialization, String contact, ArrayList<Time> officehours) {
        Doctor.addDoctorDetails(password, userName, address, specialization, contact, name, officehours);
        //doctoroject.add(new Doctor(address, specialization, contact, name, officehours));
        return "";
    }

    /**
     * @param password
     * @param name
     * @param userName
     * @return
     */
    public String registerPatient(String password, String name, String userName) {
    Patient.addPatientDetails(name, userName, password);
//patientobject.add(new Patient(name, userName, password));
        return "";
    }

    /**
     * @param userName
     * @param password
     * @return
     */
    public void login(String userName, String password) {
        // TODO implement here
        /*for (Doctor doctor : doctorobject) {
            if (userName.equals(doctor.getUserName()))
            {
                Doctor loginObject = doctor;
                break;
            }
        }
        for (Patient patient: patientobject)
        {
            if (userName.equals(patient.getUserName()))
            {
                Patient loginObject = patient;
                break;
            }
        }
        loginObject.*/
        
    }

    /**
     * @param userName
     * @return
     */
    public void deleteDoctor(String userName) {
        // TODO implement here

    }

    /**
     * @param userName
     * @return
     */
    public void approveDoctorRequest(String userName) {
        // TODO implement here

    }

    /**
     * @return
     */
    public ArrayList<Doctor> viewAllDoctors() {
        // TODO implement here
        return null;
    }

    /**
     * @param userName
     * @return
     */
    public String viewDoctorProfile(String userName) {
        // TODO implement here
        return "";
    }

    /**
     * @param Username
     * @param date
     * @return
     */
    public String viewAvailableSlots(String Username, Date date) {
        // TODO implement here
        return "";
    }

    /**
     * @param name
     * @param specialization
     * @param location
     * @return
     */
    public Doctor searchDoctor(String name, String specialization, String location) {
        // TODO implement here
        return null;
    }

    /**
     * @param comment
     * @param Prescription
     * @param appointmentId
     * @return
     */
    public void updatePatientRecord(String comment, ArrayList<String> Prescription, Integer appointmentId) {
        // TODO implement here

    }

    /**
     * @param userName
     * @param time
     * @param date
     * @return
     */
    public String scheduleAppointment(String userName, Time time, Date date) {
        // TODO implement here
        return "";
    }

}
