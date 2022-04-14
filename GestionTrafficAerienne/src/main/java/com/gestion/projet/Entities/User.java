package com.gestion.projet.Entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter 
@Setter 
@NoArgsConstructor 
@AllArgsConstructor
public class User implements Serializable {
private Long UserId;
private String Name;  
private Date BirthDate; 
private String Email; 
private String Password;  
@Enumerated(EnumType.STRING)
private CategoryUser categoryUser;
@ManyToMany
private Set<Controller> Controllers;
@ManyToMany
private Set<Aircraft> Aircrafts;
@ManyToOne
private Set<Formation>Formations;
}
