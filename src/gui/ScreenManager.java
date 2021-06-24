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
    private CadastroController cadastroController;
    private Stage primaryStage;
    
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
        	BorderPane cadastroPane = fxmlLoader.load(getClass()
                    .getResource("src/gui/Cadastro.fxml").openStream());  
        	this.cadastro = new Scene(cadastroPane);
        	this.cadastroController = (CadastroController) fxmlLoader.getController();
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }
    
    public Scene getCadastro(){
    	return cadastro;
    }
    
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
}
