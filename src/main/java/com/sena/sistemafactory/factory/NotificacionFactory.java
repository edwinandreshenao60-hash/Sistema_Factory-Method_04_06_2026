package com.sena.sistemafactory.factory;

import com.sena.sistemafactory.implementations.NotificacionEmail;
import com.sena.sistemafactory.implementations.NotificacionSMS;
import com.sena.sistemafactory.implementations.NotificacionWhatsApp;
import com.sena.sistemafactory.interfaces.Notificacion;

public class NotificacionFactory {

    public static Notificacion crearNotificacion(String tipo) {

        if (tipo.equalsIgnoreCase("EMAIL")) {
            return new NotificacionEmail();
        }

        if (tipo.equalsIgnoreCase("SMS")) {
            return new NotificacionSMS();
        }

        if (tipo.equalsIgnoreCase("WHATSAPP")) {
            return new NotificacionWhatsApp();
        }

        throw new IllegalArgumentException(
            "Tipo de notificacion no valido: " + tipo
        );
    }
}