package fr.defi2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Defi2 extends Application {

    public static void main(String[] args) {
        Application.launch(Defi2.class, args);
    }
    @Override
    public void start(Stage primaryStage) {;
    	 BorderPane root = new BorderPane();
         Scene scene = new Scene(root, 800, 600, Color.LIGHTBLUE);
         primaryStage.setScene(scene);
         Circle cercle = new Circle(100,100,80);
         RectanglePerso rectangle = new RectanglePerso(200,200,80,200).colorierRectangleJaune();
         CerclePerso monCercle = new CerclePerso(400, 300,50,Color.YELLOW,Color.ORANGE);
         RectanglePerso monRectangle = new RectanglePerso(600, 400,50,100).colorierRectangleVert();
         root.getChildren().add(cercle);
         root.getChildren().add(rectangle);
         root.getChildren().add(monCercle);
         root.getChildren().add(monRectangle);
         primaryStage.show();
    }
}
