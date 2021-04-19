package br.com.colecoes.modelo;

public class Cargo implements Comparable<Cargo> {
	
	private String nome;
	private String nivel;
	private double salario;
	
	
	@Override
	public String toString() {
		return "Cargo [nome=" + nome + ", nivel=" + nivel + ", salario=" + salario + "]";
	}
	public void setAll(String nome, String nivel, double salario) {
		this.nome = nome;
		this.nivel = nivel;
		this.salario = salario;
	}
	public Cargo() {
		super();
	}
	public Cargo(String nome, String nivel, double salario) {
		super();
		this.nome = nome;
		this.nivel = nivel;
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public int compareTo(Cargo outro) {
		if (salario>outro.salario) {
			return 1;
		}else if (salario<outro.salario) {
			return -1;
		}else {
		return 0;
		}
	}
	
	

}
