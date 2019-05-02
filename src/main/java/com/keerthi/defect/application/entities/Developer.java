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
@Table(name="developer")
public class Developer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="developer_id")
	private long developerId;
	
	@Column(name="developer_name")
	private String developerName;

	@JsonProperty(access=JsonProperty.Access.WRITE_ONLY)
	@OneToMany(mappedBy="developer" , cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Module> modules;
	
	public List<Module> getModules() {
		return modules;
	}

	public void setModules(List<Module> modules) {
		this.modules = modules;
	}

	public long getDeveloperId() {
		return developerId;
	}

	public void setDeveloperId(long developerId) {
		this.developerId = developerId;
	}

	public String getDeveloperName() {
		return developerName;
	}

	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
	}
	
	
	
}
