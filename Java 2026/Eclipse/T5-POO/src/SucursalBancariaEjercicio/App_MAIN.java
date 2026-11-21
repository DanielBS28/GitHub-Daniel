package SucursalBancariaEjercicio;

import java.util.Scanner;

public class App_MAIN {

	/*
	 * Ejercicio Sucursal Bancaria
	 * 
	 * - Se desea realizar una aplicación para manejar las cuentas de una sucursal
	 * bancaria. En la sucursal habrá: * Clientes y Cuentas que se almacenarán en
	 * ArrayLists. En la creación de cuentas se asignan números de cuenta
	 * correlativos. Los clientes pueden no tener cuentas asociadas, pero una Cuenta
	 * siempre deberá tener asociado un Cliente. * En cada Cuenta puede haber un
	 * número indeterminado de Movimientos que se almacenarán en un ArrayList. *
	 * Para trabajar con la aplicación siempre habrá una cuenta activa que es
	 * aquella en la que se realizan las operaciones. La aplicación tendrá un menú
	 * principal.
	 * 
	 * - Si el usuario selecciona la opción 1 podrá agregar clientes a la sucursal.
	 * Si el usuario selecciona la opción 2 podrá añadir cuentas a la sucursal. Para
	 * agregar una cuenta será necesario disponer de algún cliente.
	 * 
	 * - Si el usuario selecciona la opción 3, se solicitará que introduzca un
	 * número de cuenta. Si no existe, se mostrará de nuevo el menú principal. Si
	 * existe, se pondrá esa cuenta como activa y se mostrará el submenú de la
	 * Cuenta.
	 * 
	 * MENÚ PRINCIPAL MENÚ CUENTA 1. Crear Cliente 1. Ingresar 2. Crear Cuenta 2.
	 * Retirar 3. Mantenimiento de Cuenta 3. Ver datos cuenta 4. Salir 4. Volver al
	 * menú principal
	 */

	public static Scanner teclado = new Scanner(System.in);

	public static void menuInicial() {

		ComandosAPP opcion = null;

		do {
			System.out.println("--- MENU INICIAL ---\n");
			System.out.println("- Introduzca una opción -");
			System.out.println("1. Crear Cliente");
			System.out.println("2. Crear Cuenta");
			System.out.println("3. Mantenimiento de Cuenta");
			System.out.println("4. Salir");

			int opcionSeleccionada = teclado.nextInt();
			/*
			 * ======================================================================== GUÍA
			 * RÁPIDA Y DOCUMENTACIÓN DEL BUFFER DE SCANNER EN JAVA
			 * ======================================================================== ¿Qué
			 * es el buffer? Es una memoria temporal donde el sistema guarda lo que escribes
			 * en el teclado hasta que Java lo lee.
			 * 
			 * ------------------------------------------------------------------------ 1.
			 * ¿CUÁNDO FALLA? (El clásico error del "Enter fantasma")
			 * ------------------------------------------------------------------------
			 * Ocurre cuando mezclas métodos que leen tokens (nextInt, nextDouble, next) con
			 * un 'nextLine()' posterior.
			 * 
			 * EJEMPLO DE CÓDIGO QUE FALLA: int edad = teclado.nextInt(); // Escribes "20" y
			 * pulsas [Enter]. // Lee el 20, pero el '\n' (Enter) // se queda atrapado en el
			 * buffer. String nombre = teclado.nextLine(); // ¡FALLA! Se traga ese '\n'
			 * pendiente, // lo toma como una línea vacía y no // te deja escribir el
			 * nombre.
			 * 
			 * SOLUCIÓN: int edad = teclado.nextInt(); teclado.nextLine(); // <-- ¡LIMPIEZA!
			 * Se traga el Enter sobrante. String nombre = teclado.nextLine(); // Ahora sí
			 * funciona perfecto.
			 * 
			 * ------------------------------------------------------------------------ 2.
			 * ¿CUÁNDO NO FALLA? (Casos seguros donde NO hace falta limpiar)
			 * ------------------------------------------------------------------------ -
			 * DOS MÉTODOS 'next()' SEGUIDOS: String apellido1 = teclado.next(); String
			 * apellido2 = teclado.next(); (Funcionan bien porque 'next()' ignora los
			 * espacios y saltos de línea iniciales y busca la siguiente palabra). OJO si
			 * luego viene un nextline() hay problemas de nuevo.
			 * 
			 * - DOS 'nextLine()' SEGUIDOS: String linea1 = teclado.nextLine(); String
			 * linea2 = teclado.nextLine(); (Funcionan bien porque cada 'nextLine()' lee
			 * toda la línea incluyendo su propio Enter, vaciándolo por completo al
			 * terminar).
			 * 
			 * - nextLine() SEGUIDO DE nextInt(): String nombre = teclado.nextLine(); (borra
			 * después el \n antes de seguir) int edad = teclado.nextInt(); (Funciona bien
			 * porque 'nextInt()' ignora automáticamente cualquier espacio o salto de línea
			 * sobrante antes de leer el número).
			 * ========================================================================
			 */
			teclado.nextLine();

			if (opcionSeleccionada >= 1 && opcionSeleccionada <= 4) {
				/*
				 * ========================================================================
				 * GUÍA RÁPIDA: CONVERSIÓN A ENUM (values() vs valueOf()) Y EL USO DEL "- 1"
				 * ========================================================================
				 *
				 * 1. ¿CUÁNDO USAR values()[indice] FRENTE A valueOf(texto)?
				 * ------------------------------------------------------------------------
				 * - ComandosAPP.values()[opcionSeleccionada - 1]  (ENTRADA NUMÉRICA)
				 *   * Qué hace: Devuelve un array con todas las constantes del enum en el
				 *     orden exacto en que fueron declaradas y accede por posición.
				 *   * Cuándo elegirlo: En menús numerados por consola (1, 2, 3...) donde el
				 *     usuario introduce un 'int'.
				 *   * Ventaja: No lanza excepciones si validas el rango previamente con un 'if'.
				 *   * Desventaja: Depende estrictamente del orden en el enum; si reordenas
				 *     las constantes en ComandosAPP, cambiarán los números del menú.
				 *
				 * - ComandosAPP.valueOf("TEXTO")  (ENTRADA DE TEXTO EXACTO)
				 *   * Qué hace: Busca una constante cuyo nombre coincida letra por letra
				 *     (y en MAYÚSCULAS) con el String recibido.
				 *   * Cuándo elegirlo: Cuando el usuario escribe comandos por texto (ej.
				 *     "SALIR"), o al leer datos desde un fichero/base de datos.
				 *   * Desventaja: Si el texto no coincide exactamente, lanza una excepción
				 *     (IllegalArgumentException) y obliga a usar un bloque try-catch.
				 *
				 * 2. ¿POR QUÉ SE RESTA 1 EN [opcionSeleccionada - 1]?
				 * ------------------------------------------------------------------------
				 * El método .values() devuelve un array tradicional de Java, y los arrays
				 * siempre empiezan a contar desde la posición 0, mientras que los menús
				 * para humanos empiezan en el 1. Restar 1 ajusta ambos índices:
				 *
				 *   Usuario elige   |   Cálculo (n - 1)   |   Constante en ComandosAPP
				 *   ----------------|---------------------|---------------------------
				 *        1          |     1 - 1 = [0]     |   CREAR_CLIENTE
				 *        2          |     2 - 1 = [1]     |   CREAR_CUENTA
				 *        3          |     3 - 1 = [2]     |   MANTENIMIENTO
				 *        4          |     4 - 1 = [3]     |   SALIR
				 *
				 * NOTA PARA EL SUBMENÚ: Como INGRESAR, RETIRAR, DATOS y VOLVER están a
				 * continuación en el mismo enum (posiciones 4, 5, 6 y 7), en el menú de
				 * cuenta el ajuste será sumar 3: ComandosAPP.values()[opcionSeleccionada + 3]
				 * ========================================================================
				 */
				opcion = ComandosAPP.values()[opcionSeleccionada - 1];
			} else {
				opcion = null;
				System.out.println("Opción no válida. Introduce un número del 1 al 4.");
			}

			if (opcion != null) {

				if (opcion == ComandosAPP.CREAR_CLIENTE) {
					

				} else if (opcion == ComandosAPP.CREAR_CUENTA) {
					
					System.out.println("Cuenta creada correctamente");

				} else if (opcion == ComandosAPP.MANTENIMIENTO) {
				    // mantenimiento
				}
			}

		} while (opcion != ComandosAPP.SALIR);
		System.out.println("Saliendo de la aplicación...");

	}

	public static void main(String[] args) {
		
		System.out.println("Saliste de la aplicación");

	}

}
