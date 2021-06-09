import java.util.ArrayList;



public class ControladorUsuario {

	private RepositorioUsuario repoUsuario;

	public ControladorUsuario(RepositorioUsuario repoUsuario) {
		super();
		this.repoUsuario = repoUsuario;
	}
	
	public void createUsuario(Usuario usuario) throws ElementoJaExisteException {
		this.repoUsuario.create(usuario);	
	}
	
	public void removeUsuario(Usuario usuario) throws ElementoNaoExisteException {
		this.repoUsuario.remove(usuario);
	}
	
	public void updateUsuario(Usuario usuario) throws ElementoNaoExisteException {
		this.repoUsuario.update(usuario);
	}
	public ArrayList<Usuario> listarUsuario(){
		return this.repoUsuario.listar();
	}
}
