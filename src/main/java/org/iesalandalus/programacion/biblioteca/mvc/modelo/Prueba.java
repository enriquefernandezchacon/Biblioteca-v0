package org.iesalandalus.programacion.biblioteca.mvc.modelo;

import java.time.LocalDate;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.biblioteca.mvc.modelo.dominio.Alumno;
import org.iesalandalus.programacion.biblioteca.mvc.modelo.dominio.Curso;
import org.iesalandalus.programacion.biblioteca.mvc.modelo.dominio.Libro;
import org.iesalandalus.programacion.biblioteca.mvc.modelo.dominio.Prestamo;
import org.iesalandalus.programacion.biblioteca.mvc.modelo.negocio.Prestamos;

public class Prueba {

	public static void main(String[] args) {
		Alumno alumnoUno = new Alumno("Enrique Fernandez", "enrique@gmail.com", Curso.PRIMERO);
		Alumno alumnoDos = new Alumno("Enrique Fernandez Dos", "enriqueDos@gmail.com", Curso.SEGUNDO);
		Libro libroUno = new Libro("Quijote", "Miguel", 149);
		Libro libroDos = new Libro("QuijoteDos", "MiguelDos", 298);
		Prestamo prestamoUno = new Prestamo(alumnoUno, libroUno, LocalDate.of(2020, 12, 31));
		Prestamo prestamoDos = new Prestamo(alumnoDos, libroDos, LocalDate.of(2020, 12, 31));
		prestamoUno.devolver(LocalDate.now());
		prestamoDos.devolver(LocalDate.now());
		Prestamos coleccion = new Prestamos(2);
		try {
			coleccion.prestar(prestamoUno);
			coleccion.prestar(prestamoDos);
			coleccion.devolver(prestamoUno, LocalDate.now());
			coleccion.devolver(prestamoDos, LocalDate.now());
			System.out.println(prestamoUno);
		} catch (OperationNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(prestamoUno);
	}			
}
