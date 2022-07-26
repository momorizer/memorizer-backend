package com.example.memorizerbackend.db.request;

import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;

import com.example.memorizerbackend.db.user.User;
import com.example.memorizerbackend.db.group.Group;

@Entity
public class Request{

    /**
     * request_id → unique, auto_increment, integer, primary_key, unsigned, not null
        group_id → Group.group_id
        user_id → User.user_id
        create_time → time_stamp, default current_timestamp
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private Integer requestId;

     @ManyToOne
     @JoinColumn(name="groupId" , nullable = false )
     private Group group;

     @ManyToOne
     @JoinColumn( name="userId" , nullable=false)
     private User user;

     @CreationTimestamp
     private Timestamp createdTime;

    //default constructor
    public Request() {
    }

    public Request( Group GroupId, User UserId) {
        this.group = GroupId;
        this.user = UserId;
    }



    public Integer getRequestId() {
        return this.requestId;
    }

    public void setRequestId(Integer RequestId) {
        this.requestId = RequestId;
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

}