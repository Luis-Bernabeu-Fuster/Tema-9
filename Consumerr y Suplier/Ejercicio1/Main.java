package Ejercicio1;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        /*
        BiConsumer<Integer,String> bimapa =(n, s) -> System.out.println(n+" "+s);
        bimapa.accept(10,"diez");

        Map<Integer,String> mapa = new HashMap<>();
        mapa.put(1,"Uno");
        mapa.put(2,"Dos");
        mapa.put(3,"Tres");
        mapa.forEach((clave , valor) -> System.out.println("Clave: "+clave+" Valor: "+valor));
        */
        Consumer<String> mensaje = s -> System.out.println(s);
        mensaje.accept("Ejercicio 1");
    }
}
