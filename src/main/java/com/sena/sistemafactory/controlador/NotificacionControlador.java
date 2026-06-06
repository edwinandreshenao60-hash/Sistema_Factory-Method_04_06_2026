package com.sena.sistemafactory.controlador;

import com.sena.sistemafactory.servicio.NotificacionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notificaciones")
public class NotificacionControlador {

    @Autowired
    private NotificacionServicio servicio;

    @GetMapping("/{tipo}")
    public String enviar(@PathVariable String tipo) {
        return servicio.enviarNotificacion(tipo);
    }
}