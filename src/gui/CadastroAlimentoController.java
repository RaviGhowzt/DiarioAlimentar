package gui;
import java.net.URL;
import java.util.ResourceBundle;

import beans.*;
import repositorios.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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
    void initialize() {
    	
    }

}
