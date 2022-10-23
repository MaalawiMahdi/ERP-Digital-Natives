package com.miniprojet.collaborateurservice.service;

import com.miniprojet.collaborateurservice.dto.CollaborateurRequest;
import com.miniprojet.collaborateurservice.dto.CollaborateurResponse;
import com.miniprojet.collaborateurservice.model.Collaborateur;
import com.miniprojet.collaborateurservice.repository.CollaborateurRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java.util.List;


@Service
@RequiredArgsConstructor
@Slf4j
public class CollaborateurService {


    private final CollaborateurRepository collaborateurRepository;




    public void createCollaborateur(CollaborateurRequest collaborateurRequest){
        Collaborateur collaborateur = Collaborateur.builder()
                .nom(collaborateurRequest.getNom())
                .adresse(collaborateurRequest.getAdresse())
                .tel(collaborateurRequest.getTel())
                .email(collaborateurRequest.getEmail())
                .typeConvention(collaborateurRequest.getTypeConvention())
                .build();

        collaborateurRepository.save(collaborateur);
        log.info("Collaborateur " + collaborateur.getId() +"is saved");


    }

    public List<CollaborateurResponse> getAllCollaborateurs() {
        List<Collaborateur> collaborateurs = collaborateurRepository.findAll();

        return collaborateurs.stream().map(collaborateur -> mapToCollaborateurResponse(collaborateur)).collect(Collectors.toList());
    }

    private CollaborateurResponse mapToCollaborateurResponse(Collaborateur collaborateur) {
        return CollaborateurResponse.builder()
                .id(collaborateur.getId())
                .nom(collaborateur.getNom())
                .adresse(collaborateur.getAdresse())
                .tel(collaborateur.getTel())
                .email(collaborateur.getEmail())
                .typeConvention(collaborateur.getTypeConvention())
                .build();
    }

    public void DeleteCollaborateur (String id){
        collaborateurRepository.deleteById(id);
    }

    public Collaborateur retrieveCollaborateur(String id) {
        if(collaborateurRepository.existsById(id)) {
            return collaborateurRepository.findById(id).get();
        }
        return null;

    }



    public Collaborateur updateCollaborateur(Collaborateur u) {
        if(collaborateurRepository.existsById(u.getId())) {
            collaborateurRepository.save(u);
            return u;

        }
        return null;

    }


}

