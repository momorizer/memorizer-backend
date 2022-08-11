package com.example.memorizerbackend.db.memory;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

import javax.persistence.*;

import com.example.memorizerbackend.db.user.User;

@Entity
public class Memory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,unique = true)
    private Integer memoryId;

    @ManyToOne
    private User createdBy;

    @ManyToOne
    private User createdFor;

    @Column(nullable = false)
    private String title;

    private String content;

    private String photo;

    @Column(columnDefinition = "tinyint(1) default 0")
    private boolean privacy;

    @CreationTimestamp
    private Timestamp createTime;

    @UpdateTimestamp
    private Timestamp updateTime;

    //Default constructor
    public Memory(){

    }

    public Memory(User CreatedBy, User CreatedFor, String Title){
        this.createdBy = CreatedBy;
        this.createdFor = CreatedFor;
        this.title = Title;
    }


    public Integer getMemoryId() {
        return memoryId;
    }

    public void setMemoryId(Integer memoryId) {
        this.memoryId = memoryId;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public User getCreatedFor() {
        return createdFor;
    }

    public void setCreatedFor(User createdFor) {
        this.createdFor = createdFor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public boolean getPrivacy() {
        return privacy;
    }

    public void setPrivacy(boolean privacy) {
        this.privacy = privacy;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

}
