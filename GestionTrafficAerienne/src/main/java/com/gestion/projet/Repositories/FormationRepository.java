package com.gestion.projet.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gestion.projet.Entities.Formation;

@Repository
public interface FormationRepository extends CrudRepository<Formation, Long> {

}
