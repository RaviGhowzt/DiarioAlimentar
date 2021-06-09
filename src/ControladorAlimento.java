import java.util.ArrayList;

public class ControladorAlimento {
	private RepositorioAlimento repoAlimento;

	public ControladorAlimento(RepositorioAlimento repoAlimento) {
		super();
		this.repoAlimento = repoAlimento;
	}
	
	public void createUsuario(Alimento alimento) throws ElementoJaExisteException {
		this.repoAlimento.create(alimento);	
	}
	
	public void removeUsuario(Alimento alimento) throws ElementoNaoExisteException {
		this.repoAlimento.remove(alimento);
	}
	
	public void updateUsuario(Alimento alimento) throws ElementoNaoExisteException {
		this.repoAlimento.update(alimento);
	}
	public ArrayList<Alimento> listarAlimento(){
		return this.repoAlimento.listar();
	}

}
