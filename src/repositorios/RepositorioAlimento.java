package repositorios;
import java.util.ArrayList;

import beans.Alimento;

public class RepositorioAlimento extends RepositorioGenerico {
	private ArrayList<Alimento> alimentos;

	public RepositorioAlimento() {
		super();
		this.alimentos = new ArrayList<Alimento>();
	}
	
}
