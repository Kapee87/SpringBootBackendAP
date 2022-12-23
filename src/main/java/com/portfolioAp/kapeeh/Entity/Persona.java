package com.portfolioAp.kapeeh.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
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
    @Size(min = 1, max = 500, message = "no cumple con la longitud")
    private String descripcion;

    @Size(min = 1, max = 45, message = "no cumple con la longitud")
    private String urlFoto;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEdu")
    private List<Educacion> educationList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExp")
    private List<Experiencia> experienciaList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idSkill")
    private List<Skills> skillsList;

}
