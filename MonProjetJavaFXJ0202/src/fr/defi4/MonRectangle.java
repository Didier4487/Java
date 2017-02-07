package fr.defi4;

import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

public class MonRectangle extends Rectangle {

	public MonRectangle(double x, double y, double width, double height, Paint couleurFond) {
		super(x, y, width, height);
		this.setFill(couleurFond);
	}

}
