import java.util.Scanner;

public class NumeroOrdenado {

    /*
    * Dado un número indicar si está ordenado. Un número está ordenado cuando el dígito que tiene a la derecha es mayor que él.
    * */

    /*
     * CASOS DE PRUEBA - Ejercicio 3 (Número ordenado: dígito derecho > dígito izquierdo)
     *
     * 1. Orden estricto:        1358      => ESTÁ ordenado (1 < 3 < 5 < 8)
     * 2. Desordenado:           1425      => NO está ordenado (4 > 2 rompe el orden)
     * 3. Dígitos repetidos:     1337      => NO está ordenado (3 no es mayor que 3)
     * 4. Orden descendente:     8531      => NO está ordenado
     * 5. Un solo dígito:        7         => ESTÁ ordenado (caso base válido)
     * 6. Número negativo:      -246       => ESTÁ ordenado (se evalúa como 246)
     */

    static void main() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número y te diré si está ordenado");
        int num = teclado.nextInt();
        boolean ordenado = true;

        int digitoDerecha, digitoIzquierda;

        if(num < 0)
            num *= -1;

        if(num < 10)
            System.out.println("El número está ordenado");
        else {

            /*En el while tenía esto, estaba mal ya que generaba un 0 al final que no existía al quedar un digito.
                digitoDerecha = num % 10;
                 num /= 10;
                digitoIzquierda = num % 10;
                */

            //Sacar el último número, así luego no tengo que sacar en el while dos números por iteración
            digitoDerecha = num %10;
            num /= 10;

            while (num != 0 && ordenado) {

                digitoIzquierda= num % 10;

                if (digitoIzquierda >= digitoDerecha)
                    ordenado = false;

                digitoDerecha = digitoIzquierda;
                num /= 10;
            }

            if (ordenado)
                System.out.println("El número está ordenado.");
            else
                System.out.println("El número NO está ordenado.");
            }
        }
        }
