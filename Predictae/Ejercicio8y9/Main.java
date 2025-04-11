package Ejercicio8y9;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> lista =List.of("Paco","Luis","Marta","Ana","Unai","Lucia");
        Predicate<String> filtro=s -> s.startsWith("A") || s.length()==5;
        Predicate<String> noP=s -> !s.startsWith("P");

        System.out.println("Ejercicio 8");
        lista.stream().filter(filtro).forEach(s -> System.out.println(s));
        System.out.println("\nEjercicio 9");
        lista.stream().filter(noP).forEach(s -> System.out.println(s));
    }
}
