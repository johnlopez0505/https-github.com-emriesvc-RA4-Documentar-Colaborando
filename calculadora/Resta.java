package calculadora;
/**
 * /**
 * En esta clase hay metodos que sirven para hacer restas en la calculadora
 * @see calculadora
 * @author Francisco Nolasco Romero
 * @version 1.0.0
 * @since 1.0
 *
 */

public class Resta {

	/**
	 * Atributo de la clase de tipo float el cual sera el valor acumulado
	 */
	public float valorAcumulado;
	/**
	 * Metodo el cual devuelve un float el cual es el valor acumulado
	 * @return valorAcumulado
	 */
	public float getValorAcumulado() {
		return valorAcumulado;
	}
	/**
	 * Metodo el cual cambia el valor del atributo valorAcumulado.
	 * @param se le para como atributo el valorAcumulado que queremos cambiar de tipo float
	 */
	public void setValorAcumulado(float valorAcumulado) {
		this.valorAcumulado = valorAcumulado;
	}

	/**
	 * metodo que resta dos numeros reales que le pasa el usuario
	 * @param a Es el valor que le pasa el usuario de tipo float
	 * @param b Es el valor que le pasa el usuario de tipo float
	 * @return devuelve la resta de valor a y valor b en tipo float
	 */
	public float dosReales(float a, float b) {
		return a-b;
	}
	/**
	 * metodo que resta dos numeros enteros que le pasa el usuario
	 * @param a Es el valor que le pasa el usuario de tipo int
	 * @param b Es el valor que le pasa el usuario de tipo int
	 * @return devuelve la resta de valor a y valor b en tipo int
	 */
	public int dosEnteros(int a, int b) {
		return a-b;
	}
	/**
	 * metodo que resta tres numeros reales que le pasa el usuario
	 * @param a Es el valor que le pasa el usuario de tipo float
	 * @param b Es el valor que le pasa el usuario de tipo float
	 * @param c Es el valor que le pasa el usuario de tipo float
	 * @return devuelve la resta de valor a y valor b en tipo float
	 */
	public float tresReales(float a, float b, float c) {
		return a-b-c;
	}
	/**
	 * Metodo que resta el valor acumulado y un valor que le pasa el usuario
	 * @param a valor float que le pasa el usuario
	 * @return Retorna un float que es el valor acumulado menos a.
	 */
	public float restaAcumulado(float a) {
		valorAcumulado = valorAcumulado - a;
		return valorAcumulado;
	}
}
