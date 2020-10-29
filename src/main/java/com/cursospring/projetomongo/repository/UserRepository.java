package com.cursospring.projetomongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cursospring.projetomongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
