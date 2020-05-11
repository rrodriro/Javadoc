package ejerJavadoc;

/**
 * 
 * @author Rosana
 * @version 1-2020
 * @since 12/05/2020
 * 
 *
 */


public class Empleado {
	
	private String nombre;
	private String apellido;
	private double salario; 

/**
 * 
 * @param nombre Nombre del empleado
 * @param apellido primer apellido del empleado
 * @param salario salario base
 */
public Empleado(String nombre, String apellido, double salario) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.salario = salario;
}

// método publico

/**
 * @see Empleado
 * @param subida indica la cantidad que se la va a subir
 */
public void subirsalario (double subida) {
	salario=salario+subida;
}


//metodo privado

/**
 * comprueba que el nombre no esté vacio
 * @return
 */
private boolean comprobar() {
	if (nombre.equals("")) {
		return false;
	}
	return true;
}
}