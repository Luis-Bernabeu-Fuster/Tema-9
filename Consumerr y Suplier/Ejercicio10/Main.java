package Ejercicio10;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> mapa = new LinkedHashMap<>();
        mapa.put(1,"Uno");
        mapa.put(2,"Dos");
        mapa.put(3,"Tres");
        mapa.put(4,"Cuatro");
        mapa.put(5,"Cinco");
        BiConsumer<Integer,String> map =(n, s) -> System.out.println("Clave: "+n+" Valor: "+s);
        mapa.forEach(map);
    }
}
