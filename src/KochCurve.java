import processing.core.PApplet;

public class KochCurve extends PApplet {
	
	public void setup() {
		size(600, 600);
		
		background(255);
		
		Turtle t = new Turtle(50, 300, 0, this);
		
		drawShape(t,5,500);
	}
	
	public void drawShape(Turtle t, int level, int length) {
		if (level <= 0) {
			t.forward(length);
			return;
		}
		
		drawShape(t, level - 1, length/3);
		t.turnLeft(60);
		drawShape(t, level - 1, length/3);
		t.turnRight(120);
		drawShape(t, level - 1, length/3);
		t.turnLeft(60);
		drawShape(t, level - 1, length/3);
	}
}
