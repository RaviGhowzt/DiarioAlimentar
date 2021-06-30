package gui;
import java.time.LocalDate;
import java.util.List;

import beans.Cliente;
import beans.Nutricionista;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import repositorios.*;

public class LoginController {

    @FXML
    private Label lblLogin;

    @FXML
    private TextField txtEmail;

    @FXML
    private PasswordField txtSenha;

    @FXML
    private Button btnLogin;

    @FXML
    private Button btnCadastro;
    
    //private int autenticacao;
    private List<Cliente> clientes = RepositorioCliente.getInstance().recover();
    private List<Nutricionista> nutricionistas = RepositorioNutricionista.getInstance().recover();
    
    @FXML
    void cadastro(ActionEvent event) {

    }
    @FXML
    private void initialize() {
    	
    }
    @FXML
    public void btnCadastroClick (ActionEvent e) {
    	ScreenManager.getInstance().getCadastroController();
    }
    
    @FXML
    public void btnLoginClick (ActionEvent e) {
    	boolean verificar = false;
    	for (Cliente c : this.clientes) {
    	if (c.getEmail() == txtEmail.getText() && c.getSenha() == txtSenha.getText()) {
    		//autenticacao = u.getIdUser();
    		
    		verificar = true;
    		ScreenManager.getInstance().getDiarioAlimentarController();
    		break;
    	} 
    	}
    	
    	if (verificar == false) {
    		for (Nutricionista n : this.nutricionistas) {
    	    	if (n.getEmail() == txtEmail.getText() && n.getSenha() == txtSenha.getText()) {
    	    		
    	    		//autenticacao = u.getIdUser();
    	    		verificar = true;
    	    		ScreenManager.getInstance().getHomeNutricionistaController();
    	    		break;
    	    	} 
    	    	}
    	}
    	if (verificar == false) {
        	Alert alert = new Alert(AlertType.CONFIRMATION);
        	alert.setTitle("Erro ao tentar logar");
        	alert.setContentText("Email e senha incorretos, digite novamente");
    	}
    }
    
}