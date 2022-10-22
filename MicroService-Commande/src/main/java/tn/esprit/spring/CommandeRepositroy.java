package tn.esprit.spring;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CommandeRepositroy extends CrudRepository<Commande, Long>{

}
