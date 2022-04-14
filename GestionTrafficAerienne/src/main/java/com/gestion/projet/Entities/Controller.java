package com.gestion.projet.Entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
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
public class Controller implements Serializable {
	private Long ControllerID;
	private String FirstName;
	private String LastName;
	private Date date;
	@ManyToOne
	private Vol Vols;
	@ManyToMany
	private Set<Notam> Notams;
	@ManyToOne
	private User User;
    @ManyToMany
    private Set<Formation>formations;
}
