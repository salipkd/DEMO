package com.todo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ToDo {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Integer id;
	private String description;
	private Boolean status;
	public ToDo() {
	}
	
	public ToDo(Integer id, String description, Boolean status) {
		super();
		this.id = id;
		this.description = description;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	
	
}
