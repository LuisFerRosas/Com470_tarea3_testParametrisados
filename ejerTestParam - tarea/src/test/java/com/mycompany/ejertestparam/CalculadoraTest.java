package com.mycompany.ejertestparam;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;
import org.assertj.core.util.Arrays;


import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CalculadoraTest {

	@Parameterized.Parameters
	public static List<Object> datos(){
		List<Object> asList = Arrays.asList(new Object [][] {{9,3},{3,5},{5,0},{0,5}});
		return asList;
		
	} 
	@Parameterized.Parameter(0)
	public int v1;
	@Parameterized.Parameter(1)
	public int v2;
	
	Calculadora cal = new Calculadora();
	
	@Test
	public void testSuma() {
		assertEquals(v1+v2, cal.suma(v1, v2));
	}
	@Test
	public void testResta() {
		assertEquals(v1-v2, cal.resta(v1, v2));
	}
	@Test
	public void testMultiplicacion() {
		assertEquals(v1*v2, cal.multimplicacion(v1, v2));
	}
	
	
	
	@Test
	public void testDivision() {
		try {
			int resultado =cal.division(v1, v2);
			
			assertEquals(v1/v2, resultado);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			assertEquals("No se puede dividir entre 0", e.getMessage());
		}
//		
		
		
		
		
	}

}
