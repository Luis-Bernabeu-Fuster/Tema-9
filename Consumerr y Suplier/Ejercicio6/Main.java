package Ejercicio6;

import java.util.HashMap;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<HashMap<String,String>> crearMapa =() -> new HashMap<>();
        HashMap<String, String> mapa = crearMapa.get();
        mapa.put("Uno","Cien");
        mapa.put("Dos","Doscientos");
        mapa.put("Tres", "Trescientos");
        System.out.println(mapa);
    }
}
