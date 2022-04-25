package com.gestion.projet.Entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
public class Controller implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ControllerID;
	@Column(name="FirstName")
	private String FirstName;
	@Column(name="LastName")
	private String LastName;
	private Date date;
	@OneToMany(mappedBy = "controller", cascade = CascadeType.ALL)
	private Set<Formation> formations;
	@OneToMany(mappedBy = "controller", cascade = CascadeType.ALL)
	private Set<Vol> vols;
   
}
