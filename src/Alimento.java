
public class Alimento {

	private int peso;
	private EnumAlimento comida;
	private int idref;
	private int idusuario;
	
	public Alimento(int peso, EnumAlimento comida, int idref, int idusuario) {
		this.peso = peso;
		this.comida = comida;
		this.idref = idref;
		this.idusuario = idusuario;
		
		
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public EnumAlimento getComida() {
		return comida;
	}

	public int getCarboidrato () {
		return this.comida.carb / 100 * this.peso;
	}
	public int getProteina () {
		return this.comida.protein / 100 * this.peso;
	}
	public int getGordura () {
		return this.comida.fat / 100 * this.peso;
	}
	public int getCalorias () {
		return this.comida.calorias / 100 * this.peso;
	}
}
