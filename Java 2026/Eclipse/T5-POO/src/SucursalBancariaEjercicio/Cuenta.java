package SucursalBancariaEjercicio;


import java.time.LocalDateTime;
import java.util.ArrayList;


public class Cuenta {
    
	private static int numCuentas = 1;
    private int numeroCuenta;
    private double saldo;
    private Cliente cliente; 
    
    // Composición clásica: La lista de movimientos pertenece a la cuenta
    private ArrayList<Movimiento> movimientos;
    
    public Cuenta(int numeroCuenta, double saldo, Cliente cliente) {
        this.numeroCuenta = numCuentas;
        this.saldo = saldo;
        this.cliente = cliente;
        
        // Aquí es donde instanciamos la colección en el constructor, 
        // tal como hace tu profesor con los objetos compuestos.
        this.movimientos = new ArrayList<Movimiento>();
        numCuentas++;
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
