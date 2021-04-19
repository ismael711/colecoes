package br.com.colecoes.principal;

import java.util.HashMap;
import java.util.Map;

import br.com.colecoes.modelo.Cargo;

public class TesteMap {

	public static void main(String[] args) {
		
		// Em uma lista do tipo Map, temos dois dados:
		// 1- chave (dado que não pode ser repetido)
		// 2- valor (dado que pode ser repetido - estrutura mais complexa)
		Map<Integer, Cargo> lista = new HashMap<Integer, Cargo>();
		lista.put(1, new Cargo("DBA", "JR", 5000));
		lista.put(2, new Cargo("DEV", "SR", 12000));
		lista.put(3, new Cargo("ANALISTA", "PL", 9000));
		System.out.println("Original: " + lista);
		
		System.out.println("Chaves: " + lista.keySet());
		
		for (Cargo cargo : lista.values()) {
			System.out.println("Cargo: " + cargo.getNome());
			System.out.println("Salário: " + cargo.getSalario());
		}

	}

}
