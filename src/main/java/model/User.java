
package Model;

import java.sql.Timestamp;


public class User {
    private int userId;
    private String fullName;
    private String email;
    private String phoneNumber;
    private String password;
    private String role;
    private String accountTier;
    private String roomNumber; // FK
    private Timestamp createdDate;

    public User() {}

    public User(int userId, String fullName, String email, String phoneNumber, String password, String role, String accountTier, String roomNumber, Timestamp createdDate) {
        this.userId = userId;
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.role = role;
        this.accountTier = accountTier;
        this.roomNumber = roomNumber;
        this.createdDate = createdDate;
    }

    public int getUserId() {
        return userId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public String getAccountTier() {
        return accountTier;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setAccountTier(String accountTier) {
        this.accountTier = accountTier;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }
    
    
}
