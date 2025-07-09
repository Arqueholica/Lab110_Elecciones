import Elecciones.Methods;
import Elecciones.Partidos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {



        ArrayList<Partidos> list = new ArrayList<>();

        list.add(new Partidos("PSOE", 50));
        list.add(new Partidos("PP", 12));
        list.add(new Partidos("SumarPodemos", 67));
        list.add(new Partidos("VOX", 5));
        list.add(new Partidos("Comunista", 20));


        System.out.println("Los resultados iniciales son: ");
//        Methods.mostrarResultado(list);
//        Methods.limpiarPantalla();
//        Methods.aprietaEnter();
        Methods.barraPorcentaje(list);


    }
}