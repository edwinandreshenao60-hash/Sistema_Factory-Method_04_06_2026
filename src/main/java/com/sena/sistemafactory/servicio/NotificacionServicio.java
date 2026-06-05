package com.sena.sistemafactory.servicio;

import com.sena.sistemafactory.factory.NotificacionFactory;
import com.sena.sistemafactory.interfaces.Notificacion;
import org.springframework.stereotype.Service;

@Service
public class NotificacionServicio {

    public String enviarNotificacion(String tipo) {

        Notificacion notificacion =
            NotificacionFactory.crearNotificacion(tipo);

        return notificacion.enviar();
    }
}