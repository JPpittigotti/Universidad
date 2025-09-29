package Animales;

public class Ajolote extends Animales {

    private String color; // color del perro

    public Ajolote(){

    }

    public Ajolote(String n, int e, String h, String g, String a, String raza, String color){
        super(n,e,h,g,a);
        this.color = color;
    }


    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void hacerSonido(){
        System.out.println("*El ajolote suelta burbujas bajo el agua*");
    }

    @Override
    public String toString(){
        return "me llamo " + this.nombre + ", soy un ajolode" + " de color " + this.color + " y tengo " + this.edad;
    }


}
