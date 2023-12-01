package com.mycompany.mavenproject1.factory;

/**
 *
 * @author argen
 */
public abstract class FabricaTarjeta {
    
    public Tarjeta emitirTarjeta(){
        
        return createTarjeta();
    }
    
    abstract Tarjeta createTarjeta();
}
