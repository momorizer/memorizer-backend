package com.example.memorizerbackend.db.notification;

import com.example.memorizerbackend.db.user.User;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.SQLOutput;
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

    //TODO: resolve output
    @OneToOne
    @JoinColumn(name = "UserId",nullable = false)
    private User UserId;

    private String Content;

    @Column(columnDefinition = "tinyint(1) default 0")
    private boolean IsSeen;

    @Column(columnDefinition = "int default 1")
    private Integer NotificationType;

    public Notification() {
        System.out.println("Inside default notification constructor");
    }

    public Notification(User UserId) {
        System.out.println("Inside notification constructor"+UserId.getUserId());
        this.UserId = UserId;
    }

    public Timestamp getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Timestamp createTime) {
        CreateTime = createTime;
    }

    public User getUserId() {
        return UserId;
    }

    public void setUserId(User userId) {
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
