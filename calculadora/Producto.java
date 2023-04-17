package calculadora;

/**
 * <p>Producto</p>
 * Clase que busca realizar operaciones de multiplicación entre diferentes números, con dos operando enteros o decimales o tres operando decimales. También sirve para hacer potencias.
 */
public class Producto {

	/**
	 * Método de instancia que calcula la multiplicación de dos números de tipo float pasados como parámetro. No muestra el resultado, lo devuelve.
	 * @param a primer operando de la cuenta, de tipo <b>float</b>
	 * @param b segundo operando de la cuenta, de tipo <b>float</b>
	 * @return el resultado de multiplicar los dos parámetros, de tipo <b>float</b>
	 */
	public float dosReales(float a, float b) {
		return a*b;
	}
	/**
	 * Método de instancia que calcula la multiplicación de dos números de tipo int pasados como parámetro. No muestra el resultado, lo devuelve.
	 * @param a primer operando de la cuenta, de tipo <b>int</b>
	 * @param b segundo operando de la cuenta, de tipo <b>int</b>
	 * @return el resultado de multiplicar los dos parámetros, de tipo <b>int</b>
	 */
	public int dosEnteros(int a, int b) {
		return a*b;
	}
	/**
	 * Método de instancia que calcula la multiplicación de tres números de tipo float pasados como parámetro. No muestra el resultado, lo devuelve.
	 * @param a primer operando de la cuenta, de tipo float
	 * @param b segundo operando de la cuenta, de tipo float
	 * @param c tercer operando de la cuenta, de tipo float
	 * @return el resultado de multiplicar los tres parámetros, de tipo <b>float</b>
	 */
	public float tresReales(float a, float b, float c) {
		return a*b*c;
	}
	/**
	 * Método de instancia que calcula la potencia de dos números pasados como parámetro.
	 * @param base sería en matemáticas la base utilizada en las potencias para que se multiplique por sí misma n veces, de tipo <b>double</b>
	 * @param exponente sería en matemáticas el exponente utilizado en las potencias, de tipo <b>double</b>
	 * @return el resultado de la potencia con los parámetros de la base y el exponente, de tipo <b>double</b>
	 */
	public double potencia(double base, double exponente) {
		return Math.pow(base, exponente);
	}
}
