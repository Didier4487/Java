package fr.defi1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Defi1 extends Application {

    public static void main(String[] args) {
        Application.launch(Defi1.class, args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 800, 600, Color.LIGHTBLUE);
        primaryStage.setScene(scene);
        
        Circle cercle = new Circle();
        cercle.setCenterX(750);//réglage de la position, de la taille et de la couleur du cercle
        cercle.setCenterY(50);
        cercle.setRadius(48);
        cercle.setFill(Color.YELLOW);
        cercle.setStroke(Color.ORANGE);//réglage de la couleur de la bordure et de son épaisseur
        cercle.setStrokeWidth(2);
        
        Rectangle rectangle = new Rectangle();
        rectangle.setX(200);
        rectangle.setY(350);
        rectangle.setWidth(400);
        rectangle.setHeight(250);
        rectangle.setFill(Color.GREEN);
        rectangle.setStroke(Color.DARKGREEN);
        rectangle.setStrokeWidth(2);
        rectangle.setArcHeight(10);
        rectangle.setArcWidth(10);
        
        Rectangle porte = new Rectangle();
        porte.setX(380);
        porte.setY(500);
        porte.setWidth(40);
        porte.setHeight(100);
        porte.setFill(Color.BISQUE);
        porte.setStroke(Color.CRIMSON);
        porte.setStrokeWidth(2);
        //rectangle.setArcHeight(10);
        //rectangle.setArcWidth(10);
        
        Rectangle fenetre = new Rectangle();
        fenetre.setX(230);
        fenetre.setY(400);
        fenetre.setWidth(80);
        fenetre.setHeight(80);
        fenetre.setFill(Color.BISQUE);
        fenetre.setStroke(Color.CRIMSON);
        fenetre.setStrokeWidth(2);
        
        Rectangle fenetre2 = new Rectangle();
        fenetre2.setX(490);
        fenetre2.setY(400);
        fenetre2.setWidth(80);
        fenetre2.setHeight(80);
        fenetre2.setFill(Color.BISQUE);
        fenetre2.setStroke(Color.CRIMSON);
        fenetre2.setStrokeWidth(2);
        
        root.getChildren().add(cercle);//on ajoute le cercle au groupe root
        root.getChildren().add(rectangle);
        root.getChildren().add(porte);
        root.getChildren().add(fenetre);
        root.getChildren().add(fenetre2);
        
        primaryStage.show(); //attention la MAJ a modifié cette méthode
    }
}

