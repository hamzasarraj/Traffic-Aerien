package com.gestion.projet.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gestion.projet.Entities.Controller;

@Repository
public interface ControllerRepository extends CrudRepository<Controller, Long> {

}
