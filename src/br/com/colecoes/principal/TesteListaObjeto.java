package br.com.colecoes.principal;

import java.util.ArrayList;
import java.util.List;

import br.com.colecoes.modelo.Cargo;

public class TesteListaObjeto {

	public static void main(String[] args) {
		
		List<Cargo> lista = new ArrayList<Cargo>();
		lista.add(new Cargo("DBA", "SR", 25000));
		lista.add(new Cargo("ESTAGIÁRIO", "PL", 2500));
		lista.add(new Cargo("DEV", "JR", 3500));
		lista.add(new Cargo("ANALISTA", "SR", 15000));
		System.out.println(lista);
		System.out.println("Terceiro objeto: " + lista.get(2));
		
		int qtdeJr=0;
		double total=0;
		double totalDBA=0;
		//for convencional
		for (int cont=0; cont<lista.size(); cont++) {
			if (lista.get(cont).getNome().toUpperCase().equals("DBA")) {
				totalDBA+=lista.get(cont).getSalario();
			}
			total+=lista.get(cont).getSalario();
			if(lista.get(cont).getNivel().equals("JR")) {
				qtdeJr++;
			}
			
			System.out.println("Cargo: " + lista.get(cont).getNome());
			System.out.println("Salário: " + lista.get(cont).getSalario());
			System.out.println("Nível: " + lista.get(cont).getNivel());
		}
		System.out.println("Total de JR's: " + qtdeJr);
		System.out.println("Total de Salário: " + total);
		System.out.println("Média de Salário: " + (total/lista.size()));
		System.out.println("Total de Salários dos DBA's: " + totalDBA);
		
		//foreach
		System.out.println("Com Foreach");
		for (Cargo cargo : lista) {
			System.out.println("Cargo: " + cargo.getNome());
			System.out.println("Salário: " + cargo.getSalario());
			System.out.println("Nível: " + cargo.getNivel());
		}
		
		
		/* Missões:
		 * 1º Exibir quantos JR's temos na lista
		 * 2º Exibir o total de salários
		 * 3º Exibir a média de salários
		 * 4º Exibir o total de salários dos DBA's
		 */
		

	}

}
