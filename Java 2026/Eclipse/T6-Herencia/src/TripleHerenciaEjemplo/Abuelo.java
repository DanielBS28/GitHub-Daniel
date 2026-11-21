package TripleHerenciaEjemplo;

public class Abuelo {
    String nombre = "Abuelo Pepe";
    
 // Método PRIVADO: Solo se puede llamar dentro de las llaves { } de esta clase Abuelo
    private void secretoDelAbuelo() {
        System.out.println("Este secreto solo lo sabe Abuelo.");
    }

    // Método PROTECTED (o public): Sirve de puente para que sus hijos/nietos puedan usarlo
    protected void revelarSecreto() {
        // Como estamos DENTRO de Abuelo, aquí sí tenemos permiso para llamar al método privado
        this.secretoDelAbuelo();
    }
}