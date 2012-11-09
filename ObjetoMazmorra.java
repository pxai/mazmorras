/**
 * 
 */

/**
 * @author luser
 *
 */
public class ObjetoMazmorra {

	String nombre;
	int nivelOcultamiento;	
	int valor;

	/**
	 * @param nombre
	 * @param nivelOcultamiento
	 * @param valor
	 */
	public ObjetoMazmorra(String nombre, int nivelOcultamiento, int valor) {
		super();
		this.nombre = nombre;
		this.nivelOcultamiento = nivelOcultamiento;
		this.valor = valor;
	}
	
	/**
	 * objetoEncontrado
	 * Nos dice según la tirada de inteligencia si el objeto se encuentra
	 * o no.
	 * @param tiradaInteligencia
	 * @return
	 */
	public boolean objetoEncontrado (int tiradaInteligencia) {
		return tiradaInteligencia >= nivelOcultamiento;
	}
	
	/**
	 * toString
	 * muestra un resumen de la información del objeto
	 */
	public String toString () {
		String resumen = "";
		
		resumen = resumen + "Nombre: " + nombre + "\n";
		resumen = resumen + "Valor: " + valor + "\n";
		resumen = resumen + "Ocultamiento: " + nivelOcultamiento + "\n";
		
		return resumen;
	}
}
