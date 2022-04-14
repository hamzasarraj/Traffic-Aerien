package com.gestion.projet.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gestion.projet.Entities.User;
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
