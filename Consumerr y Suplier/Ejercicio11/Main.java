package Ejercicio11;

import java.time.LocalDate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<LocalDate> hora =() -> LocalDate.now();

        System.out.println(hora.get());
    }
}
