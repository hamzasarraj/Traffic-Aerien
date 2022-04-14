package com.gestion.projet.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gestion.projet.Entities.Aircraft;
@Repository
public interface AircraftRepository extends CrudRepository<Aircraft,Long> {

}
