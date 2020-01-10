/**
 * 
 * This is a implementation of a program which draw a happy face
 * 
 * 
 * 
 * @author: Victor Pereira
 * @version: 08/01/2020
 * */

package happyFace;

import processing.core.*;

public class MyHappyFace extends PApplet{

	public void setup() {
		background(0);
		size(400, 600);
	}
	
	public void draw() {
		
		fill(255, 255, 0);
		ellipse(200, 300, 290, 290);
		fill(0, 0, 0);
		ellipse(150, 240, 45, 60);
		ellipse(250, 240, 45, 60);
		noFill();
		arc(200, 330, 180, 180, 0, PI);
		stroke(0);
	}
	
	public static void main(String[] args) {
		 PApplet.main(new String[] {MyHappyFace.class.getName()});
	}
}
