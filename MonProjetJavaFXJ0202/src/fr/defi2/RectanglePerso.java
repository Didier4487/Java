package fr.defi2;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

public class RectanglePerso extends Rectangle {


	public RectanglePerso(double x, double y, double width, double height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	public RectanglePerso colorierRectangleJaune() {

	       this.setFill(Color.YELLOW);
	       this.setStroke(Color.ORANGE);  
	       return this;
		}
	public RectanglePerso colorierRectangleVert() {

	       this.setFill(Color.CHARTREUSE);
	       this.setStroke(Color.GREEN);  
	       return this;
		}
}
