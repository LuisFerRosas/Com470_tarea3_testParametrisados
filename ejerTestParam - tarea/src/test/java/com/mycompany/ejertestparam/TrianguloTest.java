package com.mycompany.ejertestparam;

import static org.junit.Assert.*;



import java.util.List;
import org.assertj.core.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TrianguloTest {

	@Parameterized.Parameters
	public static List<Object> datos(){
		List<Object> asList = Arrays.asList(new Object [][] {{2,2,2},{2,2,3},{2,3,4},{3,2,2},{2,3,2},{3,2,1}});
		return asList;
		
	}
	
	@Parameterized.Parameter(0)
	public int valor1;
	@Parameterized.Parameter(1)
	public int valor2;
	@Parameterized.Parameter(2)
	public int valor3;
	
	Triangulo operaciones = new Triangulo();
	
	
	@Test
	public void testTipoTriangulo() {
		
		System.out.println("Los parametros son : l1 = "+valor1+" l2 = "+valor2+"l3 = "+valor3);
		String resultado = operaciones.tipoTriangulo(valor1, valor2, valor3);
		if(valor1==valor2 && valor2==valor3) {
			// resultado Equilatero
			assertEquals("Equilatero", resultado);
		}else if (valor1==valor2 || valor1==valor3 || valor2==valor3) {
			// resultado isoceles
			assertEquals("Isoceles", resultado);
		}if (valor1 != valor2 && valor1 != valor3 && valor3 !=valor2) {
			// resultado Escaleno
			assertEquals("Escaleno", resultado);
		}
	}

}
