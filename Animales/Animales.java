package Animales;


public abstract class Animales {

    protected String nombre; // nombre del animal
    protected int edad; // edad del animal
    protected String habitat; // hábitat del animal (terrestre, acuático, aéreo)
    protected String genero; // género del animal
    protected String alimentacion; // tipo de alimentación del animal (herbívoro, carnívoro, omnívoro)


    protected Animales(){
        
    }

    protected Animales(String nombre, int edad, String habitat, String genero, String alimentacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.alimentacion = alimentacion;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return this.habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlimentacion() {
        return this.alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }


    protected abstract void hacerSonido();
}
