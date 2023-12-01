/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.decorator;

/**
 *
 * @author david
 */
// Decorador concreto que agrega funcionalidad de envío de SMS
public class NotificacionSMS extends NotificacionDecorator {

    public NotificacionSMS(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public void enviar() {
        super.enviar();
        enviarSMS();
    }

    private void enviarSMS() {
        System.out.println("Enviando notificación por SMS");
    }
}
