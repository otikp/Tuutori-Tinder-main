package application;
	
import java.util.List;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.io.IOException;
import java.sql.*;


public class Main extends Application {
	
	@Override
	public void start(Stage stage) {
		try {
			
		Parent root  = FXMLLoader.load(getClass().getResource("welcome.fxml"));
		Scene scene = new Scene(root,Color.BLACK);
		stage.setScene(scene);
		stage.show();
		
		stage.setTitle("TUUTORI TINDER");
		
		
	}catch(Exception e) {
		e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception {
		
        launch(args);
	}
}






