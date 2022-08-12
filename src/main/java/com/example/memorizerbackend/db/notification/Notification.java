package com.example.memorizerbackend.db.notification;

import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

import javax.persistence.*;

import com.example.memorizerbackend.db.user.User;

@Entity
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,unique = true)
    private Integer notificationId;

    @CreationTimestamp
    private Timestamp createTime;

    @ManyToOne
    @JoinColumn(name = "UserId",nullable = false)
    private User user;

    private String content;

    @Column(columnDefinition = "tinyint(1) default 0")
    private boolean isSeen;

    @Column(columnDefinition = "int default 1")
    private Integer notificationType;

    public Notification(){
    }

    public Notification(User user, String content) {
        this.user = user;
        this.content = content;
    }

    public Notification(User user) {
        this.user = user;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
}
