package com.miniprojet.collaborateurservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CollaborateurResponse {
    private String id;
    private String nom;
    private String adresse;
    private Integer tel;
    private String email;
    private String typeConvention;

}
