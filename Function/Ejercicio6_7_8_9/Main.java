package Ejercicio6_7_8_9;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static String ejercicio9(int n1, int n2 ){
        BiFunction<Integer,Integer,Double> potencia =(integer, integer2) -> Math.pow(integer,integer2);
        Function<Double,String> metodo9 = aDouble -> "Resultado: " + String.valueOf(aDouble);
         return metodo9.apply(potencia.apply(n1,n2));
    }
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Double> potenciaMath =(integer, integer2) ->  Math.pow(integer,integer2);
        System.out.println("Ejercicio 6:");
        System.out.println(potenciaMath.apply(3,5));

        Function<Double, String> textnum =aDouble ->"Resultado: "  + String.valueOf(aDouble);
        System.out.println("\nEjercicio 7:");
        System.out.println(textnum.apply(12.76));

        System.out.println("\nEjercicio 8:");
        System.out.println(textnum.apply(potenciaMath.apply(2,4)));

        System.out.println("\nEjercicio 9:");
        System.out.println(ejercicio9(2,4));
    }
}
