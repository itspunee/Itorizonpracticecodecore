package com.itoItTracker.assignment.spring.Dto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class HelperPojoClass {
	
	private Integer ticketId;
	private String category;
	private String subCategory;
	private String subject;
	private String priority;
	private String status;
	private String assignee;
	private String description;
	private String createDateTime;
	private String lastModifiedDateTime;
	
	
	public HelperPojoClass() {
		super();
	}

	public HelperPojoClass(Integer ticketId, String category, String subCategory, String subject, String priority,
			String status, String assignee, String description, String createDateTime, String lastModifiedDateTime) {
		super();
		this.ticketId = ticketId;
		this.category = category;
		this.subCategory = subCategory;
		this.subject = subject;
		this.priority = priority;
		this.status = status;
		this.assignee = assignee;
		this.description = description;
		this.createDateTime = createDateTime;
		this.lastModifiedDateTime = lastModifiedDateTime;
	}
		
	public Integer getTicketId() {
		return ticketId;
	}

	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAssignee() {
		return assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(String createDateTime) {
		this.createDateTime = createDateTime;
	}

	public String getLastModifiedDateTime() {
		return lastModifiedDateTime;
	}

	public void setLastModifiedDateTime(String lastModifiedDateTime) {
		this.lastModifiedDateTime = lastModifiedDateTime;
	}
	
}
