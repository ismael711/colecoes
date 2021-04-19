package br.com.colecoes.principal;

import java.util.ArrayList;
import java.util.List;

import br.com.colecoes.modelo.Cargo;

public class TesteListaObjeto {

	public static void main(String[] args) {
		
		List<Cargo> lista = new ArrayList<Cargo>();
		lista.add(new Cargo("DBA", "SR", 25000));
		lista.add(new Cargo("ESTAGI�RIO", "PL", 2500));
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
			System.out.println("Sal�rio: " + lista.get(cont).getSalario());
			System.out.println("N�vel: " + lista.get(cont).getNivel());
		}
		System.out.println("Total de JR's: " + qtdeJr);
		System.out.println("Total de Sal�rio: " + total);
		System.out.println("M�dia de Sal�rio: " + (total/lista.size()));
		System.out.println("Total de Sal�rios dos DBA's: " + totalDBA);
		
		//foreach
		System.out.println("Com Foreach");
		for (Cargo cargo : lista) {
			System.out.println("Cargo: " + cargo.getNome());
			System.out.println("Sal�rio: " + cargo.getSalario());
			System.out.println("N�vel: " + cargo.getNivel());
		}
		
		
		/* Miss�es:
		 * 1� Exibir quantos JR's temos na lista
		 * 2� Exibir o total de sal�rios
		 * 3� Exibir a m�dia de sal�rios
		 * 4� Exibir o total de sal�rios dos DBA's
		 */
		

	}

}
