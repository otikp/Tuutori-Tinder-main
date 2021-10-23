package application;
	
import java.util.List;


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage) {

		Stage stage2 = new Stage();
		Text text = new Text();
	
		Group root = new Group();
		Scene scene = new Scene(root,800,600,Color.BLACK);
		text.setText("\r\n"
				+ "████████╗██╗░░░██╗██╗░░░██╗████████╗░█████╗░██████╗░██╗  ████████╗██╗███╗░░██╗██████╗░███████╗██████╗░\r\n"
				+ "╚══██╔══╝██║░░░██║██║░░░██║╚══██╔══╝██╔══██╗██╔══██╗██║  ╚══██╔══╝██║████╗░██║██╔══██╗██╔════╝██╔══██╗\r\n"
				+ "░░░██║░░░██║░░░██║██║░░░██║░░░██║░░░██║░░██║██████╔╝██║  ░░░██║░░░██║██╔██╗██║██║░░██║█████╗░░██████╔╝\r\n"
				+ "░░░██║░░░██║░░░██║██║░░░██║░░░██║░░░██║░░██║██╔══██╗██║  ░░░██║░░░██║██║╚████║██║░░██║██╔══╝░░██╔══██╗\r\n"
				+ "░░░██║░░░╚██████╔╝╚██████╔╝░░░██║░░░╚█████╔╝██║░░██║██║  ░░░██║░░░██║██║░╚███║██████╔╝███████╗██║░░██║\r\n"
				+ "░░░╚═╝░░░░╚═════╝░░╚═════╝░░░░╚═╝░░░░╚════╝░╚═╝░░╚═╝╚═╝  ░░░╚═╝░░░╚═╝╚═╝░░╚══╝╚═════╝░╚══════╝╚═╝░░╚═╝");
		text.setX(40);
		text.setY(40);
		text.setFont(Font.font("Verdana",10));
		text.setFill(Color.CADETBLUE);
		//Account userAccount = new Account ("Nimi", "Salasana", "sposti"); 
		//text.setText(userAccount.toString());
		//UserProfile nUserProfile = new UserProfile("KimDihn123", "pAsSwOrD", "Kimdihn@email.com ", "Kim", "Dihn", "IT", "Leppävaara", "Eclipse toimii");
		//text.setText(nUserProfile.toString());
		
		Rectangle rectangle = new Rectangle();
		rectangle.setX(500);
		rectangle.setY(500);
		rectangle.setWidth(100);
		rectangle.setHeight(100);
		rectangle.setFill(Color.RED);
		rectangle.setStrokeWidth(5);
		rectangle.setStroke(Color.WHEAT);
		
		stage.setTitle("TUUTORI TINDER");
		root.getChildren().addAll(text);
		stage.setScene(scene);
		stage.show();
		stage.setResizable(false);
		

	}

}
