import java.util.Scanner;

public class NumeroProductosDigitosPares {

    static void main() {

        //Dado un número calcular el producto de los dígitos pares.


        int producto = 1, digito = 0;
        boolean digitoParEncontrado = false;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el número");
        int num = teclado.nextInt();

        if(num < 0)
            num *= -1;

        int numAux = num;

        while(num != 0){

            digito = num%10;
            if(digito%2 == 0 && digito != 0) {
                producto *= digito;
                digitoParEncontrado = true;
            }
            num /=10;
        }

        if(digitoParEncontrado)
            System.out.println("El producto de los pares de " + numAux +" es: " + producto);
        else
            System.out.println("No tiene digitos pares o es el 0");

    }
}
