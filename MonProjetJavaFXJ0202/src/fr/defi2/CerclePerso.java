package fr.defi2;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class CerclePerso extends Circle {

	public CerclePerso(double centerX, double centerY, double radius, Paint couleurFond, Paint couleurBordure) {
		super(centerX, centerY, radius);
		this.setFill(couleurFond);
		this.setStroke(couleurBordure);
	}

	public CerclePerso colorierCercle() {

       this.setFill(Color.YELLOW);
       this.setStroke(Color.ORANGE);  
       return this;
	}
}
