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

import junitparams.internal.Utils;

@RunWith(Parameterized.class)
public class FibonacciTest {

	
	
	@Parameterized.Parameters
	public static List<Object> datos(){
		List<Object> asList = Arrays.asList(new Object [][] {{1},{3},{5}});
		return asList;
		
	} 
	@Parameterized.Parameter(0)
	public int v1;
	
	Fibonacci Utils =new Fibonacci();
	
	@Test
	public void testFibonacci() {
		String resultado;
		String esperado1 = "0,1,1";
		String esperado2 = "0,1,1,2,3";
		String esperado3 = "0,1,1,2,3,5";
		
		resultado=Utils.bibonacci(v1);
		if (v1==1) {
			assertEquals(esperado1, resultado);
		}
		if (v1==3) {
			assertEquals(esperado2, resultado);
		}
		if (v1==5) {
			System.out.println(resultado);
			assertEquals(esperado3, resultado);
		}
		
		
	}

}
