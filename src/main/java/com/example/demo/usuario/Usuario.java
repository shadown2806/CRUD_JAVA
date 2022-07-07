package com.example.demo.usuario;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Setter
@Getter
@ToString
@Entity
@Table
public class Usuario {



    public Usuario(Integer id, String nombre, String apellido, Integer DNI) {
        this.id = id;
        Nombre = nombre;
        Apellido = apellido;
        this.DNI = DNI;
    }

    @Id
    @SequenceGenerator(
            name = "secuencia_usuario",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator =  "secuencia_usuario"
    )
    private Integer id;

    private String Nombre;

    private String Apellido;

    private Integer DNI;

    public Usuario() {

    }
}
