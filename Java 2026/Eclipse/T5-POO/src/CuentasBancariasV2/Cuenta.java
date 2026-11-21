package CuentasBancariasV2;


import java.time.LocalDateTime;
import java.util.ArrayList;


/**
 * =====================================================================================
 * GUÍA DE ESTUDIO Y RESUMEN DE CONCEPTOS: POO EN JAVA (Cuentas, Clientes y Movimientos)
 * =====================================================================================
 * 
 * 1. CLASE INTERNA PRIVADA (Inner Class) - Tu enfoque inicial:
 *    - ¿Qué es? Una clase declarada dentro de otra clase (`private class Movimiento` dentro de `Cuenta`).
 *    - ¿Para qué sirve? Para agrupar lógica que pertenece exclusivamente a la clase contenedora 
 *      y mantener un fuerte encapsulamiento.
 *    - ¿Quién puede acceder? 
 *      * La clase `Cuenta` SÍ puede acceder a los atributos privados de `Movimiento` (y viceversa) 
 *        porque comparten el mismo ámbito de anidación.
 *      * Desde fuera (otras clases como el `Main`), es COMPLETAMENTE IMPOSIBLE acceder o crear 
 *        un `Movimiento` directamente; solo se interactúa a través de los métodos públicos de `Cuenta`.
 * 
 * 2. COMPOSICIÓN VS CLASES SEPARADAS - El enfoque del profesor:
 *    - Tu profesor suele enseñar la forma estándar: crear la clase en un archivo independiente 
 *      (ej. `Movimiento.java`) y usarla mediante métodos `get` o instanciándola donde se necesite.
 *    - ¿Cuándo usar una u otra?
 *      * Clase interna privada: Ideal para clases auxiliares muy pequeñas y exclusivas que no tienen 
 *        sentido fuera del contexto principal.
 *      * Clases independientes (Archivos separados): La regla general (90% de los casos) para 
 *        clases más grandes, complejas o que se van a reutilizar en otras partes del programa.
 * 
 * 3. TIPOS DE RELACIONES (Asociación, Agregación y Composición):
 *    - ASOCIACIÓN / AGREGACIÓN (Ej: Cliente y Cuenta):
 *      * El `Cliente` se pasa creado desde fuera (por el constructor).
 *      * El cliente es independiente: si la cuenta se borra o se cierra, el cliente sigue vivo 
 *        en el sistema del banco (puede tener más cuentas). El "todo" no destruye a la "parte".
 *    
 *    - COMPOSICIÓN (Ej: Cuenta y Movimiento):
 *      * El movimiento es creado y controlado internamente por la cuenta cuando se ingresa o retira dinero.
 *      * El movimiento depende totalmente de la cuenta: si la cuenta desaparece, los movimientos 
 *        asociados mueren con ella porque no tienen sentido por sí solos.
 * =====================================================================================
 */
public class Cuenta {
    
    private int numeroCuenta;
    private double saldo;
    private Cliente cliente; 
    
    // Composición clásica: La lista de movimientos pertenece a la cuenta
    private ArrayList<Movimiento> movimientos;
    
    public Cuenta(int numeroCuenta, double saldo, Cliente cliente) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.cliente = cliente;
        
        // Aquí es donde instanciamos la colección en el constructor, 
        // tal como hace tu profesor con los objetos compuestos.
        this.movimientos = new ArrayList<Movimiento>();
    }
    
    public void ingreso(double cantidad) {
        if (cantidad < 0) {
            System.out.println("ERROR: No se puede ingresar una cantidad negativa");
            return;
        }
        
        saldo += cantidad;
        
        // INSTANCIACIÓN DE LA COMPOSICIÓN: 
        // Creamos el objeto Movimiento y lo añadimos directamente al ArrayList
        movimientos.add(new Movimiento(LocalDateTime.now(), cantidad, Movimiento.INGRESO));
    }

    public void retiro(float cantidad) {
        if (cantidad < 0) {
            System.out.println("ERROR: No se puede retirar una cantidad negativa");
            return;
        }
        
        if (cantidad > saldo) {
            System.out.println("ERROR: No hay suficiente saldo");
            return;
        }
        
        saldo -= cantidad;
        
        // Otra instancia de composición al realizar el retiro
        movimientos.add(new Movimiento(LocalDateTime.now(), cantidad, Movimiento.RETIRO));
    }
}
