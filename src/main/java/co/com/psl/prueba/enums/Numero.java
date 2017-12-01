package co.com.psl.prueba.enums;


/**
 * 
 * Este enum define la estructura de cada número
 * 
 * @author juan
 *
 */
public enum Numero {

	CERO(0,Relleno.H_LLENO, Relleno.H_VACIO_V_AMBOS, Relleno.H_VACIO_V_AMBOS,Relleno.H_VACIO_V_AMBOS,Relleno.H_LLENO_V_AMBOS),
	UNO(1,Relleno.H_VACIO, Relleno.H_VACIO_V_DERECHO, Relleno.H_VACIO_V_DERECHO,Relleno.H_VACIO_V_DERECHO,Relleno.H_VACIO_V_DERECHO),
	DOS(2,Relleno.H_LLENO, Relleno.H_VACIO_V_DERECHO, Relleno.H_LLENO_V_DERECHO,Relleno.H_VACIO_V_IZQUIERDO,Relleno.H_LLENO_V_IZQUIERDO),
	TRES(3,Relleno.H_LLENO, Relleno.H_VACIO_V_DERECHO, Relleno.H_LLENO_V_DERECHO,Relleno.H_VACIO_V_DERECHO,Relleno.H_LLENO_V_DERECHO),
	CUATRO(4,Relleno.H_VACIO, Relleno.H_VACIO_V_AMBOS, Relleno.H_LLENO_V_AMBOS,Relleno.H_VACIO_V_DERECHO,Relleno.H_VACIO_V_DERECHO),
	CINCO(5,Relleno.H_LLENO, Relleno.H_VACIO_V_IZQUIERDO, Relleno.H_LLENO_V_IZQUIERDO,Relleno.H_VACIO_V_DERECHO,Relleno.H_LLENO_V_DERECHO),
	SEIS(6,Relleno.H_LLENO, Relleno.H_VACIO_V_IZQUIERDO, Relleno.H_LLENO_V_IZQUIERDO,Relleno.H_VACIO_V_AMBOS,Relleno.H_LLENO_V_AMBOS),
	SIETE(7,Relleno.H_LLENO, Relleno.H_VACIO_V_DERECHO, Relleno.H_VACIO_V_DERECHO,Relleno.H_VACIO_V_DERECHO,Relleno.H_VACIO_V_DERECHO),
	OCHO(8,Relleno.H_LLENO, Relleno.H_VACIO_V_AMBOS, Relleno.H_LLENO_V_AMBOS,Relleno.H_VACIO_V_AMBOS,Relleno.H_LLENO_V_AMBOS),
	NUEVE(9,Relleno.H_LLENO, Relleno.H_VACIO_V_AMBOS, Relleno.H_LLENO_V_AMBOS,Relleno.H_VACIO_V_DERECHO,Relleno.H_LLENO_V_DERECHO);
	
	int id;
	
	Relleno superior;
	Relleno medioSuperior;
	Relleno medio;
	Relleno medioInferior;
	Relleno inferior;
	
	Numero(int id,Relleno superior, Relleno medioSuperior, Relleno medio, Relleno medioInferior, Relleno inferior) {
		
		this.id = id;
		this.superior =  superior;
		this.medioSuperior =  medioSuperior;
		this.medio =  medio;
		this.medioInferior =  medioInferior;
		this.inferior =  inferior;
		
	}

	public Relleno getSuperior() {
		return superior;
	}

	public Relleno getMedioSuperior() {
		return medioSuperior;
	}

	public Relleno getMedio() {
		return medio;
	}

	public Relleno getMedioInferior() {
		return medioInferior;
	}

	public Relleno getInferior() {
		return inferior;
	}
	
	public int getId() {
		return id;
	}

	public static Numero getById(int n) {
		
		for (Numero numero: Numero.values()) {
			
			if(numero.getId() == n) {
				return numero;
			}
		}
		
		return null;
	}
	
}
