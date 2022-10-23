package com.miniprojet.collaborateurservice.repository;

import com.miniprojet.collaborateurservice.model.Collaborateur;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CollaborateurRepository extends MongoRepository<Collaborateur, String> {


}
