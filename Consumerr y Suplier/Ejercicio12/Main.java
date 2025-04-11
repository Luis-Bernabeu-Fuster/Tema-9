package Ejercicio12;

import java.time.LocalDate;
import java.util.function.Supplier;

public class Main {

    public static Programador fabricaProgramadores(Supplier<Programador> programador, Supplier<LocalDate> fecha) {
        Programador programador1 = programador.get();
        if (programador1.fecha == null && programador.get().salario == 0) {
            programador1.setSalario(0.00);
            programador1.setFecha(fecha.get());
        }
        return programador1;
    }


    public static void main(String[] args) {
        Supplier<LocalDate> fecha =() -> LocalDate.now();
        Supplier<Programador> programador=() -> new Programador("Luis");
        Supplier<Programador> programador1=() -> new Programador("Unai",2000.0, LocalDate.now());

        Programador p = fabricaProgramadores(programador, fecha);
        Programador p1 = fabricaProgramadores(programador1,null);
    }
}
