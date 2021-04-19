package br.com.colecoes.principal;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {
		
		// Cria pelo pai e instacia pelo filho
		Set<String> lista = new HashSet<String>();
		lista.add("DBA");
		lista.add("ESTAGIÁRIO");
		lista.add("FULL STACK");
		lista.add("DBA");
		System.out.println("Original: " + lista);
		
		for (String cargo : lista) {
			System.out.println("Cargo: " + cargo);
		}

	}

}
