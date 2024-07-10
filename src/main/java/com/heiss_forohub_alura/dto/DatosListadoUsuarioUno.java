package com.heiss_forohub_alura.dto;

import com.heiss_forohub_alura.usuarios.UsuarioUno;

public record DatosListadoUsuarioUno(

        String nombre,
        String email,
        String clave
) {

    // Constructor corregido
    public DatosListadoUsuarioUno(UsuarioUno usuarioUno) {
        this(usuarioUno.getUsername(), usuarioUno.getEmail(), usuarioUno.getContrasena());
    }

    // Métodos override corregidos
    @Override
    public String nombre() {
        return nombre;
    }

    @Override
    public String email() {
        return email;
    }

    @Override
    public String clave() {
        return clave;
    }
}
