import Animales.*;

public class Main{
    public static void main(String[] args) {
        
        Perro perro1 = new Perro("Firulais", 5, "Casa", "Macho", "Carnívoro", "Labrador", "Marrón", 60.5, 25.0
        );
        Gato gato1 = new Gato("Miau", 3, "Apartamento", "Hembra", "Carnívoro", "Siamés", "Gris", 30.0, 10.0);
        
        Ave ave1 = new Ave("Piolín", 2, "Jaula", "Macho", "Herbívoro", "Canario", "Amarillo");

        Ajolote ajolote1 = new Ajolote("Axel", 1, "Pecera", "Macho", "Omnívoro", "Mexicano", "Verde");

        System.out.println(perro1);
        perro1.hacerSonido();
        System.out.println(gato1);
        gato1.hacerSonido();
        System.out.println(ave1);
        ave1.hacerSonido();
        System.out.println(ajolote1);
        ajolote1.hacerSonido();

    }
}