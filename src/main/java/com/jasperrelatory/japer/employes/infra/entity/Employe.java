package com.jasperrelatory.japer.employes.infra.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@Table(name = "funcinario")
public class Employe {

    @Column(name = "id_employe")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "primeiro_nome", nullable = false)
    private String firstname;

    @Column(name = "sobrenome", nullable = false)
    private String lastname;

    @Column(name = "idade", nullable = false)
    private int age;

    @CreatedDate
    @Column(name = "data_criacao", nullable = false)
    private Date createdDate;

    @Column(name = "cargo", length = 120, nullable = false)
    private String office;

    @Column(name = "remuneracao_anual", nullable = false)
    private float annual_remuneration;

    public Employe(String firstname, String lastanme, int age, String office, float annual_remuneration) {}
}
