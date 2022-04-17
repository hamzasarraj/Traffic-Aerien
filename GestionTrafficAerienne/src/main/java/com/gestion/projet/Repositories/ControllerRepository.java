package com.gestion.projet.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gestion.projet.Entities.Controller;

@Repository
public interface ControllerRepository extends JpaRepository<Controller, Long> {

}
