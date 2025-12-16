package ejercicos_evaluacion;

public class Ejercico6 {
	public static void main(String[] args) {
		Ciudadano c = new Ciudadano("Laura", 28);
		System.out.println("Nombre: " + c.nombre + ", Edad: " + c.edad);
	}
}

class Ciudadano {
	String nombre;
	int edad;
	
	public Ciudadano (String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
}
