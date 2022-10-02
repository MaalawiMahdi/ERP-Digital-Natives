package tn.esprit.spring.repositories;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entites.Role;
import tn.esprit.spring.entites.User;

public interface RoleRepository extends CrudRepository<Role,Integer> {
	public Role findByLibelle(String libelle);

}
