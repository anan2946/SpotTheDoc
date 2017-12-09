
import java.sql.Time;
import java.util.*;

/**
 *
 */
public class Appointment {

    /**
     * Default constructor
     */
    public Appointment(String userName, Time time, Date date) {
        this.setDate(date);
        this.setStartTime(time);
        this.setStatus(status.Pending);
        randomAppointmentID = randomAppointmentID + 1;
        this.setAppointmentId(randomAppointmentID);
        this.doctorUserName;
        this.patientUserName;
        this.endTime;
    }

    /**
     *
     */
    private String doctorUserName;
    private Time startTime;
    private Time endTime;
    private Date date;
    private Status status;
    private Integer appointmentId;
    private Record record;
    public String patientUserName;
    private static Integer randomAppointmentID = 0;

    /**
     * @return
     */
    public void save() {
        // TODO implement here

    }

    /**
     * @return
     */
    public String getDoctorUserName() {
        // TODO implement here
        return doctorUserName;
    }

    /**
     * @param value
     * @return
     */
    public void setDoctorUserName(String value) {
        // TODO implement here

    }

    public String getPatientUserName() {
        // TODO implement here
        return patientUserName;
    }

    /**
     * @param value
     * @return
     */
    public void setPatientUserName(String value) {
        // TODO implement here

    }

    /**
     * @return
     */
    public Time getStartTime() {
        // TODO implement here
        return startTime;
    }

    /**
     * @param value
     * @return
     */
    public void setStartTime(Time value) {
        // TODO implement here
        this.startTime = value;
    }

    /**
     * @return
     */
    public Time getEndTime() {
        // TODO implement here
        return endTime;
    }

    /**
     * @param value
     * @return
     */
    public void setEndTime(Time value) {
        // TODO implement here

    }

    /**
     * @return
     */
    public Date getDate() {
        // TODO implement here
        return date;
    }

    /**
     * @param value
     * @return
     */
    public void setDate(Date value) {
        // TODO implement here
        this.date = value;
    }

    /**
     * @return
     */
    public Status getStatus() {
        // TODO implement here
        return status;
    }

    /**
     * @param value
     * @return
     */
    public void setStatus(Status value) {
        // TODO implement here
        this.status = value;
    }

    /**
     * @return
     */
    public Integer getAppointmentId() {
        // TODO implement here
        return appointmentId;
    }

    /**
     * @param value
     * @return
     */
    public void setAppointmentId(Integer value) {
        // TODO implement here
        this.appointmentId = value;
    }

    /**
     * @return
     */
    public Record getRecord() {
        // TODO implement here
        return record;
    }

    /**
     * @param value
     * @return
     */
    public void setRecord(Record value) {
        // TODO implement here
        record = value;
    }

}
