/**
 * 
 */

/**
 * @author pello altadill
 * @version 1.0
 */
public class Arma  extends ObjetoMazmorra {
	int puntosAtaque;
	int puntosDefensa;
	int peso;
	int aleacion;
	
	/**
	 * @param nombre
	 * @param nivelOcultamiento
	 * @param valor
	 * @param puntosAtaque
	 * @param puntosDefensa
	 * @param peso
	 */
	public Arma(String nombre, int nivelOcultamiento, int valor,
			int puntosAtaque, int puntosDefensa, int peso) {
		super(nombre, nivelOcultamiento, valor);
		this.puntosAtaque = puntosAtaque;
		this.puntosDefensa = puntosDefensa;
		this.peso = peso;
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
		resumen = resumen + "Peso: " + peso + "\n";
		
		return resumen;
	}
	

	
}
