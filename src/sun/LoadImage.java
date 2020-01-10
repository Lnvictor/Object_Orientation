package sun;
import processing.core.*;

public class LoadImage extends PApplet{
	String URL = "https://imagensemoldes.com.br/wp-content/uploads/2018/06/Imagem-Sol-Sol-Brilhando-PNG.png";
	PImage webi;
	
	public void setup() {
		background(0);
		size(200,200);
		webi = loadImage(URL, "png");
		webi.resize(0, height);
		image(webi, 0, 0);	
	}
	
	public void draw() {
		
		fill(255, 255, 255);
		ellipse(width/3, height/3, width/5, height/5);
		ellipse(width/2, height/3, width/5, height/5);
		
		fill(255,0,0);
		ellipse(width/5, height/2, width/5, height/6);
		
		int[] color = secondSun(second());
		
		fill(color[0], color[1], color[2]);
		ellipse(width/3, height/3, width/10, height/10);
		ellipse(width/2, height/3, width/10, height/10);
	}
	
	public int[] secondSun(float seconds) {
		int [] rgb = new int[3];
		
		float diffrom30 = Math.abs(30 - seconds);
		float ratio = diffrom30 / 30;
		
		rgb[0] = (int) (255 * ratio);
		rgb[1] = (int) (255 * ratio);
		rgb[2] = 0;
		
		return rgb;
	}
	
	public static void main(String[] args) {
        PApplet.main(new String[] {LoadImage.class.getName()});
    }
}
