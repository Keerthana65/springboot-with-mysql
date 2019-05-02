package com.keerthi.defect.application.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="project")
public class Project {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="project_id")
	private Long projectId;
	
	@Column(name="project_name")
	private String projectName;
	
	@JsonProperty(access=JsonProperty.Access.WRITE_ONLY)
	@OneToMany(mappedBy="project", cascade= CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Module> module;
		
	
	public List<Module> getModule() {
		return module;
	}
	public void setModule(List<Module> module) {
		this.module = module;
	}
	public Long getProjectId() {
		return projectId;
	}
	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	

}
