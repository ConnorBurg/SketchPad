import java.awt.Color;
import java.util.ArrayList;

public class Objects {
    public int x0, y0, x, y;
    public Color col;
    public int type; // line = 0 , square = 1, rectangle = 2, circle = 3, ellipse = 4, polygon = 5, scribble = 6
    public  ArrayList<point>points; //used for type 5 and type 6
    public Objects(int type, int x0, int y0, int x, int y) {
	this.x0 = x0;
	this.y0 = y0;
	this.x = x;
	this.y = y;
	this.type = type;
	
    }
    public class point{
	    int x, y;
	}
}