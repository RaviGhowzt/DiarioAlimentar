package beans;

import java.time.LocalDate;

public class Nutricionista extends Usuario {
	
	private int CRN;

	public Nutricionista(String nome, String email, String senha, LocalDate dataNascimento, int CRN) {
		super(nome, email, senha, dataNascimento);
		this.CRN = CRN;
		
	}

}
