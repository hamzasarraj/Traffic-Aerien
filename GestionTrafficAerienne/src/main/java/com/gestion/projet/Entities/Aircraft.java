package com.gestion.projet.Entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter 
@Setter 
@NoArgsConstructor 
@AllArgsConstructor
public class Aircraft implements Serializable {
	private Long AircraftId;
	private String Immatriculation;
	@Enumerated(EnumType.STRING)
	private CategoryAC categoryAC;
	@OneToOne
	private Vol Vol;
	@ManyToMany
	private Set<User>Users;
}
