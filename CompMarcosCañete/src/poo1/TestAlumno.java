package poo1;

public class TestAlumno {
	public static void main(String[] args) {
		//alumno
		Alumno alu = new Alumno(5400117,"marcos","cañete");
		
		
		//asignatura
		Asignatura inf = new Asignatura();
		inf.setCodigo(001);
		inf.setNombre("Informática");
		
		Asignatura hist = new Asignatura();
		hist.setCodigo(002);
		hist.setNombre("Historia");
		
		Asignatura qca = new Asignatura();
		qca.setCodigo(003);
		qca.setNombre("Química");
		
		Asignatura fsa = new Asignatura();
		fsa.setCodigo(004);
		fsa.setNombre("Física");
		
		
		
		
		//cargar la asignatura en alumno
		alu.setMateria(inf);
		alu.setMateria(hist);
		alu.setMateria(qca);
		alu.setMateria(fsa);
		
		
		//imprimir
		
		
		System.out.println("ALUMNOS:");
		System.out.println(alu.toString());
		
		System.out.println("MATERIAS:");
		for(Asignatura a : alu.getMaterias()){
			System.out.println(a);
		}
	}

}
