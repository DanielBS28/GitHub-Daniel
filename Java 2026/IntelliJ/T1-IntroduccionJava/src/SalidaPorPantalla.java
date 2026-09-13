public class SalidaPorPantalla {

    static void main() {

        int n = 10;
        int m = 20;

        System.out.println("La salida es: " + n); // 10
        System.out.println("La salida 2 es: " + n+ m); // 1020 ya que se concatena al encontrarse primer una String.
        System.out.println("La salida 3 es: "+ (n + m)); // 30 ya que al encontrarse parentesis realiza primero la operación.
        System.out.println(n+m + "La salida 4 es: "); //30 ya que va de izquierda a derecha el sout, así que lo primero que se encuentra son números y realiza la suma, después la String
    }
}
