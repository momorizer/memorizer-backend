package com.example.memorizerbackend.db.notification;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DNotification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer NotificationId;

    @CreationTimestamp
    private Timestamp CreateTime;

    private Integer UserId;

    private String Content;

    private boolean IsSeen;

    private Integer NotificationType;

    public DNotification(){

    }

    public DNotification(Integer UserId){
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
