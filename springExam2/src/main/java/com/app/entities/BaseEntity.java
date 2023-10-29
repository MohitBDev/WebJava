package com.app.entities;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass

public class BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private Long Id;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	@Override
	public String toString() {
		return "BaseEntity [Id=" + Id + "]";
	}

	public BaseEntity() {
		super();
	}
	
	
	

}
