import javafx.application.Application;
import javafx.stage.Stage;
import gui.ScreenManager;

public class DiarioAlimentarApp extends Application {

	
	@Override 
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(ScreenManager.getInstance().getLogin());
		primaryStage.setTitle("Diário Alimentar");
        
        primaryStage.setWidth(850);
        primaryStage.setHeight(680);
        primaryStage.setResizable(false);
        
        ScreenManager.getInstance().setPrimaryStage(primaryStage);
        
        primaryStage.show();
    }
	
	
	
	public static void main(String[] args) {
		DiarioAlimentarApp.launch(args);
	}

}
