package application.control;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
/**
 * 
 * @author marki
 * 
 */
public class Controller {
	@FXML
	private Pane page;
	@FXML
	private Scene scene;
	@FXML
	private Button closeButton;
	@FXML
	public Stage stage;
	@FXML
	private void showSendProfile() {
		try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/Blanco.fxml"));
            page = (AnchorPane) loader.load();
            Scene scene = new Scene(page);
            Stage sendStage = new Stage();
          
            sendStage.setScene(scene);          
            sendStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	private void windowClose() {
       // System.exit(0);
        Stage thisStage = (Stage) closeButton.getScene().getWindow();      
        thisStage.close();
	}
	
}