import processing.core.PApplet;

public class TreeStarter extends PApplet{
    Turtle t;
    
    public void setup(){
        size(600,600);    
        t = new Turtle(100, 300, 0, this);
    
        background(255);
        t.setColor( color(0) );		// set turtle color black			// move turtle forward 30
        
        drawTree(t, 4, 200, 30, 25);   	
    }
    
    public void drawTree(Turtle t, int lvl, float length, 
    						float angle, int lineThickness) {
    	
    	if (lvl == 0) return;
    	
    	t.setThickness(lineThickness/2);
    	
    	t.forward(length);
    	t.turnLeft(angle);
    	
    	drawTree(t, lvl-1, (float) (length*0.6f), angle, lineThickness/2);
    	t.turnRight(angle*2);
    	drawTree(t, lvl-1, (float) (length*0.6f), angle, lineThickness/2);
    	
    	t.turnLeft(angle);
    	t.forward(-length);
    }
}

/* RECURSIVE CASE:
 * go forward by length
 * turn left by angle
 * draw the lvl - 1 tree
 * turn right by 2*angle
 * draw the lvl -1 tree
 * 
 * turn left by angle
 * go backwards by length
 */