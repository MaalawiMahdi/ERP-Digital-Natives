package com.projetmicroservice.projetservice.service;


import com.projetmicroservice.projetservice.dto.ProjetRequest;
import com.projetmicroservice.projetservice.dto.ProjetResponse;
import com.projetmicroservice.projetservice.model.Projet;
import com.projetmicroservice.projetservice.repository.ProjetRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProjetService {


    private final ProjetRepository projetRepository;




    public void createProjet(ProjetRequest projetRequest){
        Projet projet = Projet.builder()
                .libelle(projetRequest.getLibelle())
                .etat(projetRequest.getEtat())
                .build();

      projetRepository.save(projet);
        log.info("Projet " + projet.getId() +"is saved");


    }
    public List<ProjetResponse> getAllProjets() {
        List<Projet> projets = projetRepository.findAll();

        return projets.stream().map(projet -> mapToProjetResponse(projet)).collect(Collectors.toList());
    }

    private ProjetResponse mapToProjetResponse(Projet projet) {
        return ProjetResponse.builder()
                .id(projet.getId())
                .libelle(projet.getLibelle())
                .etat(projet.getEtat())
                .build();
    }

    public void DeleteProjet (String id){
         projetRepository.deleteById(id);
    }

    public Projet retrieveProjet(String id) {
        if(projetRepository.existsById(id)) {
            return projetRepository.findById(id).get();
        }
        return null;

    }



    public Projet updateProjet(Projet u) {
        if(projetRepository.existsById(u.getId())) {
            projetRepository.save(u);
            return u;

        }
        return null;

    }


}