package Animales;

public class Perro extends Animales {

    private String raza; // raza del perro
    private String color; // color del perro
    private double tamaño; // tamaño del peso
    private double peso; // peso del perro

    public Perro(){

    }

    public Perro(String n, int e, String h, String g, String a, String raza, String color, double tamaño, double peso){
        super(n,e,h,g,a);
        this.raza = raza;
        this.color = color;
        this.tamaño = tamaño;
        this.peso = peso;
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

    public double getTamaño() {
        return this.tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public void hacerSonido(){
        System.out.println("El perro " + this.nombre + " dice: gua - gua");
    }

    @Override
    public String toString(){
        return "me llamo " + this.nombre + ", soy de color " + this.color + " y tengo " + this.edad;
    }

}
