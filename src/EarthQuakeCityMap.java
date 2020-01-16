/*
 * 
 * 
 * @author: Victor Pereira
 * @version: 09/01/2020
 * */

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.data.PointFeature;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.marker.Marker;
import de.fhpotsdam.unfolding.marker.SimplePointMarker;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.providers.MBTilesMapProvider;
import de.fhpotsdam.unfolding.providers.Microsoft;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.*;
import java.util.*;


public class EarthQuakeCityMap extends PApplet{
	/**
	 * 
	 */
	private UnfoldingMap map;
	
	public void setup() {
		size(900, 600, OPENGL);
			
		map = new UnfoldingMap(this, 200, 50, 700, 500, new Microsoft.AerialProvider());
		
		
		map.zoomToLevel(2);		
		MapUtils.createDefaultEventDispatcher(this, map);
	}
	
	public void draw() {
		background(220);
		
		drawButtons();
		
		map.draw();
	}
	
	private void drawButtons() {
		fill(255,255,255);
		rect(100,100,25,25);
		
		fill(100,100,100);
		rect(100,150,25,25);
	}
	
	@Override
	public void keyPressed() {
		if (key == 'w') {
			background(0);
		}
	}
	
	@Override
	public void mouseReleased() {
		if (mouseX > 100 && mouseX < 125 && mouseY > 100 && mouseY <125) {
			background(225, 225, 225);
		}
		
		else if (mouseX > 100 && mouseX < 125 && mouseY > 150 && mouseY <175) {
			background(100, 100, 100);
		}
	}

}
