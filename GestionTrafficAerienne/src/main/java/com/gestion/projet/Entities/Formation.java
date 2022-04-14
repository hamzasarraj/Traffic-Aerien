package com.gestion.projet.Entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
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
public class Formation implements Serializable {
private Long FormationID;
private String Type;
private Date dateFormation;
@ManyToOne
private Controller Controller;
@ManyToOne
private User user;
}
