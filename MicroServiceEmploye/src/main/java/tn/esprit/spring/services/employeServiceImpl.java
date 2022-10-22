package tn.esprit.spring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.repositories.EmployeRepository;

@Service
public class employeServiceImpl implements employeService{

	@Autowired
	EmployeRepository employeRepository;
	@Override
	public Employe addEmploye(Employe e) {
		return employeRepository.save(e);
	}

	@Override
	public List<Employe> retrieveAllEmployes() {
		List<Employe> employes = new ArrayList<>();
		employeRepository.findAll().forEach(employes::add);
		return employes;
	}

	@Override
	public void deleteEmploye(int id) {
		employeRepository.deleteById(id);
		
	}

	@Override
	public Employe updateEmploye(Employe e) {
		if(employeRepository.existsById(e.getId())) {
			employeRepository.save(e);
		}
		return e;
	}

	@Override
	public Employe retreiveEmploye(int id) {
		return employeRepository.findById(id).get();
	}

}
