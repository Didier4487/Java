package fr.defi3;

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
import javafx.stage.Stage;

public class Defi3 extends Application {

    public static void main(String[] args) {
    	launch(args);
    }
    @Override
    public void start(Stage primaryStage) { 
        final Button btnMessage = new Button("Message"); 
        final Button btnAgrandir = new Button("Agrandir"); 
        final Button btnFermer = new Button("Fermer"); 
        final ToolBar toolBar = new ToolBar(); 
        btnFermer.setDefaultButton(true);
        toolBar.getItems().setAll(btnMessage, new Separator(), btnAgrandir, new Separator(), btnFermer); 
       
        final BorderPane root = new BorderPane(); 
        root.setTop(toolBar); 
        final Scene scene = new Scene(root, 600, 500); 
        primaryStage.setTitle("Défi 3 : créer 3 boutons"); 
        primaryStage.setScene(scene); 
        primaryStage.show(); 
    
	   btnMessage.setOnAction(new EventHandler<ActionEvent>() { 
	        @Override 
	        public void handle(ActionEvent actionEvent) { 
	        	Alert dialog = new Alert(AlertType.INFORMATION);
	        	dialog.setTitle("Mon message");
	        	dialog.setHeaderText("Voici ce que j'ai fait :");
	        	dialog.setContentText("Je viens d'ouvrir une seconde fenêtre");
	        	dialog.show();
	        } 
	    });
	   btnAgrandir.setOnAction(new EventHandler<ActionEvent>() { 
	        @Override 
	        public void handle(ActionEvent actionEvent) { 
	        	primaryStage.setFullScreen(true);
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
    
    

