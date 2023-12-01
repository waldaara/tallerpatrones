package com.mycompany.mavenproject1.factory;

/**
 *
 * @author argen
 */
public class FabricaTarjetaVIP extends FabricaTarjeta{

    @Override
    Tarjeta createTarjeta() {
        return new TarjetaVIP(500, 1000);
    }
    
}
