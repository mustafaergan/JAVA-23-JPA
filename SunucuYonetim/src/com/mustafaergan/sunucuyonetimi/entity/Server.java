package com.mustafaergan.sunucuyonetimi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;


@Entity(name="sunucu")
public @Data  class Server {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String ip;
	
	@ManyToOne
	Person assigneePerson;

}


