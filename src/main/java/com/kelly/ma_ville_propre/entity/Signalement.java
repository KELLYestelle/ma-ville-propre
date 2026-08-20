package com.kelly.ma_ville_propre.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="signalements")

public class Signalement{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String titre;
    private String description;
    private String adresse;
    private int lat;
    private int lng;
    private String statut;
    private int photo;

}

