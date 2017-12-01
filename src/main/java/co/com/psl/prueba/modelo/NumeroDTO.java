package co.com.psl.prueba.modelo;

import java.util.ArrayList;
import java.util.List;

import co.com.psl.prueba.enums.Numero;

/**
 * 
 * bean que define la estructura general de un numero
 * 
 * @author juan
 *
 */
public class NumeroDTO {

	int numero;
	int tamano;
	int columnasInternas;
	Numero modelo;

	List<Linea> lineas;

	public NumeroDTO() {
		super();

		lineas = new ArrayList<>();

	}

	public NumeroDTO(int numero, int tamano) {
		super();
		this.setNumero(numero);
		this.setTamano(tamano);
		lineas = new ArrayList<>();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
		this.setModelo(numero);
	}

	public List<Linea> getLineas() {
		return lineas;
	}

	public void setLineas(List<Linea> lineas) {
		this.lineas = lineas;
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
		columnasInternas = (tamano * 2) - 1;

	}

	public int getColumnasInternas() {
		return columnasInternas;
	}

	public void setColumnasInternas(int columnasInternas) {
		this.columnasInternas = columnasInternas;
	}

	public Numero getModelo() {
		return modelo;
	}

	public void setModelo(Numero modelo) {
		this.modelo = modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = Numero.getById(modelo);
	}

}
