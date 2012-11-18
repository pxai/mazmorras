/**
 * 
 */

/**
 * @author luser
 *
 */
public class Moneda extends ObjetoMazmorra {
	int cantidad;

	/**
	 * @param nombre
	 * @param nivelOcultamiento
	 * @param valor
	 * @param cantidad
	 */
	public Moneda(String nombre, int nivelOcultamiento, int valor, int cantidad) {
		super(nombre, nivelOcultamiento, valor);
		this.cantidad = cantidad;
	}
	/**
	 * toString
	 * muestra un resumen de la información del objeto
	 */
	public String toString () {
		String resumen = "";
		
		resumen = super.toString();
		
		resumen = resumen + "Cantidad monedas de oro: " + cantidad + "\n";
		
		return resumen;
	}
}
