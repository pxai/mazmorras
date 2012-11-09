import java.util.ArrayList;

/**
 * 
 */

/**
 * @author luser
 *
 */
public class Grimorio extends ArrayList<Hechizo>{
	/**
	 * meter
	 * Mete nuevo elemento
	 * @param nuevoHechizo
	 */
	public void meter (Hechizo nuevoHechizo) {
		this.add(nuevoHechizo);
	}
	
	/**
	 * sacar
	 * Saca un elemento
	 * @param hechizo
	 */
	public void sacar (Hechizo hechizo) {
		this.remove(hechizo);
	}
	
	/**
	 * toString
	 * Nos vuelca todo el contenido del grimorio
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
