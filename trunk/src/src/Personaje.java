import java.util.ArrayList;

/**
 * 
 */

/**
 * @author luser
 *
 */
public class Personaje {
	
	String nombre;
	Raza raza;
	int fuerza;
	int velocidad;
	int inteligencia;
	int salud;
	Arsenal arsenal;
	Pociones pociones;
	ArrayList<Hechizo> hechizos;
	ArrayList<Moneda> monedas;
	
	/**
	 * Personaje
	 * Constructor por defecto
	 * @param nombre
	 * @param raza
	 * @param fuerza
	 * @param velocidad
	 * @param inteligencia
	 * @param salud
	 */
	public Personaje(String nombre, Raza raza, int fuerza, int velocidad,
			int inteligencia, int salud) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.fuerza = fuerza;
		this.velocidad = velocidad;
		this.inteligencia = inteligencia;
		this.salud = salud;
	}
	
	/**
	 * atacar
	 * @return int
	 */
	public int atacar () {
		
		return 1;
	}
	
	/**
	 * defender
	 * @return int
	 */
	public int defender () {
		return 1;
	}
	
	/**
	 * buscar
	 * @return int
	 */
	public int buscar () {
		return 1;
	}
	
	/**
	 * toString
	 * @return String
	 */
	public String toString() {
		String resumen = "";
		
		resumen = resumen + "Nombre: " + nombre + "\n";
		resumen = resumen + "Raza: " + raza + "\n";
		resumen = resumen + "Fuerza: " + fuerza + "\n";
		resumen = resumen + "Velocidad: " + velocidad + "\n";
		resumen = resumen + "Salud: " + salud + "\n";
		
		return resumen;
	}
}
