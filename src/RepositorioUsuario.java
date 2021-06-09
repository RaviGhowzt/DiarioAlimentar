import java.util.ArrayList;

public class RepositorioUsuario {
	private ArrayList<Usuario> usuarios;

	public RepositorioUsuario() {
		super();
		this.usuarios = new ArrayList<Usuario>();
	}
	
	public void create(Usuario usuario) throws ElementoJaExisteException {
		if(!this.usuarios.contains(usuario)) {
			this.usuarios.add(usuario);
		}
		else {
			throw new ElementoJaExisteException(usuario);
		}	
	}
	
	public void remove(Usuario usuario) throws ElementoNaoExisteException {
		if(this.usuarios.contains(usuario)) {
			this.usuarios.remove(usuario);
		}
		else {
			throw new ElementoNaoExisteException(usuario);
		}
	}
	
	public void update(Usuario usuario) throws ElementoNaoExisteException {
		if(this.usuarios.contains(usuario)) {
			int indice = this.usuarios.indexOf(usuario);
			this.usuarios.set(indice, usuario);
		}
		else {
			throw new ElementoNaoExisteException(usuarios);
		}
	}
	public ArrayList<Usuario> listar(){
		return this.usuarios;
	}

}
