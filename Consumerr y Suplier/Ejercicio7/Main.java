package Ejercicio7;

import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> multiplica =(a, b) -> System.out.println(a*b);
        multiplica.accept(-9,7);
    }
}
