package co.com.psl.prueba.modelo;

/**
 * 
 * bean que define el resultado de una linea para un numero.
 * 
 * @author juan
 *
 */
public class LineaDTO {

	private String linea;

	public LineaDTO(String linea) {
		super();
		this.linea = linea;
	}

	public String getLinea() {
		return linea;
	}

	public void setLinea(String linea) {
		this.linea = linea;
	}

}
