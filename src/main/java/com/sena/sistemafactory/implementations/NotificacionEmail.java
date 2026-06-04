package com.sena.sistemafactory.implementations;

import com.sena.sistemafactory.interfaces.Notificacion;

public class NotificacionEmail implements Notificacion {

    @Override
    public String enviar() {
        return "Notificacion enviada correctamente por correo electronico";
    }
}