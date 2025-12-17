package poo1;

public class Persona {
	//Comentario 1: 
		private int cedula;
		private String nombre;
		private String apellido;
		
		public Persona() {
		}
		
		//Comentrio 2:
		public Persona(int c){
			setCedula(c);
			nombre = new String("Desconocido");
			apellido = new String("desconocido");
		}
		
		public Persona(int c, String n, String a)
		{
			setCedula(c);
			setNombre(n);
			setApellido(a);
		}

		//Comentario3
		public void setCedula(int c) {
			if (c >0) cedula = c;
			else c = 0; //
			
		}
		//Comentario 4
		public void setNombre(String n) {
			if (n.equals(""))  //Comentario6:
			{
				System.out.println("Nombre no valido, se asigno Desconocido");
				nombre = new String("Desconocido");
			} else nombre = n;
		}
		
		public void setApellido(String a) {
			if (a.equals(""))
			{
				System.out.println("Apellido no valido, se asigno Desconocido");
				apellido = new String("desconocido");
			}else {
			apellido = a;
		}
	}		
		
	public int getCedula() { return cedula; }
	public String getNombre() { return nombre; }
	public String getApellido() { return apellido; }
	
	//Comentario 5:
	@Override
	public String toString() {
		return cedula + ", " + nombre + ", "+ apellido;
	}
}
