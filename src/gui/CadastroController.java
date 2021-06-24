package gui;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class CadastroController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private CheckBox cbCliente;

    @FXML
    private CheckBox cbNutricionista;

    @FXML
    private TextField txtEmailC;

    @FXML
    private TextField txtNomeC;

    @FXML
    private TextField txtPesoC;

    @FXML
    private TextField txtAlturaC;

    @FXML
    private TextField txtNomeN;

    @FXML
    private PasswordField txtEmailN;

    @FXML
    private PasswordField txtSenhaN;

    @FXML
    private TextField txtDataNascimentoN;

    @FXML
    private PasswordField txtSenhaC;

    @FXML
    private TextField txtDataNascimentoC;

    @FXML
    private Button btnConcluir;

    @FXML
    private Label lbCadastro;
    @FXML
    void initialize() {
    	
    }
    /*
    @FXML
    public void btnConcluirAction (ActionEvent e) {
    	
    }*/
}
