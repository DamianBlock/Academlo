import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /* Ejercicio 1: Creando variables

        Crea variables para guardar los siguientes datos de una persona:
        Nombre
        Apellidos
        Edad
        Ciudad

        Asignar valores a las variables creadas. */

        var Nombre = "Damian";
        var Apellidos = "Juarez";
        var edad = 34;
        var ciudad = "San Miguel de Tucumán";

        System.out.println(Nombre + " " + Apellidos + " " + edad + " " + ciudad );



        /* Ejercicio 2: Sumando los valores de un arreglo

        Crear un array con 3 valores numericos y sumar todos esos valores accedendolos mediante las posiciones. */

        int [] arreglo = {10, 22, 34};

        int suma =  arreglo[0]  + arreglo[1] + arreglo[2];

        System.out.println(suma);



    }
}