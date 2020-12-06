package com.mycompany.ejertestparam;

import static org.junit.Assert.*;
import java.util.List;
import org.assertj.core.util.Arrays;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class PalindromoTest {

	
	@Parameterized.Parameters
	public static List<Object> datos(){
		List<Object> asList = Arrays.asList(new Object [][] {{"somos",true},{"arana",false},{"rana",false}});
		return asList;
		
	}
	@Parameterized.Parameter(0)
	public String valor1;
	@Parameterized.Parameter(1)
	public boolean resultado;
	
	Palindromo  pal = new Palindromo();
	
	@Test
	public void testBuscaPalindromo() {
		assertEquals(resultado, pal.buscaPalindromo(valor1));
	}
  
}
