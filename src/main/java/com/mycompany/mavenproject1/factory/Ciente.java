/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.factory;

/**
 *
 * @author argen
 */
public class Ciente {
    public static void main(String[] args) {
        FabricaTarjeta ft = new FabricaTarjetaBasica();
        Tarjeta t = ft.emitirTarjeta();
        System.out.println(t.costo +","+t.limiteCrediticio);
        
        FabricaTarjeta ft2 = new FabricaTarjetaPremium();
        Tarjeta t2 = ft2.emitirTarjeta();
        System.out.println(t2.costo +","+t2.limiteCrediticio);
        
        FabricaTarjeta ft3 = new FabricaTarjetaVIP();
        Tarjeta t3 = ft3.emitirTarjeta();
        System.out.println(t3.costo +","+t3.limiteCrediticio);
    }
}
