package com.gestion.projet.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gestion.projet.Entities.Vol;
@Repository
public interface VolRepository extends CrudRepository<Vol,Long>{

}
