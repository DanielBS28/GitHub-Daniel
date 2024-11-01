package Herencia;

public class Estudiante extends Persona{

	private int creditos = 60;

	public Estudiante(String nombre, int edad) {
		super(nombre, edad);
	}

	@Override
	public String toString() {
		return super.toString() + ", creditos= " + creditos + "]";
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	
	

}
