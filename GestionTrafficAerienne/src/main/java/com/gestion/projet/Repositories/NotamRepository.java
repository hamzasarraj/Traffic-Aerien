package com.gestion.projet.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gestion.projet.Entities.Notam;
@Repository
public interface NotamRepository extends JpaRepository<Notam, Long> {

}
