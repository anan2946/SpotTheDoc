
import java.sql.Time;
import java.util.*;

/**
 *
 */
public class Doctor extends User implements Observer {

    /**
     * Default constructor
     */
    public Doctor(String password, String userName, Address address, ArrayList<String> specialization, String contact, String name, ArrayList<Time> officehours) {
        //addDoctorDetails(address, specialization, contact, name, officehours);
        setPassword(password);
        setUserName(userName);
        setAddress(address);
        setSpeciality(specialization);
        setPhoneNo(contact);
        setName(name);
        setOfficeHours(officehours);
        setRole(RoleType.Doctor);
    }

    /**
     *
     */
    private String name;
    private String phoneNo;
    private ArrayList<String> speciality;
    private Address address;
    private ArrayList<Time> officeHours;
    private ArrayList<Appointment> AppointmentList;
    private static ArrayList<Doctor> doctorList;
    public ArrayList<Appointment> observerState;

    /**
     * @param date
     * @return
     */
    public ArrayList<Time> getAvailableSlot(Date date) {
        // TODO implement here
        return null;
    }

    /**
     * @param comment
     * @param Prescription
     * @param appointmentId
     * @return
     */
    public void addPatientRecord(String comment, ArrayList<String> Prescription, Integer appointmentId) {
        // TODO implement here

    }

    /**
     * @param address
     * @param specialization
     * @param contact
     * @param name
     * @param officehours
     * @return
     */
    public static void addDoctorDetails(String password, String userName, Address address, ArrayList<String> specialization, String contact, String name, ArrayList<Time> officehours) {
        // TODO implement here
        doctorList.add(new Doctor(password, userName, address, specialization, contact, name, officehours));

    }

    /**
     * @return
     */
    public ArrayList<Doctor> getAllDoctors() {
        // TODO implement here
        return null;
    }

    /**
     * @param userName
     * @return
     */
    public static Doctor getObjectByUserName(String userName) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void updateDoctorRoleType() {
        // TODO implement here

    }

    /**
     * @param name
     * @return
     */
    public static ArrayList<Doctor> getDoctorByName(String name) {
        // TODO implement here
        return null;
    }

    /**
     * @param location
     * @return
     */
    public static ArrayList<Doctor> getDoctorByLocation(String location) {
        // TODO implement here
        return null;
    }

    /**
     * @param specialization
     * @return
     */
    public static ArrayList<Doctor> getDoctorBySpecialization(String specialization) {
        // TODO implement here
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
    public void removeFromList() {
        // TODO implement here

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
    public String getPhoneNo() {
        // TODO implement here
        return "";
    }

    /**
     * @param value
     * @return
     */
    public void setPhoneNo(String value) {
        // TODO implement here

    }

    /**
     * @return
     */
    public ArrayList<String> getSpeciality() {
        // TODO implement here
        return null;
    }

    /**
     * @param value
     * @return
     */
    public void setSpeciality(ArrayList<String> value) {
        // TODO implement here

    }

    /**
     * @return
     */
    public Address getAddress() {
        // TODO implement here
        return null;
    }

    /**
     * @param value
     * @return
     */
    public void setAddress(Address value) {
        // TODO implement here

    }

    /**
     * @return
     */
    public void getOfficeHours() {
        // TODO implement here

    }

    /**
     * @param value
     * @return
     */
    //public void setOfficeHours(void value) {
    public void setOfficeHours(ArrayList<Time> value) {
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
     * @return
     */
    public static ArrayList<Doctor> getDoctorList() {
        // TODO implement here
        return null;
    }

    /**
     * @param value
     * @return
     */
    public void updateAppointmentList(Doctor value) {
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

    /**
     * @param appointment
     * @return
     */
    public void updateAppointmentList(Appointment appointment) {
        // TODO implement here

    }

}
