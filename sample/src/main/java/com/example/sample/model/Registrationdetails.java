package com.example.sample.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Registrationdetails {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;

	    private String name;
	    private String email;
	    private String password;
	    private String mobile;
	    private String college;
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getCollege() {
			return college;
		}
		public void setCollege(String college) {
			this.college = college;
		}

	    
	    

	}

