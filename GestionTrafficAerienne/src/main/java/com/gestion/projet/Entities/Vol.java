package com.gestion.projet.Entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
public class Vol implements Serializable {
	private Long VolID;
	private String DepartureAP;
	private String DestinationAP;
	private Date DateVol;
	@ManyToOne
	private Controller controller;
	@OneToOne
	private Aircraft aircraft;
}
