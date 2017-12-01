package co.com.psl.prueba.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import co.com.psl.prueba.excepciones.PruebaExcepcion;
import co.com.psl.prueba.modelo.NumeroDTO;
import co.com.psl.prueba.procesos.Procesador;

public class TestProcesador {

	private StringBuilder numero1tamano1;
	private StringBuilder numero2tamano2;
	private StringBuilder numero3tamano3;
	private StringBuilder numero4tamano4;
	private StringBuilder numero5tamano5;
	private StringBuilder numero6tamano6;
	private StringBuilder numero7tamano7;
	private StringBuilder numero8tamano8;
	private StringBuilder numero9tamano9;
	private StringBuilder numero0tamano10;
	
    @Before
    public void initObjects() {
    	numero1tamano1 = new StringBuilder();
    	numero1tamano1.append("    \n");
    	numero1tamano1.append("  | \n");
    	numero1tamano1.append("  | \n");
    	
    	numero2tamano2 = new StringBuilder();
    	numero2tamano2.append(" _ _  \n");
    	numero2tamano2.append("    | \n");
    	numero2tamano2.append(" _ _| \n");
    	numero2tamano2.append("|     \n");
    	numero2tamano2.append("|_ _  \n");
    	
    	numero3tamano3 = new StringBuilder();
    	numero3tamano3.append(" _ _ _  \n");
    	numero3tamano3.append("      | \n");
    	numero3tamano3.append("      | \n");
    	numero3tamano3.append(" _ _ _| \n");
    	numero3tamano3.append("      | \n");
    	numero3tamano3.append("      | \n");
    	numero3tamano3.append(" _ _ _| \n");
    	
    	numero4tamano4 = new StringBuilder();
    	numero4tamano4.append("          \n");
    	numero4tamano4.append("|       | \n");
    	numero4tamano4.append("|       | \n");
    	numero4tamano4.append("|       | \n");
    	numero4tamano4.append("|_ _ _ _| \n");
    	numero4tamano4.append("        | \n");
    	numero4tamano4.append("        | \n");
    	numero4tamano4.append("        | \n");
    	numero4tamano4.append("        | \n");
    	
    	numero5tamano5 = new StringBuilder();
    	numero5tamano5.append(" _ _ _ _ _  \n");
    	numero5tamano5.append("|           \n");
    	numero5tamano5.append("|           \n");
    	numero5tamano5.append("|           \n");
    	numero5tamano5.append("|           \n");
    	numero5tamano5.append("|_ _ _ _ _  \n");
    	numero5tamano5.append("          | \n");
    	numero5tamano5.append("          | \n");
    	numero5tamano5.append("          | \n");
    	numero5tamano5.append("          | \n");
    	numero5tamano5.append(" _ _ _ _ _| \n");
    	
    	numero6tamano6 = new StringBuilder();
    	numero6tamano6.append(" _ _ _ _ _ _  \n");
    	numero6tamano6.append("|             \n");
    	numero6tamano6.append("|             \n");
    	numero6tamano6.append("|             \n");
    	numero6tamano6.append("|             \n");
    	numero6tamano6.append("|             \n");
    	numero6tamano6.append("|_ _ _ _ _ _  \n");
    	numero6tamano6.append("|           | \n");
    	numero6tamano6.append("|           | \n");
    	numero6tamano6.append("|           | \n");
    	numero6tamano6.append("|           | \n");
    	numero6tamano6.append("|           | \n");
    	numero6tamano6.append("|_ _ _ _ _ _| \n");
    	
    	numero7tamano7 = new StringBuilder();
    	numero7tamano7.append(" _ _ _ _ _ _ _  \n");
    	numero7tamano7.append("              | \n");
    	numero7tamano7.append("              | \n");
    	numero7tamano7.append("              | \n");
    	numero7tamano7.append("              | \n");
    	numero7tamano7.append("              | \n");
    	numero7tamano7.append("              | \n");
    	numero7tamano7.append("              | \n");
    	numero7tamano7.append("              | \n");
    	numero7tamano7.append("              | \n");
    	numero7tamano7.append("              | \n");
    	numero7tamano7.append("              | \n");
    	numero7tamano7.append("              | \n");
    	numero7tamano7.append("              | \n");
    	numero7tamano7.append("              | \n");
    	
    	numero8tamano8 = new StringBuilder();
    	numero8tamano8.append(" _ _ _ _ _ _ _ _  \n");
    	numero8tamano8.append("|               | \n");
    	numero8tamano8.append("|               | \n");
    	numero8tamano8.append("|               | \n");
    	numero8tamano8.append("|               | \n");
    	numero8tamano8.append("|               | \n");
    	numero8tamano8.append("|               | \n");
    	numero8tamano8.append("|               | \n");
    	numero8tamano8.append("|_ _ _ _ _ _ _ _| \n");
    	numero8tamano8.append("|               | \n");
    	numero8tamano8.append("|               | \n");
    	numero8tamano8.append("|               | \n");
    	numero8tamano8.append("|               | \n");
    	numero8tamano8.append("|               | \n");
    	numero8tamano8.append("|               | \n");
    	numero8tamano8.append("|               | \n");
    	numero8tamano8.append("|_ _ _ _ _ _ _ _| \n");
    	
    	numero9tamano9 = new StringBuilder();
    	numero9tamano9.append(" _ _ _ _ _ _ _ _ _  \n");
    	numero9tamano9.append("|                 | \n");
    	numero9tamano9.append("|                 | \n");
    	numero9tamano9.append("|                 | \n");
    	numero9tamano9.append("|                 | \n");
    	numero9tamano9.append("|                 | \n");
    	numero9tamano9.append("|                 | \n");
    	numero9tamano9.append("|                 | \n");
    	numero9tamano9.append("|                 | \n");
    	numero9tamano9.append("|_ _ _ _ _ _ _ _ _| \n");
    	numero9tamano9.append("                  | \n");
    	numero9tamano9.append("                  | \n");
    	numero9tamano9.append("                  | \n");
    	numero9tamano9.append("                  | \n");
    	numero9tamano9.append("                  | \n");
    	numero9tamano9.append("                  | \n");
    	numero9tamano9.append("                  | \n");
    	numero9tamano9.append("                  | \n");
    	numero9tamano9.append(" _ _ _ _ _ _ _ _ _| \n");

    	numero0tamano10 = new StringBuilder();
    	numero0tamano10.append(" _ _ _ _ _ _ _ _ _ _  \n");
    	numero0tamano10.append("|                   | \n");
    	numero0tamano10.append("|                   | \n");
    	numero0tamano10.append("|                   | \n");
    	numero0tamano10.append("|                   | \n");
    	numero0tamano10.append("|                   | \n");
    	numero0tamano10.append("|                   | \n");
    	numero0tamano10.append("|                   | \n");
    	numero0tamano10.append("|                   | \n");
    	numero0tamano10.append("|                   | \n");
    	numero0tamano10.append("|                   | \n");
    	numero0tamano10.append("|                   | \n");
    	numero0tamano10.append("|                   | \n");
    	numero0tamano10.append("|                   | \n");
    	numero0tamano10.append("|                   | \n");
    	numero0tamano10.append("|                   | \n");
    	numero0tamano10.append("|                   | \n");
    	numero0tamano10.append("|                   | \n");
    	numero0tamano10.append("|                   | \n");
    	numero0tamano10.append("|                   | \n");
    	numero0tamano10.append("|_ _ _ _ _ _ _ _ _ _| \n");
    	
    }
	
	@Test
	public void testNumero1Tamano1() {
		
		try {
			int tamano = 1;
			Procesador p  = new Procesador();
			List<NumeroDTO> cifras = p.procesarCifra("1", tamano);
			
			assertEquals(p.imprimirCifra(cifras, tamano),numero1tamano1.toString());
			
		} catch (PruebaExcepcion e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testNumero2Tamano2() {
		
		try {
			int tamano = 2;
			Procesador p  = new Procesador();
			List<NumeroDTO> cifras = p.procesarCifra("2", tamano);
			
			assertEquals(p.imprimirCifra(cifras, tamano),numero2tamano2.toString());
			
		} catch (PruebaExcepcion e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testNumero3Tamano3() {
		
		try {
			int tamano = 3;
			Procesador p  = new Procesador();
			List<NumeroDTO> cifras = p.procesarCifra("3", tamano);
			
			assertEquals(p.imprimirCifra(cifras, tamano),numero3tamano3.toString());
			
		} catch (PruebaExcepcion e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testNumero4Tamano4() {
		
		try {
			int tamano = 4;
			Procesador p  = new Procesador();
			List<NumeroDTO> cifras = p.procesarCifra("4", tamano);
			
			assertEquals(p.imprimirCifra(cifras, tamano),numero4tamano4.toString());
			
		} catch (PruebaExcepcion e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testNumero5Tamano5() {
		
		try {
			int tamano = 5;
			Procesador p  = new Procesador();
			List<NumeroDTO> cifras = p.procesarCifra("5", tamano);
			
			assertEquals(p.imprimirCifra(cifras, tamano),numero5tamano5.toString());
			
		} catch (PruebaExcepcion e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testNumero6Tamano6() {
		
		try {
			int tamano = 6;
			Procesador p  = new Procesador();
			List<NumeroDTO> cifras = p.procesarCifra("6", tamano);
			
			assertEquals(p.imprimirCifra(cifras, tamano),numero6tamano6.toString());
			
		} catch (PruebaExcepcion e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testNumero7Tamano7() {
		
		try {
			int tamano = 7;
			Procesador p  = new Procesador();
			List<NumeroDTO> cifras = p.procesarCifra("7", tamano);
			
			assertEquals(p.imprimirCifra(cifras, tamano),numero7tamano7.toString());
			
		} catch (PruebaExcepcion e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testNumero8Tamano8() {
		
		try {
			int tamano = 8;
			Procesador p  = new Procesador();
			List<NumeroDTO> cifras = p.procesarCifra("8", tamano);
			
			assertEquals(p.imprimirCifra(cifras, tamano),numero8tamano8.toString());
			
		} catch (PruebaExcepcion e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testNumero9Tamano9() {
		
		try {
			int tamano = 9;
			Procesador p  = new Procesador();
			List<NumeroDTO> cifras = p.procesarCifra("9", tamano);
			
			assertEquals(p.imprimirCifra(cifras, tamano),numero9tamano9.toString());
			
		} catch (PruebaExcepcion e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testNumero0Tamano10() {
		
		try {
			int tamano = 10;
			Procesador p  = new Procesador();
			List<NumeroDTO> cifras = p.procesarCifra("0", tamano);
			
			assertEquals(p.imprimirCifra(cifras, tamano),numero0tamano10.toString());
			
		} catch (PruebaExcepcion e) {
			e.printStackTrace();
		}
		
	}
	
}
