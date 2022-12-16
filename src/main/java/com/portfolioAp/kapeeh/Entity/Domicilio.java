package com.portfolioAp.kapeeh.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Domicilio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 45, message = "no cumple con la longitud")
    private String direccionPostal;

    @NotNull
    @Size(min = 1, max = 45, message = "no cumple con la longitud")
    private String localidad;

    @NotNull
    @Size(min = 1, max = 45, message = "no cumple con la longitud")
    private String codigoPostal;

    @NotNull
    @Size(min = 1, max = 45, message = "no cumple con la longitud")
    private String provincia;

    @NotNull
    @Size(min = 1, max = 45, message = "no cumple con la longitud")
    private String pais;
}
