package gui;
import java.net.URL;
import java.util.ResourceBundle;

import beans.*;
import repositorios.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class CadastroAlimentoController {
    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtCalorias;

    @FXML
    private TextField txtPeso;

    @FXML
    private TextField txtCarboidrato;
    
    @FXML
    private TextField txtGordura;

    @FXML
    private TextField txtProteina;

    @FXML
    private Button btnSalvar;
    
    @FXML
    private Button btnVoltar;
    
    @FXML
    private Label lblIdNutricionista;
    
    @FXML
    void initialize() {
    	
    }
    
    @FXML
    public void btnSalvarClick() {
    	//fazer configurações de salvar alimento
    	Alimento p = new Alimento(this.txtNome.getText(), Integer.parseInt(this.txtPeso.getText()),
    			Integer.parseInt(this.txtCarboidrato.getText()), Integer.parseInt(this.txtProteina.getText()),
    			Integer.parseInt(this.txtGordura.getText()), Integer.parseInt(this.txtCalorias.getText()),
    			Integer.parseInt(this.lblIdNutricionista.getText()));
        try {
        	RepositorioAlimento.getInstance().create(p);
        	
        	
        } catch (Exception e) {
        	Alert alert = new Alert(AlertType.CONFIRMATION);
        	alert.setTitle("Erro ao tentar adicionar alimento");
        	alert.setContentText("Por favor, adicione um alimento que não tenha sido adicionado antes");
        	
            // TODO Tratar exceção apresentando mensagem para o usuário
        }        
        //ScreenManager.getInstance().getMainScreenController().updateListaPassageiros();
    	
    	//ScreenManager.getInstance().getHomeController();    	
    	//criar HomeController    	
    }
    
    @FXML
    public void btnVoltarClick() {
    	//ScreenManager.getInstance().getHomeController();    	
    	//criar HomeController
    }

}
