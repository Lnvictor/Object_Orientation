import processing.core.*;

public class LoadImage extends PApplet{
	String URL = "https://imagensemoldes.com.br/wp-content/uploads/2018/06/Imagem-Sol-Sol-Brilhando-PNG.png";
	PImage webi;
	
	public void setup() {
		background(0);
		size(200,200);
		webi = loadImage(URL, "png");
	}
	
	public void draw() {
		webi.resize(0, height);
		image(webi, 0, 0);	
		
		fill(255, 255, 255);
		ellipse(width/3, height/3, width/5, height/5);
		ellipse(width/2, height/3, width/5, height/5);
		
		fill(255,0,0);
		ellipse(width/5, height/2, width/5, height/6);
		
		fill(0, 0, 0);
		ellipse(width/3, height/3, width/10, height/10);
		ellipse(width/2, height/3, width/10, height/10);
	}
	
	public static void main(String[] args) {
        PApplet.main(new String[] {LoadImage.class.getName()});
    }
}
