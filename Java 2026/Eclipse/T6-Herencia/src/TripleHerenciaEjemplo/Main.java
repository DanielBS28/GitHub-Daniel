package TripleHerenciaEjemplo;

public class Main {

	public static void main(String[] args) {

		Hija hija = new Hija();
        hija.mostrarNombres();
        hija.intentarAcceder(); // Imprime: "Este secreto solo lo sabe Abuelo."
	}

}
