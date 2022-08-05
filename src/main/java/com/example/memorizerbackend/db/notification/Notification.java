package com.example.memorizerbackend.db.notification;

import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

import javax.persistence.*;

@Entity
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,unique = true)
    private Integer NotificationId;

    @CreationTimestamp
    private Timestamp CreateTime;

    @Column(nullable = false)
    private Integer UserId;

    private String Content;

    @Column(columnDefinition = "tinyint(1) default 0")
    private boolean IsSeen;

    @Column(columnDefinition = "int default 1")
    private Integer NotificationType;

    public Notification() {

    }

    public Notification(Integer UserId) {
        this.UserId = UserId;
    }

    public Timestamp getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Timestamp createTime) {
        CreateTime = createTime;
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public boolean isSeen() {
        return IsSeen;
    }

    public void setSeen(boolean seen) {
        IsSeen = seen;
    }

    public Integer getNotificationType() {
        return NotificationType;
    }

    public void setNotificationType(Integer notificationType) {
        NotificationType = notificationType;
    }

    public Integer getNotificationId() {
        return NotificationId;
    }

    public void setNotificationId(Integer notificationId) {
        NotificationId = notificationId;
    }
}
