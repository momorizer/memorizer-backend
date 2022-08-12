package com.example.memorizerbackend.db.notification;

import com.example.memorizerbackend.db.user.User;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.SQLOutput;
import java.sql.Timestamp;

import javax.persistence.*;

import com.example.memorizerbackend.db.user.User;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,unique = true)
    private Integer notificationId;

    @CreationTimestamp
    private Timestamp createTime;

    @UpdateTimestamp
    @Column(columnDefinition = "TIMESTAMP DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp updateTime;

<<<<<<< HEAD
    //TODO: resolve output
    @OneToOne
    @JoinColumn(name = "UserId",nullable = false)
    private User UserId;
=======
    @ManyToOne
    @JoinColumn(name = "userId",nullable = false)
    private User user;
>>>>>>> main

    @Column(columnDefinition = "BLOB")
    private String content;

    @Column(columnDefinition = "tinyint(1) default 0")
    private boolean isSeen;

    @Column(columnDefinition = "int default 1")
    private Integer notificationType;

<<<<<<< HEAD
    public Notification() {
        System.out.println("Inside default notification constructor");
    }

    public Notification(User UserId) {
        System.out.println("Inside notification constructor"+UserId.getUserId());
        this.UserId = UserId;
=======
    public Notification(){
    }

    public Notification(User user, String content) {
        this.user = user;
        this.content = content;
    }

    public Notification(User user) {
        this.user = user;
>>>>>>> main
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

<<<<<<< HEAD
    public User getUserId() {
        return UserId;
    }

    public void setUserId(User userId) {
        UserId = userId;
=======
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
>>>>>>> main
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isSeen() {
        return isSeen;
    }

    public void setSeen(boolean seen) {
        isSeen = seen;
    }

    public Integer getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(Integer notificationType) {
        this.notificationType = notificationType;
    }

    public Integer getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(Integer notificationId) {
        this.notificationId = notificationId;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        updateTime = updateTime;
    }
}
