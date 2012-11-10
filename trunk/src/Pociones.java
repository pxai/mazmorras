import java.util.ArrayList;

/**
 * 
 */

/**
 * @author luser
 *
 */
public class Pociones extends ArrayList<Pocion>{
	/**
	 * meter
	 * Mete nuevo elemento
	 * @param nuevaPocion
	 */
	public void meter (Pocion nuevaPocion) {
		this.add(nuevaPocion);
	}
	
	/**
	 * sacar
	 * Saca un elemento
	 * @param pocion
	 */
	public void sacar (Pocion pocion) {
		this.remove(pocion);
	}
	
	/**
	 * toString
	 * Nos vuelca todo el contenido de las pociones
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
