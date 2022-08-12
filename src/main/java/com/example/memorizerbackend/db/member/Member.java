package com.example.memorizerbackend.db.member;

import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;
import javax.persistence.CascadeType;

import com.example.memorizerbackend.db.user.User;
import com.example.memorizerbackend.db.group.Group;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Member{

    /**
     * member_id → unique, auto_increment, integer, primary_key, unsigned, not null
        group_id → Group.group_id
        user_id → User.user_id
        create_time  → time_stamp, default current_timestamp
        group_based_notification → boolean, true
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private Integer memberId;

     @ManyToOne
     @JoinColumn(name = "groupId",nullable = false)
     private Group group;

     @ManyToOne
     @JoinColumn(name = "userId",nullable = false)
     private User user;

     @CreationTimestamp
     private Timestamp createdTime;

    @UpdateTimestamp
    @Column(columnDefinition = "TIMESTAMP DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp updateTime;

    @Column(columnDefinition = "tinyint(1) default 1")
    private boolean groupBasedNotification;

    @Column(columnDefinition = "tinyint(1) default 0")
    private boolean isAdmin;


    //default constructor
    public Member() {
    }

    public Member(Group groupId, User userId) {
        this.group = groupId;
        this.user = userId;
    }

    public Integer getMemberId() {
        return this.memberId;
    }

    public void setMemberId(Integer MemberId) {
        this.memberId = MemberId;
    }

    public Group getGroupId() {
        return this.group;
    }

    public void setGroupId(Group GroupId) {
        this.group = GroupId;
    }

    public User getUserId() {
        return this.user;
    }

    public void setUserId(User UserId) {
        this.user = UserId;
    }

    public Timestamp getCreatedTime() {
        return this.createdTime;
    }

    public void setCreatedTime(Timestamp CreatedTime) {
        this.createdTime = CreatedTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        updateTime = updateTime;
    }

    public boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean admin) {
        this.isAdmin = admin;
    }

    public boolean isGroupBasedNotification() {
		return this.groupBasedNotification;
	}

	public void setGroupBasedNotification(boolean GroupBasedNotfication) {
		this.groupBasedNotification = GroupBasedNotfication;
	}

}