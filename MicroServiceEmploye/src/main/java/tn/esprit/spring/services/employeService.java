package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Employe;

public interface employeService {
	Employe addEmploye(Employe e);
	List<Employe> retrieveAllEmployes();
	void deleteEmploye(int id);
	Employe updateEmploye(Employe e);
	Employe retreiveEmploye(int id);
}
