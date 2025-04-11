package Ejercicio11_12;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("Magos","Elfos Oscuros","Barbaros","Piratas");

        BiFunction<String,Integer,String> compara =(s, integer) -> {
            if (s.length() > integer){
                return s;
            }else {
                return null;
            }
        };
        BiFunction<String,String,String> compara2=(s, s2) -> {
          if (s.startsWith(s2)){
              return s;
          }else {
              return null;
          }
        };

        System.out.println("Ejercicio 11: ");
        lista.stream()
                .forEach(s -> System.out.print(compara.apply(s,7) + " "));

        System.out.println("\n" + "\nEjercicio 12: ");
        lista.stream()
                .forEach(s -> System.out.print(compara2.apply(s,"E") + " "));
    }
}
