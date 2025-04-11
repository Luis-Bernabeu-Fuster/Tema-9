package Ejercicio4;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<String> texto=() -> "Java es un lenguaje";
        System.out.println(texto.get());
    }
}
