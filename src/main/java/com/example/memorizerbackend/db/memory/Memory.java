package com.example.memorizerbackend.db.memory;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Blob;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Memory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer MemoryId;

    private Integer CreatedBy;

    private Integer CreatedFor;

    private String Title;

    private String Content;

    private String Photo;

    private boolean Privacy;

    @CreationTimestamp
    private Timestamp CreateTime;

    @UpdateTimestamp
    private Timestamp UpdateTime;

    //Default constructor
    public Memory(){

    }

    public Memory(Integer CreatedBy,Integer CreatedFor,String Title){
        this.CreatedBy = CreatedBy;
        this.CreatedFor = CreatedFor;
        this.Title = Title;
    }


    public Integer getMemoryId() {
        return MemoryId;
    }

    public void setMemoryId(Integer memoryId) {
        MemoryId = memoryId;
    }

    public Integer getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(Integer createdBy) {
        CreatedBy = createdBy;
    }

    public Integer getCreatedFor() {
        return CreatedFor;
    }

    public void setCreatedFor(Integer createdFor) {
        CreatedFor = createdFor;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String photo) {
        Photo = photo;
    }

    public boolean getPrivacy() {
        return Privacy;
    }

    public void setPrivacy(boolean privacy) {
        Privacy = privacy;
    }

    public Timestamp getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Timestamp createTime) {
        CreateTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return UpdateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        UpdateTime = updateTime;
    }

}
