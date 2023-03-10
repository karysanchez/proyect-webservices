/**
 * 
 */
package com.karosanpu.projecwebservices.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.karosanpu.projecwebservices.entity.Empleado;
import com.karosanpu.projecwebservices.service.EmpleadoService;

/**
 * @author ksanchezpu WebService generado con Jersey.
 */
@Path("empleadosWS")
public class EmpleadosWS {

	private EmpleadoService empleadoService = new EmpleadoService();

	@GET
	@Path("test")
	public String test() {
		return "Probando webservices con Jersey";
	}

	@GET
	@Path("consultarEmpleado")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Empleado consultarEmpleado() {
		return this.empleadoService.consultarEmpleado();
	}
}
