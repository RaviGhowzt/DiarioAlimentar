import java.util.ArrayList;

public class RepositorioAlimento {
	private ArrayList<Alimento> alimentos;

	public RepositorioAlimento() {
		super();
		this.alimentos = new ArrayList<Alimento>();
	}
	
	public void create(Alimento alimento) throws ElementoJaExisteException {
		if(!this.alimentos.contains(alimento)) {
			this.alimentos.add(alimento);
		}
		else {
			throw new ElementoJaExisteException(alimento);
		}	
	}
	
	public void remove(Alimento alimento) throws ElementoNaoExisteException {
		if(this.alimentos.contains(alimento)) {
			this.alimentos.remove(alimento);
		}
		else {
			throw new ElementoNaoExisteException(alimento);
		}
	}
	
	public void update(Alimento alimento) throws ElementoNaoExisteException {
		if(this.alimentos.contains(alimento)) {
			int indice = this.alimentos.indexOf(alimento);
			this.alimentos.set(indice, alimento);
		}
		else {
			throw new ElementoNaoExisteException(alimentos);
		}
	}
	public ArrayList<Alimento> listar(){
		return this.alimentos;
	}

}
