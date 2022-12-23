package com.portfolioAp.kapeeh.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Proyectos implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProyecto;
    private String nombreProyecto;
    private String fechaProyecto;
    private String descripcionProyecto;
    private String imgProyecto;
    private String urlProyecto;

}
