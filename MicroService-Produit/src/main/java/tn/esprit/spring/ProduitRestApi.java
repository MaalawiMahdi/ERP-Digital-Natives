package tn.esprit.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produit")
public class ProduitRestApi {
	
	@Autowired
	ProduitServiceImp service;
	
	@PostMapping("/add")
	@ResponseBody
	public Produit add(@RequestBody Produit u) {
		return service.addProduit(u);
	}
	
	@GetMapping("/find-all")
	@ResponseBody
	public List<Produit> getAll(){
		return service.retrieveAllProduits();
	}
	
	@GetMapping("/find/{id}")
	@ResponseBody
	public Produit retrieveProduit(@PathVariable("id") Long id) {
		return service.retrieveProduit(id);
	}
	
	@DeleteMapping("/remove/{id}")
	@ResponseBody
	public void remove(@PathVariable("id") Long id) {
		service.deleteProduit(id);
	}
	
	@PutMapping("/update")
	@ResponseBody
	public Produit update(@RequestBody Produit u) {
		return service.updateProduit(u);
	}
	
}
