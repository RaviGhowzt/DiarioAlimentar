package beans;

public class Alimento {

	private int peso;
	private int carboidrato;
	private int proteina;
	private int gordura;
	private int calorias;
	private int idref;
	private int idusuario;
	


	public Alimento(int peso, int carboidrato, int proteina, int gordura, int calorias, int idref, int idusuario) {
		super();
		this.peso = peso;
		this.carboidrato = carboidrato;
		this.proteina = proteina;
		this.gordura = gordura;
		this.calorias = calorias;
		this.idref = idref;
		this.idusuario = idusuario;
	}
	
	public Alimento() {
		
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}


	public int getCarboidrato () {
		return this.carboidrato / 100 * this.peso;
	}
	public int getProteina () {
		return this.proteina / 100 * this.peso;
	}
	public int getGordura () {
		return this.gordura / 100 * this.peso;
	}
	public int getCalorias () {
		return this.calorias/ 100 * this.peso;
	}
}
