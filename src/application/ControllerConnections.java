package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
//this class gets name and email to the connections-screen
public class ControllerConnections {
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	
	@FXML
	Label connectionSection;
	
	@FXML
	Label connectionSection2;
	
	private String name;
	private String email;
	
	
	
	public void setConnectionText(String newConnection, String newConnection2) {
		
		System.out.println(newConnection);
		System.out.println(newConnection2);
		
		this.name = newConnection;
		this.email = newConnection2;
		
		connectionSection.setText(this.name);
		connectionSection2.setText(this.email);
		
	}
	//ohjaa takaisin etusivulle
	public void switchToSceneBack(ActionEvent event) throws IOException {
		  root = FXMLLoader.load(getClass().getResource("welcome.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		 }
}
