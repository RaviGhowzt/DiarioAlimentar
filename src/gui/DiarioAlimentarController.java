package gui;

import beans.Alimento;
//import controladores.ControladorRefeicao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/*import repositorios.RepositorioAlimento;
import repositorios.RepositorioUsuario;
import repositorios.RepositorioRefeicao;*/

public class DiarioAlimentarController {
	
	//instanciando repositorios
	
	//criando elementos da tela
	@FXML
	Button btnSalvar;
	@FXML
	Button btnVoltar;
	@FXML
	TableView tvCafeDaManha;
	@FXML
	TableColumn<Alimento, String> tcListaCafeDaManha;
	@FXML
	TableView tvAlmoco;
	@FXML
	TableColumn<Alimento, String> tcListaAlmoco;
	@FXML
	TableView tvJanta;
	@FXML
	TableColumn<Alimento, String> tcListaJanta;
	@FXML
	TableView<Alimento> tvLanche;
	@FXML
	TableColumn<Alimento, String> tcListaLanche;
	
	//metodo que salva as alteracoes do diario alimentar
	@FXML
	public void btnSalvarPressionado(ActionEvent event) {
		
	}
	
	@FXML
	public void btnVoltarPressionado(ActionEvent event) {
		
	}
	
	public void initialize() {
		
	}
	
}
