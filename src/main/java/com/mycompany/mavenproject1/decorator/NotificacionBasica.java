/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.decorator;

/**
 *
 * @author david
 */
public class NotificacionBasica implements Notificacion {

    @Override
    public void enviar() {
        System.out.println("Enviando notificación básica");
    }
}
