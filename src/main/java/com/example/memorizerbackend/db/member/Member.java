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
     private Group groupId;

     @OneToOne
     private User userId;

     @CreationTimestamp
     private Timestamp createdTime;

     private boolean groupBasedNotfication;

     private boolean admin;

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    //default constructor
    public Member() {
    }

    public Member(Group groupId, User userId) {
        this.groupId = groupId;
        this.userId = userId;
    }

    public Integer getMemberId() {
        return this.memberId;
    }

    public void setMemberId(Integer MemberId) {
        this.memberId = MemberId;
    }

    public Group getGroupId() {
        return this.groupId;
    }

    public void setGroupId(Group GroupId) {
        this.groupId = GroupId;
    }

    public User getUserId() {
        return this.userId;
    }

    public void setUserId(User UserId) {
        this.userId = UserId;
    }

    public Timestamp getCreatedTime() {
        return this.createdTime;
    }

    public void setCreatedTime(Timestamp CreatedTime) {
        this.createdTime = CreatedTime;
    }

	public boolean isGroupBasedNotfication() {
		return this.groupBasedNotfication;
	}

	public void setGroupBasedNotfication(boolean GroupBasedNotfication) {
		this.groupBasedNotfication = GroupBasedNotfication;
	}

}