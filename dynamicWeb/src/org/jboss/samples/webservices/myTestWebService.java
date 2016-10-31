package org.jboss.samples.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.WebParam;

@WebService()
public class myTestWebService {

	@WebMethod()
	public String sayHello(@WebParam(name="nombre") String nombre, @WebParam(name="apellido") String apellido) {
	    System.out.println("Hola: " + nombre);
	    return "Hola " + nombre + " " + apellido + "!";
	}
}
