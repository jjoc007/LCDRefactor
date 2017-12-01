package co.com.psl.prueba.procesos;

import java.util.List;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

import co.com.psl.prueba.excepciones.PruebaExcepcion;
import co.com.psl.prueba.modelo.NumeroDTO;
import co.com.psl.prueba.utils.Util;

/**
 * 
 * Se encarga de procesar las cifras que se van insertando
 * 
 * @author juan
 *
 */
public class Procesador {

	public static final String LINEA_TERMINACION = "0,0";

	public Procesador() {
		super();
	}

	/**
	 * 
	 * Procesa la cifra
	 * 
	 * @param cifras
	 *            coleccion de tipo NUmeroDTO que contiene los numeros de la cifra
	 *            ingresada
	 * @param tamano
	 *            tamaño ingresado
	 * @throws PruebaExcepcion 
	 */
	public List<NumeroDTO> procesarCifra(String cifra, int tamano) throws PruebaExcepcion {
		
		List<NumeroDTO> cifras = Util.validarSegundoParametroEntrada(cifra, tamano);

		ProcesadorNumero procesadorNumero = new ProcesadorNumero();

		cifras.forEach(c -> {
			try {
				procesadorNumero.construirNumero(c);
			} catch (PruebaExcepcion e) {
				e.printStackTrace();
			}
		});

		return cifras;
		
	}

	/**
	 * 
	 * Imprime la cifra completa en pantalla
	 * 
	 * @param cifras
	 *            coleccion de tipo NUmeroDTO que contiene los numeros de la cifra
	 *            ingresada
	 * @param tamano
	 *            tamaño ingresado
	 */
	public String imprimirCifra(List<NumeroDTO> cifras, int tamano) {

		StringBuilder resultado = new StringBuilder();

		for (int i = 0; i < (tamano * 2) + 1; i++) {

			final int fila = i;

			cifras.forEach(c -> {

				resultado.append(c.getLineas().get(fila).getLinea() + StringUtils.SPACE);

			});

			resultado.append(StringUtils.LF);
		}

		return resultado.toString();

	}

	public static void main(String... args) {

		Procesador p = new Procesador();

		try (Scanner scan = new Scanner(System.in);) {
			while (true) {

				String entrada = scan.nextLine();

				if (Procesador.LINEA_TERMINACION.equals(entrada)) {
					break;
				}

				String partes[] = entrada.split(",");

				if (partes.length != 2) {
					throw new PruebaExcepcion("Los parametros separados por ',' son incorrectos");
				}

				int tamano = Util.validarPrimerParametroEntrada(partes[0]);

				List<NumeroDTO> cifras = p.procesarCifra(partes[1], tamano);
				System.out.println(p.imprimirCifra(cifras, tamano));
				
			}

		} catch (PruebaExcepcion e) {
			e.printStackTrace();
		}

	}

}
