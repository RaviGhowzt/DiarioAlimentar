package gui;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ScreenManager {
	
	private static ScreenManager instance;
    private Scene diarioAlimentar;
    private DiarioAlimentarController diarioAlimentarController;
    /*
    private Scene planoAlimentar;
    private PlanoAlimentarController planoAlimentarController;
    */
    private Scene cadastro;
    private Scene login;
    private CadastroController cadastroController;
    private LoginController loginController;
    private Stage primaryStage;
    private Scene homeNutricionista;
    private HomeNutricionistaController homeNutricionistaController;
    private Scene cadastroAlimento;
    private CadastroAlimentoController cadastroAlimentoController;
    
    
    public static ScreenManager getInstance() {
        if (instance == null) {
            instance = new ScreenManager();
        }
        return instance;
    }
    
    private ScreenManager() { 
        this.initialize(); 
    }

    private void  initialize() {
    	try {
        	FXMLLoader fxmlLoader = new FXMLLoader();
        	BorderPane loginPane = fxmlLoader.load(getClass()
                    .getResource("src/gui/Login.fxml").openStream());  
        	this.login = new Scene(loginPane);
        	this.loginController = (LoginController) fxmlLoader.getController();

        	
        	fxmlLoader = new FXMLLoader();
        	BorderPane cadastroPane = fxmlLoader.load(getClass()
                    .getResource("src/gui/Cadastro.fxml").openStream());  
        	this.cadastro = new Scene(cadastroPane);
        	this.cadastroController = (CadastroController) fxmlLoader.getController();
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }
    
    public Scene getCadastroAlimento() {
    	return cadastroAlimento;
    }
    
    public Scene gethomeNutricionista() {
    	return homeNutricionista;
    }
    
    public Scene getCadastro(){
    	return cadastro;
    }
    
    public Scene getLogin() {
    	return login;
    }
    public Stage getPrimaryStage() {
        return primaryStage;
    }
    
    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
    
    public CadastroController getCadastroController() {
    	return cadastroController;
    }
    
    public DiarioAlimentarController getDiarioAlimentarController() {
    	return diarioAlimentarController;
    }
    
    public LoginController getLoginController() {
    	return loginController;
    }
    
    public HomeNutricionistaController getHomeNutricionistaController() {
    	return homeNutricionistaController;
    }
    
    public CadastroAlimentoController getCadastroAlimentoController() {
    	return cadastroAlimentoController;
    }
}
