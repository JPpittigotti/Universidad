package Animales;

public class Ave extends Animales{
    
    private String raza; // raza del perro
    private String color; // color del perro

    public Ave(){

    }

    public Ave(String n, int e, String h, String g, String a, String raza, String color){
        super(n,e,h,g,a);
        this.raza = raza;
        this.color = color;
    }


    public String getRaza() {
        return this.raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void hacerSonido(){
        System.out.println("El gato " + this.nombre + " dice: miau ");
    }

    @Override
    public String toString(){
        return "me llamo " + this.nombre + ", soy un " + this.raza + " de color " + this.color + " y tengo " + this.edad;
    }

}
