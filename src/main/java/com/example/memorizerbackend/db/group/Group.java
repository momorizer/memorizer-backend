package com.example.memorizerbackend.db.group;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;

import com.example.memorizerbackend.db.user.User;

@Entity
@Table(name = "Batch")
public class Group {
    /**
     * group_id → unique, auto_increment, integer, primary_key, unsigned, not null
        group_name → unique ,string, not null
        group_description → blob
        create_time → time_stamp, default current_timestamp
        update_time → time_stamp, default current_timestamp
        super_admin_id → User.user_id
        group_icon → blob
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer GroupId;

    @Column( unique = true ,nullable = false)
    private String GroupName;

	@Column(columnDefinition = "BLOB")
    private String GroupDescription;

	// @Column(columnDefinition = "datetime")
	@CreationTimestamp
    private Timestamp CreatedTime;

	// @Column(columnDefinition = "datetime")
	@UpdateTimestamp
    private Timestamp UpdatedTime;

    @OneToOne
	private User SuperAdminId;

	@Column(columnDefinition = "BLOB")
	private String GroupIcon;

	//default constructor
	public Group() {
	}
	//constructor when creating or updating  a group
	public Group( String GroupName, String GroupDescription, Timestamp CreatedTime, Timestamp UpdatedTime, String GroupIcon, User SuperAdminId) {
		this.GroupName = GroupName;
		this.GroupDescription = GroupDescription;// optional
		this.CreatedTime = CreatedTime;
		this.UpdatedTime = UpdatedTime;
		this.GroupIcon = GroupIcon; //should make this attribute optional
		this.SuperAdminId = SuperAdminId;
	}

	public Integer getGroupId() {
		return this.GroupId;
	}

	public void setGroupId(Integer GroupId) {
		this.GroupId = GroupId;
	}

	public String getGroupName() {
		return this.GroupName;
	}

	public void setGroupName(String GroupName) {
		this.GroupName = GroupName;
	}

	public String getGroupDescription() {
		return this.GroupDescription;
	}

	public void setGroupDescription(String GroupDescription) {
		this.GroupDescription = GroupDescription;
	}

	public Timestamp getCreatedTime() {
		return this.CreatedTime;
	}

	public void setCreatedTime(Timestamp CreatedTime) {
		this.CreatedTime = CreatedTime;
	}

	public Timestamp getUpdatedTime() {
		return this.UpdatedTime;
	}

	public void setUpdatedTime(Timestamp UpdatedTime) {
		this.UpdatedTime = UpdatedTime;
	}

	public String getGroupIcon() {
		return this.GroupIcon;
	}

	public void setGroupIcon(String GroupIcon) {
		this.GroupIcon = GroupIcon;
    }
    // @OneToOne(cascade = CascadeType.ALL)
    // @JoinColumn(name = "UserId")
	public User getSuperAdminId() {
		return this.SuperAdminId;
    }
    
	public void setSuperAdminId(User SuperAdminId) {
		this.SuperAdminId = SuperAdminId;
	}
    

}