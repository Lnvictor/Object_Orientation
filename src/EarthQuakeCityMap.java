import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.providers.StamenMapProvider;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.*;


public class EarthQuakeCityMap extends PApplet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UnfoldingMap map;
	
	public void setup() {
		size(900, 600, OPENGL);
		map = new UnfoldingMap(this, 200, 50, 700, 500, new StamenMapProvider());
		map.zoomToLevel(2);
		MapUtils.createDefaultEventDispatcher(this, map);
	}
	
	public void draw() {
		background(10);
		map.draw();
	}

}
