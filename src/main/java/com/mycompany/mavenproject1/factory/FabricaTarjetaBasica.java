package com.mycompany.mavenproject1.factory;

/**
 *
 * @author argen
 */
public class FabricaTarjetaBasica extends FabricaTarjeta {

    @Override
    Tarjeta createTarjeta() {
        return new TarjetaBasica(100, 500);
    }
    
}
