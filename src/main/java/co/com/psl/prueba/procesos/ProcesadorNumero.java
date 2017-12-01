package co.com.psl.prueba.procesos;

import org.apache.commons.lang3.StringUtils;

import co.com.psl.prueba.enums.Relleno;
import co.com.psl.prueba.excepciones.PruebaExcepcion;
import co.com.psl.prueba.modelo.LineaDTO;
import co.com.psl.prueba.modelo.NumeroDTO;

/**
 * 
 * Procesa y genera el numero ingresado en en cadena
 * 
 * @author juan
 *
 */
public class ProcesadorNumero {

	public static final String PIPE = "|";
	public static final String UNDERSCORE = "_";

	public ProcesadorNumero() {
		super();
	}

	/**
	 * Metodo que se encarga de construir un numero dado
	 * 
	 * @param numero numero a construir
	 * @throws PruebaExcepcion 
	 */
	public void construirNumero(NumeroDTO numero) throws PruebaExcepcion {

		construirLinea(numero, numero.getModelo().getSuperior());

		for (int i = 0; i < numero.getTamano() - 1; i++) {
			construirLinea(numero, numero.getModelo().getMedioSuperior());
		}

		construirLinea(numero, numero.getModelo().getMedio());

		for (int i = 0; i < numero.getTamano() - 1; i++) {
			construirLinea(numero, numero.getModelo().getMedioInferior());
		}

		construirLinea(numero, numero.getModelo().getInferior());

	}

	
	/**
	 * 
	 * Metodo que se encarga de construir una linea especifica de un numero, teniendo en cuenta la estructura de esa linea
	 * 
	 * @param numero
	 * @param relleno
	 * @throws PruebaExcepcion 
	 */
	private void construirLinea(NumeroDTO numero, Relleno relleno) throws PruebaExcepcion {

		StringBuilder linea = new StringBuilder();

		switch (relleno) {
		case H_LLENO:
			linea.append(StringUtils.SPACE);
			rellenarColumnasInternas(linea, numero);
			linea.append(StringUtils.SPACE);
			break;
		case H_VACIO:
			linea.append(StringUtils.SPACE);
			rellenarVaciosColumnasInternas(linea, numero);
			linea.append(StringUtils.SPACE);
			break;
		case H_LLENO_V_IZQUIERDO:
			linea.append(ProcesadorNumero.PIPE);
			rellenarColumnasInternas(linea, numero);
			linea.append(StringUtils.SPACE);
			break;
		case H_LLENO_V_DERECHO:
			linea.append(StringUtils.SPACE);
			rellenarColumnasInternas(linea, numero);
			linea.append(ProcesadorNumero.PIPE);
			break;
		case H_LLENO_V_AMBOS:
			linea.append(ProcesadorNumero.PIPE);
			rellenarColumnasInternas(linea, numero);
			linea.append(ProcesadorNumero.PIPE);
			break;
		case H_VACIO_V_IZQUIERDO:
			linea.append(ProcesadorNumero.PIPE);
			rellenarVaciosColumnasInternas(linea, numero);
			linea.append(StringUtils.SPACE);
			break;
		case H_VACIO_V_DERECHO:
			linea.append(StringUtils.SPACE);
			rellenarVaciosColumnasInternas(linea, numero);
			linea.append(ProcesadorNumero.PIPE);
			break;
		case H_VACIO_V_AMBOS:
			linea.append(ProcesadorNumero.PIPE);
			rellenarVaciosColumnasInternas(linea, numero);
			linea.append(ProcesadorNumero.PIPE);
			break;

		default:
			throw new PruebaExcepcion("Estructura de relleno no soportada.");
		}

		numero.getLineas().add(new LineaDTO(linea.toString()));

	}

	/**
	 * 
	 * Hace el relleno de una fila intercalando espacios y guines bajos
	 * 
	 * @param linea 
	 * @param numero
	 */
	private void rellenarColumnasInternas(StringBuilder linea, NumeroDTO numero) {

		for (int i = 0; i < numero.getColumnasInternas(); i++) {

			if (i % 2 == 0) {
				linea.append(ProcesadorNumero.UNDERSCORE);
			} else {
				linea.append(StringUtils.SPACE);
			}
		}

	}

	
	/**
	 * 
	 * Rellena una fila con espacios
	 * 
	 * @param linea
	 * @param numero
	 */
	private void rellenarVaciosColumnasInternas(StringBuilder linea, NumeroDTO numero) {

		String format = "%1$-" + numero.getColumnasInternas() + "s";
		linea.append(String.format(format, ""));

	}

}
