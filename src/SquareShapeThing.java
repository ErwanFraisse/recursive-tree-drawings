import processing.core.PApplet;

public class SquareShapeThing extends PApplet {
	public void setup() {
		size(600, 600);
		
		rectMode(CENTER);
		
		drawShape(300, 300, 300, 5);
	}
	
	public void drawShape(float x, float y, float s, int level) {
		if (level == 1) {
			rect(x, y, s, s);
			return;
		}
		
		rect(x, y, s, s);
		drawShape(x + s/2.0f, y + s/2.0f, s/3.0f, level - 1);
		drawShape(x + s/2.0f, y - s/2.0f, s/3.0f, level - 1);
		drawShape(x - s/2.0f, y + s/2.0f, s/3.0f, level - 1);
		drawShape(x - s/2.0f, y - s/2.0f, s/3.0f, level - 1);	
	}
}
