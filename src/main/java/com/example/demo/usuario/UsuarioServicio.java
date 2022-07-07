package com.example.demo.usuario;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UsuarioServicio {

    public List<Usuario> getUsuario(){

        return List.of(
                new Usuario(
                        1,
                        "Mathias",
                        "Velazquez",
                        42726124
                )
        );

    }

}
