package com.gestion.projet.Entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Getter 
@Setter 
@NoArgsConstructor 
@AllArgsConstructor
@ToString
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long UserId;
	@Column(name="Name")
	private String Name;
	private Date BirthDate; 
	@Column(name="Email")
	private String Email; 
	@Column(name="password")
	private String Password;  
	@Enumerated(EnumType.STRING)
	private CategoryUser categoryUser;
	
	public Long getUserId() {
		return UserId;
	}
	public void setUserId(Long userId) {
		UserId = userId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Date getBirthDate() {
		return BirthDate;
	}
	public void setBirthDate(Date birthDate) {
		BirthDate = birthDate;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public CategoryUser getCategoryUser() {
		return categoryUser;
	}
	public void setCategoryUser(CategoryUser categoryUser) {
		this.categoryUser = categoryUser;
	}
	
	
	
}
