package repositorios;
import java.util.ArrayList;

import beans.Usuario;

public class RepositorioUsuario extends RepositorioGenerico{
	private ArrayList<Usuario> usuarios;

	public RepositorioUsuario() {
		super();
		this.usuarios = new ArrayList<Usuario>();
	}
	
}
