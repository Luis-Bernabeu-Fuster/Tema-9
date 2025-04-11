package Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= 10; i++){
            lista.add(i);
        }
        Consumer<Integer> list=integer -> System.out.print(integer + " ");
        System.out.print("Introduce un entero: ");
        list.accept(sc.nextInt());
        System.out.println("\n");
        lista.forEach(list);
    }
}
