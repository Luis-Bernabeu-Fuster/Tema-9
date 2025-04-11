package Ejercicio5;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Double> numero =() -> Math.random();
        System.out.println(numero.get());
    }
}
