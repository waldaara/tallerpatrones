package com.mycompany.mavenproject1.factory;

/**
 *
 * @author argen
 */
public class FabricaTarjetaPremium extends FabricaTarjeta{

    @Override
    Tarjeta createTarjeta() {
        return new TarjetaPremium(300, 700);
    }
    
}
