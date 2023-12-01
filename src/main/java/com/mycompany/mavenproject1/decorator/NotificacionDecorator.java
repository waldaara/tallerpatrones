/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.decorator;

/**
 *
 * @author david
 */
// Clase decoradora abstracta
public abstract class NotificacionDecorator implements Notificacion {

    protected Notificacion notificacion;

    public NotificacionDecorator(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    @Override
    public void enviar() {
        notificacion.enviar();
    }
}
