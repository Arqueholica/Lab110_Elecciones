import Elecciones.Methods;
import Elecciones.Partidos;

import java.util.ArrayList;
import java.util.Scanner;
/*
2- BARRAS RESULTADOS ELECTORALES

Son las elecciones! Se van a mostrar gráficamente los resultados de cada partido.
Crea una clase Partido con los datos: nombre y porcentaje. Instancia al menos 5 partidos.
Pedir el porcentaje de votos recibido para cada uno de los partidos.
Impide que se escriba un tipo diferente mediante hasNext() (ej: si se pide un entero, usar teclado.hasNextInt() )
Cuando estén introducidos todos los resultados, crear un méthod que muestre barras de resultado para cada uno de los participantes.
Puedes escoger cualquier carácter alfanumérico habitual, como *, o #.

Cuando acabe que pregunte: ¿Actualizar resultados (S/N)? Si dice que sí, limpia el terminal y vuelve a preguntar los resultados.
Si dice que no, limpia el terminal y escribe “hasta la próxima!” y se acaba el programa.
Debe existir una clase Metodos, que contenga los métodos:

- mostrarResultado()

- limpiarPantalla() borra la consola,

- aprietaEnter(). le dice “para seguir, aprieta enter”.

Son en total tres clases: principal, Partido y Metodos.

+EXTRA se pueden añadir controles del tipo: suma la cantidad más del 100% ?
+EXTRA: como controlarías may/min en S/N con tipo char
NOTA: el extended ASCII list (número ascii más de 127) puede dar error, o mostrar resultados diferentes según el sistema operativo o charset empleado.
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);


        ArrayList<Partidos> list = new ArrayList<>();

        list.add(new Partidos("PSOE", 50));
        list.add(new Partidos("PP", 12));



        System.out.println("Los resultados iniciales son: ");
        Methods.mostrarResultado(list);
//        Methods.limpiarPantalla();
//        Methods.aprietaEnter();
//        Methods.barraPorcentaje(list);

String answer;

do{
    System.out.println("BIENVENIDO A LAS ELECCIONES" + "\n" + "¿Qué deseas hacer?");
    System.out.println("Selecciona según los paréntesis");
    System.out.println("Introducir un (P)artido nuevo");
    System.out.println("Introducir (R)esultado de un partido");
    System.out.println("(V)er resultados en porcentaje");
    System.out.println("Ver resultados en (B)arra");
    System.out.println("(S)alir");

    answer = sc.nextLine().toUpperCase();

    switch (answer){
        case "S":
            System.out.println("Gracias por participar. ¡Hasta la próxima!");
            break;
        case "P":
            System.out.println("Introduce el nuevo partido; porcentaje inicial de votos = '0'");
            String name = sc.nextLine();
            list.add(new Partidos(name, 0));
            Thread.sleep(1000);
            System.out.println("Partido introducido con éxito");
            break;
        case "R":
            System.out.println("Introduce el partido del que quieres introducir el porcentaje:");
            String partit = sc.nextLine();
            boolean find = false;

            for(Partidos ps: list){
               if(ps.getName().equalsIgnoreCase(partit)){
                   find = true;
                   System.out.println("Introduce el porcentaje:");
                   int newPercent = sc.nextInt();
                   sc.nextLine();
                   ps.setPercentage(newPercent);
               }
            }
            if(!find){
                System.out.println("Partido no encontrado");
            }
            break;
        case "V":
            System.out.println("Estos son los resultados por porcentaje:");
            Methods.mostrarResultado(list);
            break;
        case "B":
            System.out.println("Estos son los resultados en barra");
            Methods.barraPorcentaje(list);
            break;
        default:
            System.out.println("Por favor, selecciona una opción válida");
            break;
    }

}while(!answer.equalsIgnoreCase("s"));

        Methods.limpiarPantalla();

sc.close();
    }
}