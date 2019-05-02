package com.keerthi.defect.application.entities;


//import java.util.List;
//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

//import com.fasterxml.jackson.annotation.JsonProperty;



@Entity
@Table(name="users")
public class User {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	private Long userId;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="role")
	private String role;
	
	@Column(name="user_password")
	private String userPassword;


//	@JsonProperty(access=JsonProperty.Access.WRITE_ONLY)
//	@OneToMany(mappedBy="users" , cascade= CascadeType.ALL, fetch=FetchType.EAGER)
//	private List<Module> module;
	
//	public List<Module> getModule() {
//		return module;
//	}
//
//	public void setModule(List<Module> module) {
//		this.module = module;
//	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

}
