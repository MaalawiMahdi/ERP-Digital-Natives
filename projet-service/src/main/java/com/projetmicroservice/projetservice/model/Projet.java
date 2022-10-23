package com.projetmicroservice.projetservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "projet")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Projet {

    @Id
    private String id;
    private String libelle;
    private String etat;

}
