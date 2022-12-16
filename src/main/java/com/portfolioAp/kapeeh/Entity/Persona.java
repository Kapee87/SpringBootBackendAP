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
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 45, message = "no cumple con la longitud")
    private String Nombre;

    @NotNull
    @Size(min = 1, max = 45, message = "no cumple con la longitud")
    private String Apellido;

    @NotNull
    @Size(min = 1, max = 45, message = "no cumple con la longitud")
    private String FechaNac;

    @NotNull
    @Size(min = 1, max = 45, message = "no cumple con la longitud")
    private String Telefono;

    @NotNull
    @Size(min = 1, max = 45, message = "no cumple con la longitud")
    private String correo;

    @NotNull
    @Size(min = 1, max = 200, message = "no cumple con la longitud")
    private String descripcion;

    @Size(min = 1, max = 45, message = "no cumple con la longitud")
    private String urlFoto;

    @Size(min = 1, max = 45, message = "no cumple con la longitud")
    private String img;

}
