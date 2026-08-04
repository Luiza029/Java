package entities;

public class Pensionato_Class {
	private String nome;
	private String email;
	
	public Pensionato_Class(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail(String email) {
		return email;
	}

	public String toString() {
		return "" + nome + ", " + email;
	}
}
