import java.util.ArrayList;

/**
 * 
 */

/**
 * @author luser
 *
 */
public class Mazmorra {
	ArrayList<ObjetoMazmorra> objetosMazmorra;
	ArrayList<Personaje> personajes;
	String nombre;
	boolean haySalida;
	
	/**
	 * Mazmorra
	 * Constructor sin parámetros
	 */
	public Mazmorra () {
		
	}
	
	/**
	 * Mazmorra
	 * Constructor con parámetros
	 * @param nombre
	 * @param haySalida
	 */
	public Mazmorra (String nombre, boolean haySalida)  {
		this.nombre = nombre;
		this.haySalida = haySalida;
	}
}
