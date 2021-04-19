package br.com.colecoes.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Características da manipulação de vetores:
 * - seu tamanho é estático
 * - precesia de um recurso para representar o índice
 * - os dados são homogeneios (TODOS são do mesmo tipo)
 * - não dá para eliminar uma posição em tempo de execução
 * - ordenação dá trabalho!!!
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
		lista.add("ESTAGIÁRIO");
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
