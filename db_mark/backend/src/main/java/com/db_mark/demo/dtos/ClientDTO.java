package com.db_mark.demo.dtos;

import java.io.Serializable;

import com.db_mark.demo.entities.Client;

public class ClientDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String phone;
	
   public ClientDTO() {}
	
   public ClientDTO(Long id, String name, String phone) {
	    this.id = id;
		this.name = name;
		this.phone = phone;
	}
	
   public ClientDTO(Client entity) {
	    this.id = entity.getId();
		this.name = entity.getName();
		this.phone = entity.getPhone();
	}
   
	public Long getId() {
	    return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
