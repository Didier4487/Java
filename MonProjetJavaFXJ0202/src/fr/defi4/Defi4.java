package fr.defi4;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Defi4 extends Application {
	public int x = 200;
	public int y = 200;
	public boolean carreAffiche = false;

    public static void main(String[] args) {
    	launch(args);
    }
    @Override
    public void start(Stage primaryStage) { 
        final Button btnCreer = new Button("Créer un carré"); 
        final Button btnGauche = new Button("Aller à gauche"); 
        final Button btnDroite = new Button("Aller à droite"); 
        final Button btnHaut = new Button("Aller en haut"); 
        final Button btnBas = new Button("Aller en bas"); 
        final Button btnFermer = new Button("Fermer"); 
        final ToolBar toolBar = new ToolBar(); 
        final MonRectangle monCarre = new MonRectangle(x,y,80,80,Color.ORANGE);
        btnCreer.setDefaultButton(true);
        toolBar.getItems().setAll(btnCreer, new Separator(), btnGauche,  btnDroite, btnHaut,  btnBas, new Separator(), btnFermer); 
       
        final BorderPane root = new BorderPane(); 
        root.setTop(toolBar); 
        final Scene scene = new Scene(root, 600, 500); 
        primaryStage.setTitle("Défi 4 : créer 5 boutons et animer un carré"); 
        primaryStage.setScene(scene); 
        primaryStage.show(); 
    
	   btnCreer.setOnAction(new EventHandler<ActionEvent>() { 
	        @Override 
	        public void handle(ActionEvent actionEvent) { 
	        	if (carreAffiche == false) {
	        		root.getChildren().add(monCarre);
	        	}
	        	carreAffiche = true;
	        } 
	    });
	   
	   btnDroite.setOnAction(new EventHandler<ActionEvent>() { 
	        @Override 
	        public void handle(ActionEvent actionEvent) { 
	        	if (x < 520) x = x + 10;
	        	monCarre.setX(x);
	        } 
	    });
	   
	   btnGauche.setOnAction(new EventHandler<ActionEvent>() { 
	        @Override 
	        public void handle(ActionEvent actionEvent) { 
	        	if (x > 0) x = x - 10;
	        	monCarre.setX(x);
	        } 
	    });
	  
	   btnHaut.setOnAction(new EventHandler<ActionEvent>() { 
	        @Override 
	        public void handle(ActionEvent actionEvent) { 
	        	if (y > 40) 	y = y - 10;
	        	monCarre.setY(y);
	        } 
	    });
	   
	   btnBas.setOnAction(new EventHandler<ActionEvent>() { 
	        @Override 
	        public void handle(ActionEvent actionEvent) { 
	        	if (y < 420) 	y = y + 10;
	        	monCarre.setY(y);
	        } 
	    });
	   
	   btnFermer.setOnAction(new EventHandler<ActionEvent>() { 
	        @Override 
	        public void handle(ActionEvent actionEvent) { 
	        	primaryStage.close();
	        } 
	    });
    }
}
