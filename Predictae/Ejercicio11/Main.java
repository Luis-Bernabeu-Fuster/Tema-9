package Ejercicio11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static class Ciudad {
        String nombre;
        int numHab;

        public Ciudad(String nombre, int numHab) {
            this.nombre = nombre;
            this.numHab = numHab;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getNumHab() {
            return numHab;
        }

        public void setNumHab(int numHab) {
            this.numHab = numHab;
        }

        @Override
        public String toString() {
            return "Ciudad{" +
                    "nombre='" + nombre + '\'' +
                    ", numHab=" + numHab +
                    '}';
        }
    }

    public static void imprime(List lista){
        Predicate<Ciudad> empiezaE =ciudad -> ciudad.getNombre().startsWith("E");
        Predicate<Ciudad> numhab =ciudad -> ciudad.getNumHab() >= 100000;

        lista.stream().filter(empiezaE).filter(numhab).forEach(o -> System.out.println(o.toString()));
    }
    public static void main(String[] args) {
        List<Ciudad> lista = Arrays.asList(new Ciudad("Barcelona",1000000)
                                            ,new Ciudad("Alicante",400000)
                                            ,new Ciudad("Michigan",150000)
                                            ,new Ciudad("Estanbul",500000)
                                            ,new Ciudad("Jerusalen",50000)
                                            ,new Ciudad("Japón",1000)
                                            ,new Ciudad("El Cairo",10000)
                                            ,new Ciudad("Elche",202000)
                                            ,new Ciudad("Paris",5)
                                            ,new Ciudad("Elda",400000));

        imprime(lista);
    }
}
