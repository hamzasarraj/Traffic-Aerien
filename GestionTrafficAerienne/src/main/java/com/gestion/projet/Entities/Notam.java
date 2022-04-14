package com.gestion.projet.Entities;

import java.io.Serializable;
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
public class Notam implements Serializable {
	private Long NotamId;
	private String Description;
	@ManyToOne
	private Controller controller;
}
