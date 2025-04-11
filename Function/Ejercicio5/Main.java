package Ejercicio5;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> suma =(integer, integer2) -> integer + integer2;
        System.out.println("Suma 8 + 7 = " + suma.apply(8,7));
    }
}
