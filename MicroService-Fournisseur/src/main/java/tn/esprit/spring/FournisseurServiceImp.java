package tn.esprit.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class FournisseurServiceImp {
    
	@Autowired
	FournisseurRepository repoFournisseur;
	
	public List<Fournisseur> retrieveAllFournisseurs() {
		List<Fournisseur> l= new ArrayList<Fournisseur>();
		
		repoFournisseur.findAll().forEach(l::add);
		return l;
		
	}

	public Fournisseur addFournisseur(Fournisseur u) {
		repoFournisseur.save(u);
		return u;
		
	}

	public void deleteFournisseur(Long id) {
		if(repoFournisseur.existsById(id)) {
			repoFournisseur.deleteById(id);
		}
		
	}

	public Fournisseur updateFournisseur(Fournisseur u) {
		if(repoFournisseur.existsById(u.getId())) {
			repoFournisseur.save(u);
			return u;
			
		}
		return null;
		
	}

	public Fournisseur retrieveFournisseur(Long id) {
		if(repoFournisseur.existsById(id)) {
			return repoFournisseur.findById(id).get();
		}
		return null;
		
	}

}
