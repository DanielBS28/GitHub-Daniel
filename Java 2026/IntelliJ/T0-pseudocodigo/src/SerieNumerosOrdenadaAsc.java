import java.util.Scanner;

public class SerieNumerosOrdenadaAsc {

    static void main() {

        /*Realizar un algoritmo que lea una serie de números enteros y verifique si están ordenados ascendentemente o no, informando con un mensaje. La serie finalizará cuando se introduzca un cero.*/

        /*
         * CASOS DE PRUEBA - Ejercicio 2 (Serie ordenada hasta 0)
         * 1. Ideal (Ascendente):    2 -> 5 -> 9 -> 14 -> 0      => ESTÁ ordenada
         * 2. Ruptura de orden:      4 -> 10 -> 7 -> 15 -> 0     => NO está ordenada
         * 3. Números repetidos:     3 -> 3 -> 8 -> 8 -> 12 -> 0 => ESTÁ ordenada
         * 4. Incluye negativos:    -10 -> -4 -> -1 -> 3 -> 0    => ESTÁ ordenada
         * 5. Centinela inmediato:   0                           => Serie vacía
         */

        int num;
        boolean ordenado = true;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime un número, acabaremos cuando sea 0:");
        num = teclado.nextInt();
        int numAux = num;

        String cadena = num + "";


        while (num != 0){

            if(num < numAux)
                ordenado = false;
            cadena += ", "+ num;

            numAux = num;

            System.out.println("Dime otro número, acabaremos cuando sea 0:");
            num = teclado.nextInt();
        }


        if(cadena.equals(0 + ""))
            System.out.println("La lista está vacía");
        else {
            System.out.print("La lista: " + cadena);
            if (ordenado)
                System.out.println(" está ordenada");
            else
                System.out.println(" está desordenada");

        }
    }
}
