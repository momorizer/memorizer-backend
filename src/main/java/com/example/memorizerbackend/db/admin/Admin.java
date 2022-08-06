package com.example.memorizerbackend.db.admin;

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
public class Admin{

    /**
     * admin_id → unique, auto_increment, integer, primary_key, unsigned, not null
        group_id → Group.group_id
        user_id → User.user_id
        create_time → time_stamp, default current_timestamp
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private Integer AdminId;

    @OneToOne
     private Group GroupId;

    @OneToOne
     private User UserId;

     @CreationTimestamp
     private Timestamp CreatedTime;

    //default constructor
    public Admin() {
    }

    public Admin(Integer AdminId, Group GroupId, User UserId, Timestamp CreatedTime) {
        this.AdminId = AdminId;
        this.GroupId = GroupId;
        this.UserId = UserId;
        this.CreatedTime = CreatedTime;
    }



    public Integer getAdminId() {
        return this.AdminId;
    }

    public void setAdminId(Integer AdminId) {
        this.AdminId = AdminId;
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

}