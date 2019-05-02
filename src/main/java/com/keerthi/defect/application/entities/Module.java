package com.keerthi.defect.application.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="module")
public class Module{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="module_id")
	private Long moduleId;
	
	@Column(name="module_name")
	private String moduleName;
	
	@ManyToOne
	@JoinColumn(name="project_id", nullable=false)
	private Project project;
	
	
//	@ManyToOne
//	@JoinColumn(name="user_id", nullable=false)
//	private User users;

	
	@ManyToOne
	@JoinColumn(name="developer_id" , nullable=false)
	private Developer developer;
	
	
	public Developer getDeveloper() {
		return developer;
	}

	public void setDeveloper(Developer developer) {
		this.developer = developer;
	}
	

	public Long getModuleId() {
		return moduleId;
	}

	public void setModuleId(Long moduleId) {
		this.moduleId = moduleId;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	
}
