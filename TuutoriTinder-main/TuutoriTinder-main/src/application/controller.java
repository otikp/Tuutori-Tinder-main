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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class controller {

 private Stage stage;
 private Scene scene;
 private Parent root;
 private UsersList userList;
 @FXML
 Label nameLabel;
 @FXML
 Label majorLabel;
 @FXML
 Label skillLabel;


 public void initialize() throws SQLException {
	 	UsersList userList = new UsersList();
		
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

	     // prepare SQL query
	     String query = "SELECT name, major, skill, email FROM userinfo";

	     // send and execute SQL query in Database software
	     ResultSet rs = st.executeQuery(query);

	     // process the ResultSet object
	     boolean flag = false;

	     while (rs.next()) {
	     	flag = true;
	     	String name = rs.getString(1);
	        String major = rs.getString(2);
	        String skill = rs.getString(3);
	        String email = rs.getString(4);
	        Users newUser = new Users(name, major, skill, email);
	        userList.addUser(newUser);
	     }

	     if (flag == true) {
	     	System.out.println("\nRecords retrieved and displayed");
	     } else {
	     	System.out.println("Record not found");
	     }
	     
	     // close JDBC objects
	     rs.close();
	     st.close();
	     con.close();
	     
	     initData(userList);
 }
 
 public void switchToSceneBack(ActionEvent event) throws IOException {
	  root = FXMLLoader.load(getClass().getResource("welcome.fxml"));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
	 }
 public void getNextTutor(ActionEvent event) {
 
     Users nextUser = this.userList.getUser();
	 
	 nameLabel.setText(nextUser.getName());
	 majorLabel.setText(nextUser.getMajor());
	 skillLabel.setText(nextUser.getSkill());
 }
 public void connectTutor(ActionEvent event)
 {
	 Users userInfoEmail = this.userList.getUser();
	 Alert a = new Alert(AlertType.NONE);
	 a.setAlertType(AlertType.INFORMATION);
	 a.show();
	 a.setHeaderText(userInfoEmail.getEmail());
 }
 
 public void initData(UsersList userList) {
	 this.userList = userList;
 }

 
}