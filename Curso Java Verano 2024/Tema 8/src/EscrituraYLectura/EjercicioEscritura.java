package EscrituraYLectura;

import java.io.*;

public class EjercicioEscritura {

	private static void escribirFichero(String ruta, String frase) {

		try {
			
			//Si quito el true me va a machacar el contenido del fichero
			// con el true escribo a partir de la última letra guardada 
			// en el fichero, esto se llama append
			FileWriter fw = new FileWriter(ruta,true);

			fw.write(frase);
			
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void leerFichero(String ruta) {

		String linea = "";

		try {
			
			/*
			BufferedReader bf = new BufferedReader(new FileReader(ruta));

			while ((linea = bf.readLine()) != null) {

				System.out.println(linea);
			}
			*/
			
			FileReader fr = new FileReader(ruta);
			int i = 0;
			String myString = "";
					
			// fr.read devuelve un -1 cuando ya no hay mas letras que leer
			while((i = fr.read()) != -1){
				// como fr.read() devuelve un entero hay que convertirlo a char
				System.out.print((char)i);
				
				// Esto es para convertir los caracteres a una String
				myString += Character.toString(i);
				
			}
			
			System.out.println(myString);
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		String frase = "Esto es una frase que voy a escribir en un fichero\n";
		String ruta = "src/EscrituraYLectura/frase.txt";

		escribirFichero(ruta, frase);
		leerFichero(ruta);
	}

}
