package Otros;

import Interfaces.Volador;

public class Avion implements Volador{

    String Nombre;

    public Avion(String n){

        this.Nombre = n;
        
    }

    @Override
    public String volar(){

        return this.Nombre + " -> Vuela";

    }
    
}
