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
@RequestMapping("/api/fournisseur")
public class FournisseurRestApi {
	@Autowired
	FournisseurServiceImp service;
	@PostMapping("/add")
	@ResponseBody
	public Fournisseur add(@RequestBody Fournisseur u) {
		
		return service.addFournisseur(u);
	}
	@GetMapping("/find-all")
	@ResponseBody
	public List<Fournisseur> getAll(){
		
			return service.retrieveAllFournisseurs();
			
	}
	@GetMapping("/find/{id}")
	@ResponseBody
	public Fournisseur retrieveFournisseur(@PathVariable("id") Long id) {
		
		return service.retrieveFournisseur(id);
		
	}
	@DeleteMapping("/remove/{id}")
	@ResponseBody
	public void remove(@PathVariable("id") Long id) {
		service.deleteFournisseur(id);
	}
	@PutMapping("/update")
	@ResponseBody
	public Fournisseur update(@RequestBody Fournisseur u) {
		return service.updateFournisseur(u);
		
	}
	
}
