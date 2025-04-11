package Ejercicio1_2_3;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> longi =s -> s.length();
        System.out.println("Ejercicio 1:");
        System.out.println("Longitud de la cadena Programación: " + longi.apply("Programación"));

        Function<Integer,Integer> potencia2 =integer -> integer*integer;
        System.out.println("\nEjercicio 2:");
        System.out.println("Potencia de 4: " + potencia2.apply(4));

        System.out.println("\nEjercicio 3:");
        System.out.println(potencia2.apply(longi.apply("Programación")));
    }
}