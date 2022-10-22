package tn.esprit.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CommandeServiceImp {
	@Autowired
	CommandeRepositroy repoCommande;
	
	public List<Commande> retrieveAllCommandes() {
		List<Commande> l= new ArrayList<Commande>();
		
		repoCommande.findAll().forEach(l::add);
		return l;
		
	}

	public Commande addCommande(Commande u) {
		repoCommande.save(u);
		return u;
		
	}

	public void deleteCommande(Long id) {
		if(repoCommande.existsById(id)) {
			repoCommande.deleteById(id);
		}
		
	}

	public Commande updateCommande(Commande u) {
		if(repoCommande.existsById(u.getId())) {
			repoCommande.save(u);
			return u;
			
		}
		return null;
		
	}

	public Commande retrieveCommande(Long id) {
		if(repoCommande.existsById(id)) {
			return repoCommande.findById(id).get();
		}
		return null;
		
	}

}
