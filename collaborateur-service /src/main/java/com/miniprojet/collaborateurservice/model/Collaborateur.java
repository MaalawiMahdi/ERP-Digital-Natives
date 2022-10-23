package com.miniprojet.collaborateurservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "collaborateur")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Collaborateur {

    @Id
    private String id;
    private String nom;
    private String adresse;
    private Integer tel;
    private String email;
    private String typeConvention;
}
