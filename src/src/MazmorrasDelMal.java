/**
 * $Id$
 * Mazmorras del Maaaaal
 */

/**
 * @author Pello Altadill
 * Clase principal. Inicia todo.
 */
public class MazmorrasDelMal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int TAMANO_POR_DEFECTO = 10;
		int tamano = TAMANO_POR_DEFECTO;
		
		// Si nos pasaron un
		if (args.length == 1) {
			try {
				tamano = Integer.parseInt(args[0]);
			} catch (Exception e) {
				tamano = TAMANO_POR_DEFECTO;
			} finally { // en cualquier caso, si el número es negativo
						// lo ponemos a 10.
				if (tamano <= 0) {
					tamano = TAMANO_POR_DEFECTO;
				}
			}
		}
		
		System.out.println("Iniciando con tamaño: " + tamano);
	}

}
