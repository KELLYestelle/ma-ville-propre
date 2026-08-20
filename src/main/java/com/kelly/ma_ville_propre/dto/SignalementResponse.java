package com.kelly.ma_ville_propre.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor


public class SignalementResponse {
    private String id;
    private String nom;
    private  String categorie;
    private String status;

}
