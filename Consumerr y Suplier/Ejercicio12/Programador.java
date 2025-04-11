package Ejercicio12;

import java.time.LocalDate;

public class Programador {
    String nombre;
    double salario;
    LocalDate fecha;

    public Programador(String nombre, double salario, LocalDate fecha) {
        this.nombre = nombre;
        this.salario = salario;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Programador(String nombre) {
        this.nombre = nombre;
    }
}
