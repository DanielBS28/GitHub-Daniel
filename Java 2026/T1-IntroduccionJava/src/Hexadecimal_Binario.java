public class Hexadecimal_Binario {


    static void main() {

        byte num = 0x01; //Guarda el 1
        // byte num1 = 0x81; ERROR
        /*
         Cualquier número que escribas sin un sufijo especial (como 0x81, 10 o 500) se interpreta automáticamente como un int.

         Los procesadores modernos manejan datos de 32 o 64 bits de forma nativa. Usar un int es físicamente más rápido para la CPU que procesar un byte.

         El error ocurre porque 0x81 (129) en un sistema de tipo con signo excede el valor positivo máximo de un byte (127 o 0x7F). El compilador rechaza la asignación directa o hace un desbordamiento interpretándolo como un número negativo, por lo que necesitas usar una conversión explícita (byte).
         */
        byte num1 = (byte) 0x81; //Ahora sí
        /*
        Al hacer el casting (conversión explícita), le estás diciendo al compilador: "Sé lo que hago, asumo el riesgo y acepto perder información". El compilador confía en tu orden, apaga la alerta de seguridad y fuerza el valor dentro de la variable.

        Como el primer bit de esos 8 bits es un 1 (10000001), el sistema lo interpreta como un número negativo (debido al sistema de complemento a dos).

        En los tipos de datos con signo (Signed), el prefijo 7 en hexadecimal indica que el primer bit (el bit de signo) está en 0, lo que significa que el número es positivo. Es el valor más alto posible antes de que el número se vuelva negativo.

        0x7F
        ➡️ Es el último positivo de un Byte (8 bits).Equivale a 127 en decimal.Si sumas 1 (0x80), se convierte en -128.

        0x7FFF
        ➡️ Es el último positivo de un Short o entero corto (16 bits).Equivale a 32,767 en decimal.Si sumas 1 (0x8000), se convierte en -32,768.

        0x7FFFFFFF
        ➡️ Es el último positivo de un Int o entero estándar (32 bits).Equivale a 2,147,483,647 en decimal.Si sumas 1 (0x80000000), ocurre un desbordamiento al negativo más bajo.
         */

        int num1_2 = 0x81; //En este caso sería como 129, equivale a 00000081 rellenó con ceros.

        //En los int, si se pone un número negativo no hay problema, no hace falta hacer casting

        int negativo2 = 0xFFFFFFF7; //-9
        System.out.println(negativo2);

        //Para los binarios:

        // --- NÚMEROS POSITIVOS ---

        // El número 129 que analizamos (positivo porque el bit 32 de la izquierda es 0)
        int positivo129 = 0b00000000_00000000_00000000_10000001;
        System.out.println("Positivo 129: " + positivo129);

        // El límite máximo positivo de un int (0x7FFFFFFF)
        // El primer bit es 0, todos los demás son 1
        int maximoIntPositivo = 0b01111111_11111111_11111111_11111111;
        System.out.println("Máximo Positivo (2,147,483,647): " + maximoIntPositivo);


        // --- NÚMEROS NEGATIVOS ---

        // El número -129 (negativo porque empieza con 1 a la izquierda del todo)
        int negativo129 = 0b11111111_11111111_11111111_01111111;
        System.out.println("Negativo -129: " + negativo129);

        // El número -1 (todos los bits encendidos en 1)
        int menosUno = 0b11111111_11111111_11111111_11111111;
        System.out.println("Número -1: " + menosUno);

        // El límite máximo negativo de un int (0x80000000)
        // Solo el bit de signo es 1, todos los demás son 0
        int maximoIntNegativo = 0b10000000_00000000_00000000_00000000;
        System.out.println("Máximo Negativo (-2,147,483,648): " + maximoIntNegativo);

        // --- BYTES POSITIVOS (8 bits) ---

        // El número 1 en binario (ocupa 8 bits)
        byte uno = 0b0000_0001;
        System.out.println("Byte 1: " + uno);

        // El límite máximo positivo de un byte (0x7F)
        // El primer bit es 0, los otros 7 son 1
        byte maximoBytePositivo = 0b0111_1111;
        System.out.println("Máximo Positivo (127): " + maximoBytePositivo);


        // --- BYTES CON CASTING ¡NECESARIO! (Valores mayores a 127) ---

        // Tu ejemplo original: 0x81 (129).
        // Como pasa de 127, el bit de signo se activa (1000_0001) y la consola imprime -127
        byte num1_1 = (byte) 0b1000_0001;
        System.out.println("Tu ejemplo original (da -127): " + num1);


        // --- BYTES NEGATIVOS NATIVOS ---

        // El número -1 en byte (todos sus 8 bits encendidos en 1)
        byte menosUnoByte = (byte) 0b1111_1111;
        System.out.println("Byte -1: " + menosUnoByte);

        // El límite máximo negativo de un byte (0x80)
        // Solo el bit de signo es 1, los demás son 0
        byte maximoByteNegativo = (byte) 0b1000_0000;
        System.out.println("Máximo Negativo (-128): " + maximoByteNegativo);

        byte numbyte = 0b1; //Se rellena con ceros por la izquierda 00000001
        System.out.println(numbyte);

       // byte numbyte2 = 0b10000000; //Se rellena con ceros por la izquierda 00000001
        //ESTO NO PODRÍA HACERLO YA QUE TENDRÍA QUE HACER UN CASTING

    }
}
