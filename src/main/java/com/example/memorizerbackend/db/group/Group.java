package com.example.memorizerbackend.db.group;

import com.example.memorizerbackend.db.user.User;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

import javax.persistence.*;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name = "Batch")
public class Group {
    /**
     * group_id → unique, auto_increment, integer, primary_key, unsigned, not null
        group_name → unique ,string, not null
        group_description → blob
        create_time → time_stamp, default current_timestamp
        update_time → time_stamp, default current_timestamp
        super_Admin_id → User.user_id
        group_icon → blob
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer groupId;

    @Column( unique = true ,nullable = false)
    private String groupName;

	@Column(columnDefinition = "BLOB")
    private String groupDescription;

	// @Column(columnDefinition = "datetime")
	@CreationTimestamp
    private Timestamp createdTime;

	// @Column(columnDefinition = "datetime")
	@UpdateTimestamp
    private Timestamp updatedTime;

	@ManyToOne
	private User superAdmin;
	// @OneToOne
	// @JoinColumn( name="UserId" , nullable=false)
	// private User SuperAdminId;

	public User getSuperAdmin() {
		return superAdmin;
	}

	public void setSuperAdmin(User superAdmin) {
		this.superAdmin = superAdmin;
	}

	@Column(columnDefinition = "BLOB")
	private String groupIcon;

	//default constructor
	public Group() {
	}
//	public Group(String groupName) {
//		this.groupName = groupName;
//	}

	public Group(String groupName, User superAdmin) {
		this.groupName = groupName;
		this.superAdmin = superAdmin;
	}

	public Integer getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Integer GroupId) {
		this.groupId = GroupId;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String GroupName) {
		this.groupName = GroupName;
	}

	public String getGroupDescription() {
		return this.groupDescription;
	}

	public void setGroupDescription(String GroupDescription) {
		this.groupDescription = GroupDescription;
	}

	public Timestamp getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Timestamp CreatedTime) {
		this.createdTime = CreatedTime;
	}

	public Timestamp getUpdatedTime() {
		return this.updatedTime;
	}

	public void setUpdatedTime(Timestamp UpdatedTime) {
		this.updatedTime = UpdatedTime;
	}

	public String getGroupIcon() {
		return this.groupIcon;
	}

	public void setGroupIcon(String GroupIcon) {
		this.groupIcon = GroupIcon;
    }    

}