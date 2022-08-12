package com.example.memorizerbackend.db.user;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.*;

//import com.example.memorizerbackend.db.group.Group;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity // This tells Hibernate to make a table out of this class
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,unique = true)
    private Integer userId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String contactNo;

    @Column(nullable = false)
    private String password;

    @Column(columnDefinition = "tinyint(1) default 0")
    private boolean emailVerified;

    @Column(columnDefinition = "tinyint(1) default 0")
    private boolean defaultMemoryPrivacy;

    @Column(columnDefinition = "BLOB")
    private String profilePic;

    @Column(columnDefinition = "BLOB")
    private String bio;

    @Column(columnDefinition = "tinyint(1) default 1")
    private Boolean userBasedNotificationEnabled;

    @Column(columnDefinition = "tinyint(1) default 1")
    private Boolean memoryBasedNotificationEnabled;


    @CreationTimestamp
    private Timestamp createTime;

    @UpdateTimestamp
    @Column(columnDefinition = "TIMESTAMP DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp updateTime;

    //TODO: Resolve default dob issue
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dob;

    public User(String FirstName, String LastName, String Email, String ContactNo, String Password) {
        this.firstName = FirstName;
        this.lastName = LastName;
        this.email = Email;
        this.contactNo = ContactNo;
        this.password = Password;
    }

    // Default Constructor
    public User() {
    };
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public boolean getEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public boolean getDefaultMemoryPrivacy() {
        return defaultMemoryPrivacy;
    }

    public void setDefaultMemoryPrivacy(boolean defaultMemoryPrivacy) {
        this.defaultMemoryPrivacy = defaultMemoryPrivacy;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        dob = dob;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        updateTime = updateTime;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        createTime = createTime;
    }


    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Boolean getUserBasedNotificationEnabled() {
        return userBasedNotificationEnabled;
    }

    public void setUserBasedNotificationEnabled(Boolean userBasedNotificationEnabled) {
        userBasedNotificationEnabled = userBasedNotificationEnabled;
    }

    public Boolean getMemoryBasedNotificationEnabled() {
        return memoryBasedNotificationEnabled;
    }

    public void setMemoryBasedNotificationEnabled(Boolean memoryBasedNotificationEnabled) {
        memoryBasedNotificationEnabled = memoryBasedNotificationEnabled;
    }
}
