package Pruebas;
import java.io.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ListarFicherosFormaRecursiva {

	public static void listarArchivos(File Carpeta) {
		
		
		File[] Archivos = Carpeta.listFiles();
		
		if(Archivos == null) {
			System.out.println("No se ha podido visualizar");
			return;
		}else if(Archivos.length == 0)
			System.out.println("No hay nada");

		
		for (File f : Archivos) {

			if (f.isFile())
				System.out.println(f.getName() +" Es un archivo");
		}
		
		for (File f : Archivos) {
			if (f.isDirectory()) {
				System.out.println(f.getName() +" Es una carpeta");
				listarArchivos(f);
			}
		}
	}

	public static void main(String[] args) {

		File Carpeta = new File("src");
		
		listarArchivos(Carpeta);

	}

}
