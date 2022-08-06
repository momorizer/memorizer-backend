package com.example.memorizerbackend.db.member;

import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
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
     private Integer MemberId;

    @OneToOne
     private Group GroupId;

    @OneToOne
     private User UserId;

     @CreationTimestamp
     private Timestamp CreatedTime;

     private boolean GroupBasedNotfication;

    //default constructor
    public Member() {
    }

    public Member(Integer MemberId, Group GroupId, User UserId, Timestamp CreatedTime, boolean GroupBasedNotfication) {
        this.MemberId = MemberId;
        this.GroupId = GroupId;
        this.UserId = UserId;
        this.CreatedTime = CreatedTime;
        this.GroupBasedNotfication = GroupBasedNotfication;
    }

    public Integer getMemberId() {
        return this.MemberId;
    }

    public void setMemberId(Integer MemberId) {
        this.MemberId = MemberId;
    }

    public Group getGroupId() {
        return this.GroupId;
    }

    public void setGroupId(Group GroupId) {
        this.GroupId = GroupId;
    }

    public User getUserId() {
        return this.UserId;
    }

    public void setUserId(User UserId) {
        this.UserId = UserId;
    }

    public Timestamp getCreatedTime() {
        return this.CreatedTime;
    }

    public void setCreatedTime(Timestamp CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

	public boolean isGroupBasedNotfication() {
		return this.GroupBasedNotfication;
	}

	public void setGroupBasedNotfication(boolean GroupBasedNotfication) {
		this.GroupBasedNotfication = GroupBasedNotfication;
	}

}