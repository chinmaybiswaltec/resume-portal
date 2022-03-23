package com.chinmaybiswaltech.models;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name ="User")
@Data
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String userName;
	private String password;
	private String roles;
	private boolean active;

}
