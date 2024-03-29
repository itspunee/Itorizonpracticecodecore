package com.youtube.spring.durgesh.payloads;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.youtube.spring.durgesh.entity.User;

@Component
public class UserDto {

	public UserDto() {
		
	}
	
	private int id;
	
	@NotEmpty
	@Size(min = 4,message = "User Name must be minimum of 4 characters")
	private String name;
	
	@Email(message = "Your Email address is not valid")
	private String email;
	
	@NotEmpty
	@Size(min = 4,max = 10,message = "Password must be minimum of 4 char and maximum of 10 char")
	private String password;
	
	@NotEmpty
	private String about;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
		
}
