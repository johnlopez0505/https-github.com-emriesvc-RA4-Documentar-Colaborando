package calculadora;
/**
 * clase que nos permite realizar varias operaciones de suma 
 * utilizando diversos metodos.
 * @author john
 * @version 0.0.1
 * @since 0.0.1
 */

public class Suma {
	
	public float valorAcumulado;

	/**
	 * Metodo que obtiene el valor de nuestro atributo valorAcumulado. 
	 * @return el valor acumulado.
	 */
	public float getValorAcumulado() {
		return valorAcumulado;
	}

	/**
	 * metodo que nos permite cambiar el valor de nuestro atributo valorAcumulado.
	 * @param valorAcumulado el valor a cambiar.
	 */
	public void setValorAcumulado(float valorAcumulado) {
		this.valorAcumulado = valorAcumulado;
	}
	
	/**
	 * metodo que recibe como parametros dos numeros float y nos devuelve la sumade los mismos.
	 * @param a coeficiente de a
	 * @param b coeficiente de b
	 * @return devuelve la suma del parametro a + el parametro b
	 */
	public float dosReales(float a, float b) {
		return a+b;
	}

	/**
	 * metodo que recibe como parametros dos numeros enteros y nos devuelve la suma de los mismos.
	 * @param a coeficiente de a.
	 * @param b coeficiente de b.
	 * @return La suma de a+b.
	 */
	public int dosEnteros(int a, int b) {
		return a+b;
	}

	/**
	 * metodo que recibe tres numeros float como parametro y nos devuelve la suma de los mismos.
	 * @param a coeficiente de a.
	 * @param b coeficiente de b.
	 * @param c coeficiente de c.
	 * @return La suma de a+b+c.
	 */
	public float tresReales(float a, float b, float c) {
		return a+b+c;
	}
	
	/**
	 * metodo que recibe como parametro un numero float y nos devuelve el valor acumulado.
	 * @param a coeficiente de a.
	 * @return retorna elvalor acumulado.
	 */
	public float sumaAcumulado(float a) {
		valorAcumulado = a + valorAcumulado;
		return valorAcumulado;
	}
}



