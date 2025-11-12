package com.ipn.mx.administracioneventos.core.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Evento", schema = "public")
public class Evento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //
    @Column(name = "idEvento", nullable = false)
    private Long idEvento;

    @NotEmpty(message = "No puede estar vacío")
    @Column(name = "nombreEvento", length = 200, nullable = false)
    private String nombreEvento;

    @NotEmpty(message = "No puede estar vacío")
    @Column(name = "descripcionEvento", length = 500, nullable = false)
    private String descripcionEvento;

    @NotNull(message = "La fecha no puede ser nulo")
    @FutureOrPresent(message = "La fecha de inicio deberá ser hoy o cualquier fecha del futuro")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    private Date fechaFin;
}
