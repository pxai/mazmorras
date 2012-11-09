/**
 * 
 */

/**
 * @author luser
 *
 */
public class Pocion extends ObjetoMazmorra {

	int mejoraSalud;
	int mejoraFuerza;
	int mejoraInteligencia;
	

	/**
	 * Pocion
	 * @param nombre
	 * @param nivelOcultamiento
	 * @param valor
	 * @param mejoraSalud
	 * @param mejoraFuerza
	 * @param mejoraInteligencia
	 */
	public Pocion(String nombre, int nivelOcultamiento, int valor,
			int mejoraSalud, int mejoraFuerza, int mejoraInteligencia) {
		super(nombre, nivelOcultamiento, valor);
		this.mejoraSalud = mejoraSalud;
		this.mejoraFuerza = mejoraFuerza;
		this.mejoraInteligencia = mejoraInteligencia;
	}


	/**
	 * toString
	 * muestra un resumen de la información del objeto
	 */
	public String toString () {
		String resumen = "";
		
		resumen = super.toString();
		
		resumen = resumen + "Mejora salud: " + mejoraSalud + "\n";
		resumen = resumen + "Mejora fuerza: " + mejoraFuerza + "\n";
		resumen = resumen + "Mejora inteligencia: " + mejoraInteligencia + "\n";
		
		return resumen;
	}
	
}
