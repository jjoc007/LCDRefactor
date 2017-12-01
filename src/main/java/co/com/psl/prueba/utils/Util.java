package co.com.psl.prueba.utils;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;

import co.com.psl.prueba.excepciones.PruebaExcepcion;
import co.com.psl.prueba.modelo.NumeroDTO;

/**
 * Clase utilitaria
 * 
 * @author juan
 *
 */
public class Util {

	/**
	 * 
	 * Valida el primer parametro que sea numerico y que este en el rango de 1 a 10
	 * 
	 * @param param
	 * @return
	 * @throws PruebaExcepcion
	 */
	public static int validarPrimerParametroEntrada(String param) throws PruebaExcepcion {

		Util.isNumeric(param);

		int tamano = Integer.parseInt(param);

		if (tamano < 1 || tamano > 10) {
			throw new PruebaExcepcion("el tamaño debe ser entre 1  y 10");
		}

		return tamano;

	}

	/**
	 * 
	 * valida el segundo parametro que sea numerico y crea una coleccion de numeroDTO con cada cifra 
	 * 
	 * @param param
	 * @param tamano
	 * @return
	 * @throws PruebaExcepcion
	 */
	public static List<NumeroDTO> validarSegundoParametroEntrada(String param, int tamano) throws PruebaExcepcion {

		Util.isNumeric(param);

		List<NumeroDTO> cifras = Stream.of(param.split("")).map(n -> new NumeroDTO(Integer.parseInt(n), tamano))
				.collect(Collectors.toList());

		return cifras;

	}

	
	/**
	 * 
	 * Valida que el string ingresado sea numerico
	 * 
	 * @param param
	 * @throws PruebaExcepcion
	 */
	public static void isNumeric(String param) throws PruebaExcepcion {
		if (!StringUtils.isNumeric(param)) {
			throw new PruebaExcepcion("Uno de los parametros no es numerico");
		}
	}

}
