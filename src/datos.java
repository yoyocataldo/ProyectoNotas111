import java.util.*;

import Alumnos.alumnos;

public class datos {
	public static void main(String[] args) {
		List<alumnos> cjsp = new ArrayList<alumnos>();
		Scanner entradaTeclado = new Scanner(System.in);
		String respuesta;
		int i = 1;
		do {
			String calificacion = "Reprobado (a)";
			System.out.println("Registro de Alumnos \n");
			System.out.println("Seleccione una opci�n:");
			System.out.println("1 - Registrar un alumno ");
			System.out.println("2 - Consultar un alumno ");
			System.out.println("3 - Ingresar notas ");
			System.out.println("4 - Ver clase completa ");
			System.out.println("5 - Salir ");
			respuesta = entradaTeclado.next();
			switch (respuesta) {
			case "1":
				System.out.println("Nombre de alumno");
				String nombre = entradaTeclado.next();
				System.out.println("Direccion del alumno");
				String direccion = entradaTeclado.next();
				System.out.println("Rut del alumno");
				int rut = entradaTeclado.nextInt();
				System.out.println("Nota del alumno");
				int nota = (int) entradaTeclado.nextDouble();
				if (nota >= 40) {
					calificacion = "Aprobado";
				}
				alumnos p = new alumnos(i, nombre, direccion, rut, nota, null);
				p.setCalificacion(calificacion);
				cjsp.add(p);
				i++;
				respuesta = "0";
				break;
			case "2":
				System.out.println("Introduce la id del alumno a consultar :");
				int id = entradaTeclado.nextInt();
				if (cjsp.size() < id) {
					System.out.println("Hay " + cjsp.size() + " alumnos registrados");
				} else {
					System.out.println(cjsp.get(id - 1));
				}
				respuesta = "0";
				break;
			case "3":
				System.out.println("Introduce la id del alumno a modificar :");
				id = entradaTeclado.nextInt();
				if (cjsp.size() < id) {
					System.out.println("Hay " + cjsp.size() + " alumnos registrados");
				} else {
					System.out.println(cjsp.get(id - 1));
					System.out.println("Escribe la nueva nota");
					Double nuevaNota = entradaTeclado.nextDouble();
					if (nuevaNota >= 40) {
						calificacion = "Aprobado";
					}
					cjsp.get(id - 1).setNota(nuevaNota);
					cjsp.get(id - 1).setCalificacion(calificacion);
					System.out.println(cjsp.get(id - 1));
				}
				respuesta = "0";
				break;
			case "4":
				System.out.println("Alumnos en la clase: \n" + cjsp);
				respuesta = "0";
				break;
			case "5":
				System.out.println("Adios");
				respuesta = "1";
				break;
			default:
				System.out.println("Opci�n invalida.Debes elegir 1,2,3,4 � 5");
				respuesta = "0";
			}
		} while (respuesta == "0");
	}
}