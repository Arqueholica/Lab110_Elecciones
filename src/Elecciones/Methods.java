package Elecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Methods {

    public static void barraPorcentaje(ArrayList<Partidos> list){
        char symbol = '█';
        int maxSymbol = 10;


        for(Partidos ps: list){
           int porcentaje =  ps.getPercentage();
            int bloques = Math.round(porcentaje * maxSymbol) / 100;
            String barra = String.valueOf(symbol).repeat(bloques);

//            podría hacer un ifelseo de los porcentajes para que muestren una cantidad de barras acordes ¿con colores?
            System.out.println(ps.getName() + " " + barra + " " + ps.getPercentage());


        }

    }



    public static void mostrarResultado(ArrayList<Partidos> list) {
        for(Partidos ps: list){
            System.out.println(ps);
        }
    }


public static void aprietaEnter(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Para continuar, pulsa ENTER");
    sc.nextLine();
    sc.close();
}

    public static void limpiarPantalla(){
       Scanner sc = new Scanner(System.in);
        System.out.println("Pulsa 'c' para limpiar la pantalla");
        String salir = sc.nextLine();
        if(salir.equalsIgnoreCase("c"));
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
        sc.close();
    }

}
