package CharPractice;

import java.util.Scanner;
/*
1- PRINTAR CARACTERES LETRAS MINUSCULAS

Mediante un bucle de que recorre tipos char, imprime todas las letras minúsculas de la 'a' a la 'z'.
+EXTRA: imprimir las mayúsculas y las minúsculas sin los signos entre medio.

2- PRINTAR CARACTER SEGUN NUMERO

Pides al usuario que escriba un número entre el 33 y el 126, y le muestras el carácter que le corresponde. Ejemplo:
Numero de usuario: 65.  Muestras la A mayúscula.

 */

public class Char {
    public static void main(String[] args) {
/*       Recorrer de la a la z con un bucle tipo char e imprimir en consola
           --> en minúscula
           ---> en mayúscula
 */
    char charmy = 'a';
        for (int i = 0; i < 26; i++) {
            char letra = (char) (charmy + i);
            System.out.println(letra);
        }

        for (int i = 0; i < 26; i++) {
            char mayus = (char)(charmy +i);
            System.out.println(Character.toUpperCase(mayus));

        }

/*       Pedir al usuario un número entre el 33 y el 126, que muestre por consola
            el caracter que le corresponde.

 */
        Scanner sc = new Scanner(System.in);
        char symbol;
        int num;

        System.out.println("Escoge un número del 33 al 126 y descubre un símbolo: ");
        num = sc.nextInt();
        symbol = (char) num;


        System.out.println("El símbolo que corresponde al número " + num + " es: " + symbol);

        sc.close();
        /*
        AUTO EXPLICACIÓN: dos variables: num para pedir y symbol para enseñar.
        Pido num con scanner. CUANDO TENGO EL NUM lo igualo al symbol
                       --> PERO lo tengo que castear para que aparezca el caracter correspondiente
         */
    }
}
