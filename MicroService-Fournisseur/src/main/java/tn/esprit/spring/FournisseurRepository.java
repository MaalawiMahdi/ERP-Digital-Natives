package tn.esprit.spring;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FournisseurRepository extends CrudRepository<Fournisseur,Long> {

}
