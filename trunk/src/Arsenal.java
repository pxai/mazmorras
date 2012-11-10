import java.util.ArrayList;

/**
 * 
 */

/**
 * @author luser
 *
 */
public class Arsenal extends ArrayList<Arma> {
	
	/**
	 * meter
	 * Mete nuevo elemento
	 * @param nuevaArma
	 */
	public void meter (Arma nuevaArma) {
		this.add(nuevaArma);
	}
	
	/**
	 * sacar
	 * Saca un elemento
	 * @param arma
	 */
	public void sacar (Arma arma) {
		this.remove(arma);
	}
	
	/**
	 * toString
	 * Nos vuelca todo el contenido del Arsenal
	 * @return String
	 */
	public String toString () {
		String resumen = "";
		for (int i = 0; i < this.size(); i++) {
			resumen = resumen + this.get(i).toString();
		}
		return resumen;
	}
}
