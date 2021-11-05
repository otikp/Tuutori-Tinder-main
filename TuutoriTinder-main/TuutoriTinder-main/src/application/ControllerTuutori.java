package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class ControllerTuutori {
	
	 @FXML
	 TextField tuutoriName;
	 @FXML
	 TextField tuutoriMajor;
	 @FXML
	 TextField tuutoriSkills;
	 @FXML
	 TextField tuutoriEmail;
	 
	 private Stage stage;
	 private Scene scene;
	 private Parent root;
	 
	public void addTuutori(ActionEvent event) throws SQLException {
		
		 String name = tuutoriName.getText();
		 String major = tuutoriMajor.getText();
		 String skills = tuutoriSkills.getText();
		 String email = tuutoriEmail.getText();
		 
		// prepare SQL query
	     String query = "INSERT INTO userinfo (name, major, skill, email) VALUES ('"
	    		 + name + "', " + "'" + major + "', " + "'" + skills + "', " + "'" + email +"');";
	     System.out.println(query);
		 
		 // variables
	     final String url = "jdbc:mysql:///tuutoritinder";
	     final String user = "root";
	     final String password = "Password@0";
	     System.out.println("2");
	     // establish the connection
	     Connection con = DriverManager.getConnection(url, user, password);
	     System.out.println("3");
	     // create JDBC statement object
	     
	     Statement st = con.createStatement();

	     
	     st.execute(query);
	     con.close();
	     
	     tuutoriName.clear();
	     tuutoriMajor.clear();
	     tuutoriSkills.clear();
	     tuutoriEmail.clear();
	     
	     Alert a = new Alert(AlertType.NONE);
		 a.setAlertType(AlertType.INFORMATION);
		 a.show();
		 a.setHeaderText("Thank you for registering as TuudorsPuudors!");
	 }
	
	public void switchToSceneBack(ActionEvent event) throws IOException {
		  root = FXMLLoader.load(getClass().getResource("welcome.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		 }
}
