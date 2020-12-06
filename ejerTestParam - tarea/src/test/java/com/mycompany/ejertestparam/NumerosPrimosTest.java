/**
 * 
 */
package com.mycompany.ejertestparam;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.List;
import org.assertj.core.util.Arrays;


import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class NumerosPrimosTest {

	
	@Parameterized.Parameters
	public static List<Object> datos(){
		List<Object> asList = Arrays.asList(new Object [][] {{11,true},{4,false},{101,true},{12,false}});
		return asList;
		
	}
	@Parameterized.Parameter(0)
	public int valor1;
	@Parameterized.Parameter(1)
	public boolean resultado;
	
	NumeroPrimo oper = new NumeroPrimo();
	
	@Test
	public void testNumeroPrimos() {
		assertEquals(resultado, oper.validate(valor1));
	}

}
