package com.kelly.ma_ville_propre.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class SignalementRequest {
    private String adresse;
    private String titre;
    private String decription;
    private String categorie;
    private Integer photo;
    private String statut;

}
