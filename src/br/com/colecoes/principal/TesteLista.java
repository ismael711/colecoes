package br.com.colecoes.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Caracter�sticas da manipula��o de vetores:
 * - seu tamanho � est�tico
 * - precesia de um recurso para representar o �ndice
 * - os dados s�o homogeneios (TODOS s�o do mesmo tipo)
 * - n�o d� para eliminar uma posi��o em tempo de execu��o
 * - ordena��o d� trabalho!!!
 * 
 */

public class TesteLista {

	public static void main(String[] args) {
		
		/*int[] numeros = new int[999];
		int indice = 0;
		numeros[indice] = 50;
		indice++;
		numeros[indice] = 38;
		indice++;
		numeros[indice] = 17;
		System.out.println(numeros[1]);
		*/
		
		List<String> lista = new ArrayList<String>();
		lista.add("DEV");
		lista.add("ESTAGI�RIO");
		lista.add("ANALISTA");
		lista.add("GERENTE DE PROJETO");
		lista.add("DBA");
		System.out.println(lista);
		System.out.println("Segundo elemento: " + lista.get(1));
		lista.remove(2);
		System.out.println("Depois de excluir: " + lista);
		Collections.sort(lista);
		System.out.println("Ordenada: " + lista);
		
		int contDBA=0;
		for(int cont=0;cont<lista.size();cont++) {
			System.out.println("Cargo: " + lista.get(cont));
			if (lista.get(cont).toUpperCase().equals("DBA")) {
				contDBA++;
			}
		}
		
		
		
		
		
	}

}
