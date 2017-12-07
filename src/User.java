
import java.util.*;

/**
 * 
 */
public abstract class User {

    /**
     * Default constructor
     */
    public User() {
    }

    /**
     * 
     */
    private String userName;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private RoleType role;



    /**
     * @param username 
     * @param password 
     * @return
     */
    public static Boolean login(String username, String password) {
        // TODO implement here
        return null;
    }

    /**
     * @param username 
     * @return
     */
    public static Boolean checkUserNameAvailability(String username) {
        // TODO implement here
        return null;
    }

    /**
     * @param username 
     * @param password 
     * @param role 
     * @return
     */
    public User User(String username, String password, RoleType role) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String getUserName() {
        // TODO implement here
        return "";
    }

    /**
     * @param value 
     * @return
     */
    public void setUserName(String value) {
        // TODO implement here

    }

    /**
     * @return
     */
    public String getPassword() {
        // TODO implement here
        return "";
    }

    /**
     * @param value 
     * @return
     */
    public void setPassword(String value) {
        // TODO implement here

    }

    /**
     * @return
     */
    public RoleType getRole() {
        // TODO implement here
        return null;
    }

    /**
     * @param value 
     * @return
     */
    public void setRole(RoleType value) {
        // TODO implement here

    }

}