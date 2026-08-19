package com.kelly.ma_ville_propre.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "citoyen")

public class Citoyen {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private String nom;
    private String email;
    private String password;

}
