
import java.util.*;

/**
 *
 */
public class Patient extends User {

    /**
     * Default constructor
     */
    public Patient(String name, String userName, String password) {
        //addPatientDetails(name, userName, password);
        setName(name);
        setRole(RoleType.Patient);
        setuserName(userName);
        setPassword(password);
    }

    private String name;
    private ArrayList<Appointment> AppointmentList;
    private static ArrayList<Patient> patientList;

    /**
     * @param userName
     * @return
     */
    public static Boolean addPatientDetails(String name, String userName, String password) {
        if (User.checkuserNameAvailability(userName)) {
            patientList.add(new Patient(name, userName, password));
            return true;
        } else {
            return false;
        }
    }

    public static Patient getObjectByuserName(String userName) {
        // TODO implement here
        for (Patient patient : getPatientList()) {
            if (userName.equals(patient.getuserName())) {
                return patient;
            }
        }
        return null;
    }

    /**
     * @return
     */
    public ArrayList<Appointment> getAppointmentSchedule() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void save() {
        // TODO implement here

    }

    /**
     * @return
     */
    public String getName() {
        // TODO implement here
        return "";
    }

    /**
     * @param value
     * @return
     */
    public void setName(String value) {
        // TODO implement here

    }

    /**
     * @return
     */
    public ArrayList<Appointment> getAppointmentList() {
        // TODO implement here
        return null;
    }

    /**
     * @param value
     * @return
     */
    public void updateAppointmentList(Appointment value) {
        // TODO implement here

    }

    /**
     * @return
     */
    public static ArrayList<Patient> getPatientList() {
        // TODO implement here
        return null;
    }

    /**
     * @param value
     * @return
     */
    public static void appendPatientList(Patient value) {
        // TODO implement here

    }

    /**
     * @param id
     * @return
     */
    public static Appointment getObjectByID(Integer id) {
        // TODO implement here
        return null;
    }

}
