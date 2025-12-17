package poo1;

import java.util.ArrayList;
import java.util.List;
//Comentario 1:

public class Alumno extends Persona{
	
			String institucion;
			List<Asignatura> materias;
			public Alumno() {
				super();
				materias = new ArrayList<>();
			}
			public Alumno(int c, String n, String a) {
				super(c, n, a);
				materias = new ArrayList<>();
			}
			public Alumno(int c) {
				super(c);
				materias = new ArrayList<>();
			}
			public String getInstitucion() {
				return institucion;
			}
			public void setInstitucion(String institucion) {
				this.institucion = institucion;
			}
			public List<Asignatura> getMaterias() {
				return materias;
			}
			public void setMaterias(List<Asignatura> materias) {
				this.materias = materias;
			}
			
			public void setMateria(Asignatura a) {
				materias.add(a);
			}
			@Override
			public String toString() {
				return super.toString() + "[institucion=" + institucion + ", materias=" + materias + "]";
			}
}