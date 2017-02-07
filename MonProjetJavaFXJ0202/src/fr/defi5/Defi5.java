package fr.defi5;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class Defi5 extends Application {
	public int x = 200;
	public int y = 200;
	public boolean carreAffiche = false;

    public static void main(String[] args) {
    	launch(args);
    }
    @Override
    public void start(Stage primaryStage) { 
        final Button btnCreer = new Button("Créer une voiture"); 
        final Button btnGauche = new Button("Aller à gauche"); 
        final Button btnDroite = new Button("Aller à droite"); 
        final Button btnHaut = new Button("Aller en haut"); 
        final Button btnBas = new Button("Aller en bas"); 
        final Button btnFermer = new Button("Fermer"); 
        final ToolBar toolBar = new ToolBar(); 
        final MonRectangle maVoiture1 = new MonRectangle(x,y,100,20,Color.ORANGE);
        final MonRectangle maVoiture2 = new MonRectangle(x +30,y-20,40,20,Color.ORANGE);
        final Circle maVoiture3 = new Circle(x+20,y+20,10);
        final Circle maVoiture4 = new Circle(x+80,y+20,10);
        btnCreer.setDefaultButton(true);
        toolBar.getItems().setAll(btnCreer, new Separator(), btnGauche,  btnDroite, btnHaut,  btnBas, new Separator(), btnFermer); 
       
        final BorderPane root = new BorderPane(); 
        root.setTop(toolBar); 
        final Scene scene = new Scene(root, 600, 500); 
        primaryStage.setTitle("Défi 5 : créer un garage et animer une voiture"); 
        primaryStage.setScene(scene); 
        primaryStage.show(); 
    
	   btnCreer.setOnAction(new EventHandler<ActionEvent>() { 
	        @Override 
	        public void handle(ActionEvent actionEvent) { 
	        	if (carreAffiche == false) {
	        		root.getChildren().add(maVoiture1);
	        		root.getChildren().add(maVoiture2);
	        		root.getChildren().add(maVoiture3);
	        		root.getChildren().add(maVoiture4);
	        	}
	        	carreAffiche = true;
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
