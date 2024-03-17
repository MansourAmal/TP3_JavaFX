package TP3;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Welcomeform extends Application{
	@Override
	public void start(Stage primaryStage) {
	GridPane root = new GridPane();
	Scene scene = new Scene(root, 300, 275, Color.WHITE);
	root.setAlignment(Pos.CENTER);
	root.setHgap(10);
	root.setVgap(10);
	root.setPadding(new Insets(25, 25, 25, 25));
	
	Text scenetitle = new Text("Welcome");
	scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
	root.add(scenetitle, 0, 0, 2, 1);
	// username
	Label userName = new Label("User Name:");
	root.add(userName, 0, 1);
	TextField userTextField = new TextField();
	root.add(userTextField, 1, 1);
	// password
	Label pw = new Label("Password");
	root.add(pw, 0, 2);
	PasswordField pwBox = new PasswordField();
	root.add(pwBox, 1, 2);
	//button
	Button btn = new Button("Sign in");
	HBox hbBtn = new HBox(10);
	hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
	hbBtn.getChildren().add(btn);
	root.add(hbBtn, 1, 4);
	
	Text actiontarget = new Text();
	root.add(actiontarget, 1, 6);
	
	btn.setOnAction(new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent e) {
			if(pwBox.getText().equals("123")) {
				(actiontarget).setFill(Color.GREEN);
				actiontarget.setText("sign in ok");
			}
			else {
				(actiontarget).setFill(Color.FIREBRICK);
				actiontarget.setText("erreure");
			}
		
		}
		});
	
	//button2
	Button btn1 = new Button("exit");
	HBox hbBtn1 = new HBox(10);
	hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
	hbBtn.getChildren().add(btn1);
	root.add(hbBtn1,0, 4);
	btn1.setOnAction(new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent e) {
			Platform.exit();
		}
		});
	
	primaryStage.setTitle("JavaFX Welcome");
	primaryStage.setScene(scene);
	primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
