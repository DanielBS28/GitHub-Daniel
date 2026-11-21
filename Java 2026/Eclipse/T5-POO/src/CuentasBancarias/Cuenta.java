package CuentasBancarias;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Cuenta {
	
	// Atributos de la clase Cuenta
	private int numeroCuenta;
	private double saldo;
	private Cliente cliente; // Relación de asociación con otra clase externa
	private ArrayList<Movimiento> movimientos; // Lista para almacenar los movimientos de la cuenta
	
	// Constructor de la clase Cuenta
	public Cuenta(int numeroCuenta, double saldo, Cliente cliente) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.cliente = cliente;
		this.movimientos = new ArrayList<Movimiento>(); // Inicializamos la lista de movimientos vacía
	}

	// Método para realizar un ingreso en la cuenta
	public void ingreso(double cantidad) {
	    // El ingreso debe ser positivo
	    if (cantidad < 0) {
	        System.out.println("ERROR: No se puede ingresar una cantidad negativa");
	        return;
	    }
	    // Se actualiza el saldo y se registra el movimiento creando un objeto de la clase interna
	    saldo += cantidad;
	    movimientos.add(new Movimiento(LocalDateTime.now(), cantidad, Movimiento.INGRESO));
	}

	// Método para realizar un retiro de la cuenta
	public void retiro(float cantidad) {
	    // El retiro debe ser positivo
	    if (cantidad < 0) {
	        System.out.println("ERROR: No se puede retirar una cantidad negativa");
	        return;
	    }
	    // Comprobamos si hay suficiente saldo disponible
	    if (cantidad > saldo) {
	        System.out.println("ERROR: No hay suficiente saldo");
	        return;
	    }
	    // Se descuenta el saldo y se registra el movimiento en la lista
	    saldo -= cantidad;
	    movimientos.add(new Movimiento(LocalDateTime.now(), cantidad, Movimiento.RETIRO));
	}
	

	/**
	 * CLASE INTERNA (Inner Class): Movimiento
	 * Se encuentra dentro de la clase Cuenta porque su existencia depende exclusivamente de ella.
	 * Representa una transacción (ingreso o retiro) realizada en la cuenta.
	 */
	
	/**
	 * Clase interna privada (Inner Class) que representa un movimiento o transacción 
	 * bancaria (ingreso o retiro).
	 * 
	 * ¿Para qué sirve?
	 * Su propósito es encapsular los datos detallados de cada operación realizada en 
	 * la cuenta (fecha, hora, importe y tipo) para mantener un historial ordenado 
	 * dentro de un ArrayList.
	 * 
	 * Características principales:
	 * - Es privada (private): Solo puede ser creada y utilizada dentro de la clase Cuenta, 
	 *   lo que oculta los detalles de implementación al resto del programa (encapsulamiento).
	 * - Composición: Forma parte fundamental de la cuenta bancaria; si la cuenta deja de 
	 *   existir, los movimientos asociados también dejan de tener sentido por sí mismos.
	 * - Constantes estáticas: Incluye constantes para identificar de forma clara si 
	 *   el movimiento fue un ingreso o un retiro.
	 */
	private class Movimiento {
		
		/**
		 * EXPLICACIÓN DE ACCESO Y PRIVACIDAD EN ESTA CLASE INTERNA:
		 * 
		 * 1. ¿Puede la clase externa (Cuenta) acceder a los miembros privados de Movimiento?
		 *    - ¡SÍ! Aunque los atributos de Movimiento (fechaHora, importe, tipo) son private, 
		 *      la clase contenedora (Cuenta) puede acceder a ellos directamente porque comparten 
		 *      el mismo ámbito de anidación en Java.
		 * 
		 * 2. ¿Se puede acceder desde fuera (otras clases externas como el Main)?
		 *    - NO, es completamente imposible. Al ser Movimiento una clase privada, ninguna otra 
		 *      clase fuera de Cuenta puede crear un objeto Movimiento ni ver sus atributos. 
		 *    - El exterior solo puede interactuar a través de los métodos públicos de Cuenta 
		 *      (como ingreso y retiro), lo que garantiza una seguridad y encapsulamiento total.
		 */
		
		// Constantes para identificar el tipo de movimiento
		public static final byte INGRESO = 0;
		public static final byte RETIRO = 1; 

		// Atributos de cada movimiento individual
		private LocalDateTime fechaHora;
		private double importe;
		private byte tipo;
		
		// Constructor de la clase interna Movimiento
		public Movimiento(LocalDateTime localDateTime, double importe, byte tipo) {
			this.fechaHora = localDateTime;
			this.importe = importe;
			this.tipo = tipo;
		}	
	}
	
	/**
	 * ¿CÓMO HACER COMPOSICIÓN EN JAVA? (¿Clase interna vs Clase independiente?)
	 * 
	 * 1. La forma estándar (Lo que hace tu profesor):
	 *    - Creas la clase (ej. Cliente o Movimiento) en su propio archivo (Cliente.java).
	 *    - Dentro de la clase principal (Cuenta), declaras el atributo y lo instancias 
	 *      en el constructor (ej. this.cliente = new Cliente(...);).
	 *    - ES LA MEJOR OPCIÓN CUANDO: La clase componente es grande, tiene lógica propia 
	 *      o se va a reutilizar en otras clases (por ejemplo, un Cliente puede estar en 
	 *      muchas Cuentas o Préstamos).
	 * 
	 * 2. La clase interna privada (Lo que hiciste tú):
	 *    - Metes la clase directamente dentro de las llaves de la clase principal y le pones "private".
	 *    - ES ÚTIL ÚNICAMENTE CUANDO: La clase secundaria es muy pequeña, auxiliar, y 
	 *      no tiene ningún sentido de la existencia fuera de esta clase principal 
	 *      (como tu caso con un registro muy simple de `Movimiento`).
	 * 
	 * En resumen: Lo que hace tu profesor es la regla general del 90% de los casos. 
	 * Tu enfoque de clase interna es un recurso avanzado muy válido para casos muy específicos.
	 */
	

}
