package br.com.dio.user;

public class Usuario {
	
	private String nomeUsuario;
	private String primeiroNome;
	private String finalNome;
	private String email;
	private String senha;
	private String telefone;

	public Usuario(String nomeUsuario, String primeiroNome, String finalNome,
			String email, String senha, String telefone ) {
		this.nomeUsuario = nomeUsuario;
		this.primeiroNome = primeiroNome;
		this.finalNome = finalNome;
		this.email = email;
		this.senha = senha;
		this.telefone = telefone;		
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public String getFinalNome() {
		return finalNome;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}

	public String getTelefone() {
		return telefone;
	}
	
	
}
