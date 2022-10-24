package com.projetmicroservice.projetservice.controller;

import com.projetmicroservice.projetservice.dto.ProjetRequest;
import com.projetmicroservice.projetservice.dto.ProjetResponse;
import com.projetmicroservice.projetservice.model.Projet;
import com.projetmicroservice.projetservice.service.ProjetService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/projet")
@RequiredArgsConstructor

public class ProjetController {

    private final ProjetService projetService;

    @PostMapping("/addProjet")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProjet(@RequestBody ProjetRequest projetRequest){
        projetService.createProjet(projetRequest);
    }
    @GetMapping("/getProjet")
    @ResponseStatus(HttpStatus.OK)
    public List<ProjetResponse> getAllProjets(){

        return projetService.getAllProjets();
    }



    @DeleteMapping("/removeProjet/{id}")
    @ResponseStatus(HttpStatus.OK)
    private void remove(@PathVariable("id") String id) {
        projetService.DeleteProjet(id);
    }
    @GetMapping("/findProjet/{id}")
    @ResponseBody
    public Projet retrieveProjet(@PathVariable("id") String id) {

        return projetService.retrieveProjet(id);

    }
    @PutMapping("/updateProjet")
    @ResponseBody
    public Projet update(@RequestBody Projet u) {
        return projetService.updateProjet(u);

    }





}

