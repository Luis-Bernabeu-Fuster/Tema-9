package Ejercicio6y7;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = List.of(1,2,3,27,28,29,30,31,32,22);
        Predicate<Integer> num =integer -> integer > 25;
        Predicate<Integer> num2 =integer -> integer < 30;
        Predicate<Integer> num3 =integer -> integer == 22;

        System.out.println("Ejercicio 6");
        lista.stream().filter(num).filter(num2).forEach(integer -> System.out.println(integer));

        System.out.println("Ejercicio 7");
        lista.stream().filter(num3).forEach(integer -> System.out.println(integer));
    }
}
