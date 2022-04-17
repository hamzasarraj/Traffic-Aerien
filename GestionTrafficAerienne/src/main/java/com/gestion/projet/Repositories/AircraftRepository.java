package com.gestion.projet.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gestion.projet.Entities.Aircraft;
@Repository
public interface AircraftRepository extends JpaRepository<Aircraft,Long> {

}
