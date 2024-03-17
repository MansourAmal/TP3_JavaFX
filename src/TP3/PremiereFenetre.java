package TP3;



import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PremiereFenetre extends Application{
	@Override
	public void start(Stage primaryStage) {
	Group root = new Group();
	Scene scene = new Scene(root, 300, 250, Color.WHITE);
	Rectangle r1=new Rectangle(100,100,50,47);
	Line l1=new Line(150,10,4,5);
	Circle c1=new Circle(54,52,50);
	r1.setFill(Color.RED);
	l1.setFill(Color.AQUA);
	c1.setFill(Color.RED);
	root.getChildren().add(l1);
	root.getChildren().add(c1);
	root.getChildren().add(r1);
	primaryStage.setTitle("Ma première fenêtre");
	primaryStage.setScene(scene);
	primaryStage.show();
	}
	public static void main(String[] args) {
	launch(args);
	}
}
