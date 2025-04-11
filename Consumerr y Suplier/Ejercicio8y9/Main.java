package Ejercicio8y9;

import java.util.function.BiConsumer;

public class Main {

    public static void calculos(int a, int b, BiConsumer<Integer,Integer> operacion){
        operacion.accept(a,b);
    }

    public static void main(String[] args) {
        BiConsumer<Integer,Integer> suma = (a, b) -> System.out.println(a+b);
        BiConsumer<Integer,Integer> resta= (a, b) -> System.out.println(a-b);
        BiConsumer<Integer,Integer> division= (a, b) -> System.out.println(a/b);

        suma.accept(-9,7);
        resta.accept(-9,7);
        division.accept(-9,7);
        calculos(-9,7,suma);
    }
}
