/**
 * 
 */

/**
 * @author luser
 *
 */
public class Hechizo  extends ObjetoMazmorra {
	
	int puntosAtaque;
	int puntosDefensa;
	int puntosVelocidad;
	int inteligenciaPrecisa;
	
	/**
	 * @param nombre
	 * @param nivelOcultamiento
	 * @param valor
	 * @param puntosAtaque
	 * @param puntosDefensa
	 * @param peso
	 */
	public Hechizo(String nombre, int nivelOcultamiento, int valor,
			int puntosAtaque, int puntosDefensa, int puntosVelocidad, int inteligenciaPrecisa) {
		super(nombre, nivelOcultamiento, valor);
		this.puntosAtaque = puntosAtaque;
		this.puntosDefensa = puntosDefensa;
		this.puntosVelocidad = puntosVelocidad;
		this.inteligenciaPrecisa = inteligenciaPrecisa;
	}

	
	/**
	 * puedoLanzarlo
	 * Método que dado un nivel de inteligencia nos dice
	 * si el hechizo puede ser lanzado o no.
	 * 
	 * @param inteligencia
	 * @return boolean
	 */
	public boolean puedoLanzarlo (int inteligencia) {
		return inteligencia >= inteligenciaPrecisa;
	}
	
	/**
	 * toString
	 * muestra un resumen de la información del objeto
	 */
	public String toString () {
		String resumen = "";
		
		resumen = super.toString();
		
		resumen = resumen + "Poder de ataque: " + puntosAtaque + "\n";
		resumen = resumen + "Poder defensivo: " + puntosDefensa + "\n";
		resumen = resumen + "Poder de velocidad: " + puntosVelocidad + "\n";
		resumen = resumen + "InteligenciaPrecisa: " + inteligenciaPrecisa + "\n";
		
		return resumen;
	}
}
