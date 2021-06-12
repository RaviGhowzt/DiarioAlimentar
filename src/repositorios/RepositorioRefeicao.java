package repositorios;
import java.util.ArrayList;

import beans.Refeicao;

public class RepositorioRefeicao extends RepositorioGenerico{
	private ArrayList<Refeicao> refeicoes;

	public RepositorioRefeicao() {
		super();
		this.refeicoes = new ArrayList<Refeicao>();
	}
	
}
