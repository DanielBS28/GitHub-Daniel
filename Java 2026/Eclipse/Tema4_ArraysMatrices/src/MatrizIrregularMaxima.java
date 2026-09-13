import java.util.Arrays;

/**
 * Ejercicio que dadas dos matrices A y B, las compare elemento a elemento y
 * muestre otra matriz M. Dicha matriz debe tener el valor máximo en cada una de
 * las posiciones. Las matrices se deben pasar como parámetros al método, podrán
 * ser distintas tanto en la cantidad de filas, como en los elementos de
 * cualquiera de sus filas, o también podrán ser cuadradas. Se deberá tener en
 * cuenta que si hay una posición que únicamente existe en una de las dos
 * matrices, dicho valor no se deberá comparar y deberá aparecer en la matriz
 * resultante(M).
 * 
 * 
 * @author DanielBS28
 * @version 2.0
 * 
 */

public class MatrizIrregularMaxima {

	/**
	 * Esta función se encarga de obtener la matriz máxima obtenida mediante dos
	 * matrices que pueden ser cuadradas o irregulares
	 * 
	 * @param matriz1 Primera matriz pasada como parámetro
	 * @param matriz2 Segunda matriz pasada como parámetro
	 * @return La matriz nueva máxima conformado entre la matriz 1 y la matriz 2
	 */

	public static int[][] matrizMaxima(int[][] matriz1, int[][] matriz2) {

		int[][] matrizMaxima = new int[obtenerFilasMayor(matriz1, matriz2)][];

		operacionesMatriz(matrizMaxima, matriz1, matriz2);

		return matrizMaxima;

	}

	/**
	 * Realiza las operaciones para obtener la mátriz máxima irregular entre la
	 * matriz 1 y la matriz 2
	 * 
	 * @param matrizMaxima matriz que estamos construyendo.
	 * @param matriz1      Primera matriz inicial
	 * @param matriz2      Segunda matriz inicial
	 */

	private static void operacionesMatriz(int[][] matrizMaxima, int[][] matriz1, int[][] matriz2) {

		rellenarArrays(matrizMaxima, matriz1, matriz2);
		completarArrays(matrizMaxima, matriz1, matriz2);

	}

	/**
	 * Realiza las operaciones para obtener los elementos en las posiciones [i][j]
	 * de la nueva matriz máxima irregular entre la matriz 1 y la matriz 2
	 * 
	 * @param matrizMaxima matriz que estamos construyendo.
	 * @param matriz1      Primera matriz inicial
	 * @param matriz2      Segunda matriz inicial
	 */

	private static void completarArrays(int[][] matrizMaxima, int[][] matriz1, int[][] matriz2) {

		for (int i = 0; i < matrizMaxima.length; i++) {

			for (int j = 0; j < matrizMaxima[i].length; j++) {

				if (i > matriz1.length - 1)
					matrizMaxima[i][j] = matriz2[i][j];
				else if (i > matriz2.length - 1)
					matrizMaxima[i][j] = matriz1[i][j];
				else {

					if (j > matriz1[i].length - 1)
						matrizMaxima[i][j] = matriz2[i][j];
					else if (j > matriz2[i].length - 1)
						matrizMaxima[i][j] = matriz1[i][j];
					else
						matrizMaxima[i][j] = Math.max(matriz1[i][j], matriz2[i][j]);

				}

			}
		}

	}
	/**
	 * Esta función se encarga de rellenar los arrays de cada fila en la matriz,
	 * rellena en función de si la matriz 1 o la matriz 2 tienen mayor tamaño o si
	 * por el contrario una matriz es mas pequeña que otra se rellena con el tamaño
	 * de la matriz grande.
	 * 
	 * @param matrizMaxima matriz que estamos construyendo.
	 * @param matriz1      Primera matriz inicial
	 * @param matriz2      Segunda matriz inicial
	 */

	private static void rellenarArrays(int[][] matrizMaxima, int[][] matriz1, int[][] matriz2) {

		for (int i = 0; i < matrizMaxima.length; i++) {

			if (i > matriz1.length - 1)
				matrizMaxima[i] = new int[matriz2[i].length];
			else if (i > matriz2.length - 1)
				matrizMaxima[i] = new int[matriz1[i].length];
			else
				matrizMaxima[i] = new int[Math.max(matriz1[i].length, matriz2[i].length)];

		}
	}

	/**
	 * Devuelve el número máximo de filas
	 * 
	 * @param matriz1 Primera matriz pasada como parámetro
	 * @param matriz2 Segunda matriz pasada como parámetro
	 * @return La cantidad de filas mayor entre la matriz 1 y la matriz 2 para
	 *         obtener la altura de la nueva matriz que vamos a crear.
	 * 
	 */

	public static int obtenerFilasMayor(int[][] matriz1, int[][] matriz2) {

		return matriz1.length > matriz2.length ? matriz1.length : matriz2.length;
	}

	/**
	 * Imprime una matriz cualquier con Arrays.toString(m);
	 * 
	 * @param m La matriz a imprimir
	 */
	public static void imprimirMatriz(int[][] m) {

		for (int[] array : m)
			System.out.println(Arrays.toString(array));

		System.out.println();

	}

	public static void main(String[] args) {

		int[][] matriz1 = { { 1, 2 }, { 7, 7, 8 }, { 10, 8 } };
		int[][] matriz2 = { { 5, 1, 4 }, { 6, 3 }, { 11 }, { 1, 2 } };

		System.out.println("-- Matriz 1: --\n");
		imprimirMatriz(matriz1);
		System.out.println("-- Matriz 2: --\n");
		imprimirMatriz(matriz2);
		System.out.println("-- Matriz Máxima: --\n");
		imprimirMatriz(matrizMaxima(matriz1, matriz2));

	}
	
	/*
	 * 
	 * Podría haber sido un poco mas eficiente:
	 * 
	 * 
	private static void construirYRellenarMatriz(int[][] matrizMaxima, int[][] matriz1, int[][] matriz2) {

		for (int i = 0; i < matrizMaxima.length; i++) {

			// 1. Determinar si la fila actual (i) existe en cada matriz
			boolean existeEnM1 = i < matriz1.length;
			boolean existeEnM2 = i < matriz2.length;

			// 2. Obtener la longitud de la fila en cada matriz (si no existe, su longitud es 0)
			int colsM1 = existeEnM1 ? matriz1[i].length : 0;
			int colsM2 = existeEnM2 ? matriz2[i].length : 0;

			// 3. Instanciar la fila actual en la nueva matriz con la longitud máxima
			int maxCols = Math.max(colsM1, colsM2);
			matrizMaxima[i] = new int[maxCols];

			// 4. Recorrer las columnas y rellenar los valores
			for (int j = 0; j < maxCols; j++) {
				
				// Si la columna actual (j) excede los límites de M1, tomamos el valor de M2
				if (j >= colsM1) {
					matrizMaxima[i][j] = matriz2[i][j];
				} 
				// Si la columna actual (j) excede los límites de M2, tomamos el valor de M1
				else if (j >= colsM2) {
					matrizMaxima[i][j] = matriz1[i][j];
				} 
				// Si la posición existe en ambas matrices, se calcula el máximo
				else {
					matrizMaxima[i][j] = Math.max(matriz1[i][j], matriz2[i][j]);
				}
			}
		}
	}
	 * 
	 *  
	 * 
	 * */

}
