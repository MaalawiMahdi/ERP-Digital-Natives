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
@RequestMapping("/api/commande")
public class CommandeRestApi {
	@Autowired
	CommandeServiceImp service;
	@PostMapping("/add")
	@ResponseBody
	public Commande add(@RequestBody Commande u) {
		
		return service.addCommande(u);
	}
	@GetMapping("/find-all")
	@ResponseBody
	public List<Commande> getAll(){
		
			return service.retrieveAllCommandes();
			
	}
	@GetMapping("/find/{id}")
	@ResponseBody
	public Commande retrieveCommande(@PathVariable("id") Long id) {
		
		return service.retrieveCommande(id);
		
	}
	@DeleteMapping("/remove/{id}")
	@ResponseBody
	public void remove(@PathVariable("id") Long id) {
		service.deleteCommande(id);
	}
	@PutMapping("/update")
	@ResponseBody
	public Commande update(@RequestBody Commande u) {
		return service.updateCommande(u);
		
	}
}
