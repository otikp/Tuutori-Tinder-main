package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//bring the functionality to the home page
public class ControllerWelcome {
	
	 private Stage stage;
	 private Scene scene;
	 private Parent root;
	//Profile browsing
	public void switchToScene(ActionEvent event) throws IOException {
		  root = FXMLLoader.load(getClass().getResource("profiili.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		 }
	//take tutor-user to the registering
	 public void switchToTuutoriScene(ActionEvent event) throws IOException {
		  root = FXMLLoader.load(getClass().getResource("Tuutori.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		 }
	 //work in progress...
	 public void switchToConnectionsScene(ActionEvent event) throws IOException {
		 	FXMLLoader loader = new FXMLLoader(getClass().getResource("Connections.fxml"));
			root = loader.load();
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		 }
}
