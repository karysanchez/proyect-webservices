/**
 * 
 */
package com.karosanpu.projecwebservices.service;

import java.time.LocalDateTime;

import com.karosanpu.projecwebservices.entity.Empleado;

/**
 * @author ksanchezpu
 *
 */
public class EmpleadoService {

	public Empleado consultarEmpleadoPorId(Long id) {
		return null;
	};

	/**
	 * Método que simula la consulta de un emplado
	 * 
	 * @return {@link Empleado} empleado consultado
	 */
	public Empleado consultarEmpleado() {
		Empleado empleado = new Empleado();
		empleado.setNumeroEmpleado("123456");
		empleado.setNombre("Carlos");
		empleado.setPrimerApellido("Caiza");
		empleado.setSegundoApellido("Pilataxi");
		empleado.setFechaCreacion(LocalDateTime.now());
		empleado.setEdad(31);

		return empleado;
	};

}
