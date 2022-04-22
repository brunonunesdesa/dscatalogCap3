package com.devsuperior.dscatalog.entities;

import java.io.Serializable;

import java.util.Objects;

public class Category implements Serializable{

	/**
	 *
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long Id;
	private String name;
	
	public Category() {
		
	}

	public Category(Long id, String name) {
		Id = id;
		this.name = name;
	}
	
	

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		return Objects.equals(Id, other.Id) && Objects.equals(name, other.name);
	}
	
	
	
}
