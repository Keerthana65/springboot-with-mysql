package com.keerthi.defect.application.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="defect")
public class Defect {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="defect_id")
	private Long defectId;
	
	@Column(name="descriptions")
	private String description;
	
	@Column(name="defect_type")
	private String defectType;
	
	@Column(name="severity")
	private String severity;
	
	@Column(name="priority")
	private String priority;
	
	@Column(name="step_recreate")
	private String stepRecreate;
	
	@Column(name="assign_to")
	private String assignTo;
	
	@Column(name="status")
	private String status;
	
	@Column(name="enter_date")
	private String enterDate;
	
	@Column(name="enter_by")
	private String enterBy;
	
	@Column(name="fixed_date")
	private String fixedDate;
	
	@Column(name="fixed_by")
	private String fixedBy;
	
	@Column(name="available_in")
	private String availableIn;
	
	@Column(name="comments")
	private String comments;
	
	@Column(name="module")
	private String module;
	

	
	public String getModule() {
		return module;
	}


	public void setModule(String module) {
		this.module = module;
	}


	public String getStatus() {
		return status;
	}


	public String getAssignTo() {
		return assignTo;
	}


	public void setAssignTo(String assignTo) {
		this.assignTo = assignTo;
	}


	public Long getDefectId() {
		return defectId;
	}
	public void setDefectId(Long defectId) {
		this.defectId = defectId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDefectType() {
		return defectType;
	}
	public void setDefectType(String defectType) {
		this.defectType = defectType;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	
	public String getPriority() {
		return priority;
	}


	public void setPriority(String priority) {
		this.priority = priority;
	}


	public String getStepRecreate() {
		return stepRecreate;
	}
	public void setStepRecreate(String stepRecreate) {
		this.stepRecreate = stepRecreate;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getEnterDate() {
		return enterDate;
	}
	public void setEnterDate(String enterDate) {
		this.enterDate = enterDate;
	}
	public String getEnterBy() {
		return enterBy;
	}
	public void setEnterBy(String enterBy) {
		this.enterBy = enterBy;
	}
	public String getFixedDate() {
		return fixedDate;
	}
	public void setFixedDate(String fixedDate) {
		this.fixedDate = fixedDate;
	}
	public String getFixedBy() {
		return fixedBy;
	}
	public void setFixedBy(String fixedBy) {
		this.fixedBy = fixedBy;
	}
	public String getAvailableIn() {
		return availableIn;
	}
	public void setAvailableIn(String availableIn) {
		this.availableIn = availableIn;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}	
	
}
