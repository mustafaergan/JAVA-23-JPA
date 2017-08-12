package com.mustafaergan.sunucuyonetimi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;


@Entity
public class Server {
	
	@Id
	private int id;
	
	private String name;
	
	private String ip;
	
	@Column(name = "person_id")
	private String personId;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPersonId(String personId) {
		this.personId = personId;
	}
	
	public int getId() {
		return id;
	}
	
	public String getIp() {
		return ip;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPersonId() {
		return personId;
	}
}


