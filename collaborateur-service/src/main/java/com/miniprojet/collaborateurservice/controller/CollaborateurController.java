package com.miniprojet.collaborateurservice.controller;

import com.miniprojet.collaborateurservice.dto.CollaborateurRequest;
import com.miniprojet.collaborateurservice.dto.CollaborateurResponse;
import com.miniprojet.collaborateurservice.model.Collaborateur;
import com.miniprojet.collaborateurservice.service.CollaborateurService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/collaborateur")
@RequiredArgsConstructor
public class CollaborateurController {

    private final CollaborateurService collaborateurService;

    @PostMapping("/addcollaborateur")
    @ResponseStatus(HttpStatus.CREATED)
    public void createCollaborateur(@RequestBody CollaborateurRequest collaborateurRequest){
        collaborateurService.createCollaborateur(collaborateurRequest);
    }

    @GetMapping ("/getcollaborateur")
    @ResponseStatus(HttpStatus.OK)
    public List<CollaborateurResponse> getAllCollaborateurs(){

        return collaborateurService.getAllCollaborateurs();
    }


    @DeleteMapping("/removecollaborateur/{id}")
    @ResponseStatus(HttpStatus.OK)
    private void remove(@PathVariable("id") String id) {
        collaborateurService.DeleteCollaborateur(id);
    }

    @GetMapping("/findcollaborateur/{id}")
    @ResponseBody
    public Collaborateur retrieveCollaborateur(@PathVariable("id") String id) {

        return collaborateurService.retrieveCollaborateur(id);

    }
    @PutMapping("/updatecollaborateur")
    @ResponseBody
    public Collaborateur update(@RequestBody Collaborateur u) {
        return collaborateurService.updateCollaborateur(u);

    }





}
