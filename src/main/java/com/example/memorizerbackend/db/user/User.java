package com.example.memorizerbackend.db.user;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity // This tells Hibernate to make a table out of this class
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,unique = true)
    private Integer UserId;

//    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
//    private ContactDetail contactDetail;

    //TODO: Add foreign keys
    @Column(nullable = false)
    private String FirstName;

    @Column(nullable = false)
    private String LastName;

    @Column(nullable = false, unique = true)
    private String Email;

    @Column(nullable = false, unique = true)
    private String ContactNo;

    @Column(nullable = false)
    private String Password;

    @Column(columnDefinition = "tinyint(1) default 0")
    private boolean EmailVerified;

    @Column(columnDefinition = "tinyint(1) default 0")
    private boolean DefaultMemoryPrivacy;

    private String ProfilePic;

    private String Bio;

    @Column(columnDefinition = "tinyint(1) default 1")
    private Boolean UserBasedNotificationEnabled;

    @Column(columnDefinition = "tinyint(1) default 1")
    private Boolean MemoryBasedNotificationEnabled;


    @CreationTimestamp
    private Timestamp CreateTime;

    @UpdateTimestamp
    @Column(columnDefinition = "TIMESTAMP DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp UpdateTime;

//    @ColumnDefault("")
    @JsonFormat(pattern = "yyyy-MM-dd")
    //TODO: Resolve defualt dob issue
    private Date Dob;

    public User(String FirstName, String LastName, String Email, String ContactNo, String Password) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email = Email;
        this.ContactNo = ContactNo;
        this.Password = Password;
    }

    // Default Constructor
    public User() {
    };

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getContactNo() {
        return ContactNo;
    }

    public void setContactNo(String contactNo) {
        ContactNo = contactNo;
    }

    public String getProfilePic() {
        return ProfilePic;
    }

    public void setProfilePic(String profilePic) {
        ProfilePic = profilePic;
    }

    public boolean getEmailVerified() {
        return EmailVerified;
    }

    public void setEmailVerified(boolean emailVerified) {
        EmailVerified = emailVerified;
    }

    public boolean getDefaultMemoryPrivacy() {
        return DefaultMemoryPrivacy;
    }

    public void setDefaultMemoryPrivacy(boolean defaultMemoryPrivacy) {
        DefaultMemoryPrivacy = defaultMemoryPrivacy;
    }

    public Date getDob() {
        return Dob;
    }

    public void setDob(Date dob) {
        Dob = dob;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Timestamp getUpdateTime() {
        return UpdateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        UpdateTime = updateTime;
    }

    public Timestamp getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Timestamp createTime) {
        CreateTime = createTime;
    }


    public String getBio() {
        return Bio;
    }

    public void setBio(String bio) {
        Bio = bio;
    }

    public Boolean getUserBasedNotificationEnabled() {
        return UserBasedNotificationEnabled;
    }

    public void setUserBasedNotificationEnabled(Boolean userBasedNotificationEnabled) {
        UserBasedNotificationEnabled = userBasedNotificationEnabled;
    }

    public Boolean getMemoryBasedNotificationEnabled() {
        return MemoryBasedNotificationEnabled;
    }

    public void setMemoryBasedNotificationEnabled(Boolean memoryBasedNotificationEnabled) {
        MemoryBasedNotificationEnabled = memoryBasedNotificationEnabled;
    }
}
