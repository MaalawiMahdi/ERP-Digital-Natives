package com.projetmicroservice.projetservice.repository;

import com.projetmicroservice.projetservice.model.Projet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProjetRepository extends MongoRepository<Projet, String> {


}
