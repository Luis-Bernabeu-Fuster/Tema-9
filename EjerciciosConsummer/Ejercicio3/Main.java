package Ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Peras");
        lista.add("Platanos");
        lista.add("Jamón");
        lista.add("Crema");
        lista.add("Neskuik");
        lista.add("Leche");
        lista.add("Vinagre");
        lista.add("Uva");
        lista.add("Arroz");
        lista.add("Pan");

        Consumer<String> letras = letra -> System.out.print(letra.substring(letra.length()-1) + " ");
        lista.forEach(letras);
    }
}
