package org.iesalandalus.programacion.biblioteca.mvc.modelo.dominio;

import java.time.LocalDate;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno alumnoUno = new Alumno("Enrique Fernandez", "enrique@gmail.com", Curso.PRIMERO);
		Libro libroUno = new Libro("Quijote", "Miguel", 149);
		Prestamo prestamoUno = new Prestamo(alumnoUno, libroUno, LocalDate.of(2020, 12, 31));
		prestamoUno.devolver(LocalDate.now());
		System.out.println(prestamoUno.getPuntos());
	}			
}
