package tn.esprit.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProduitServiceImp {

	@Autowired
	ProduitRepository repoProduit;
	
	public List<Produit> retrieveAllProduits() {
		List<Produit> l= new ArrayList<Produit>();
		
		repoProduit.findAll().forEach(l::add);
		return l;
	}

	public Produit addProduit(Produit u) {
		repoProduit.save(u);
		return u;
	}

	public void deleteProduit(Long id) {
		if(repoProduit.existsById(id)) {
			repoProduit.deleteById(id);
		}
	}

	public Produit updateProduit(Produit u) {
		if(repoProduit.existsById(u.getId())) {
			repoProduit.save(u);
			return u;	
		}
		return null;
	}

	public Produit retrieveProduit(Long id) {
		if(repoProduit.existsById(id)) {
			return repoProduit.findById(id).get();
		}
		return null;
	}
}
