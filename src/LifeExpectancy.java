import java.util.List;

import java.util.*;
import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.data.GeoJSONReader;
import de.fhpotsdam.unfolding.data.PointFeature;
import de.fhpotsdam.unfolding.marker.Marker;
import de.fhpotsdam.unfolding.providers.Microsoft;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;

public class LifeExpectancy extends PApplet{
	
	List<Feature> countries;
	List<Marker> markers;
	
	Map<String, Float> LifeExpByCountry;
	public UnfoldingMap map;
	
	private void shadeCountries() {
		for (Marker marker  : markers) {
			String countryId = marker.getId();
			
			if (LifeExpByCountry.containsKey(countryId)) {
				float lifeExp = LifeExpByCountry.get(countryId);
				int colorLevel = (int) map(lifeExp, 40, 90, 10, 255);
				marker.setColor(color(255 - colorLevel, 100, colorLevel));
			}
			
			else {
				marker.setColor(color(150, 150, 150));
			}
			
		}
	}
	
	private String[] loadrows(String path) {
		String[] rows;
		
		
		
		
		return rows;
	}
	
	public Map<String, Float> loadLifeExpecatancyFromCSV(String path) {
		Map<String, Float> LifeExpMap = new HashMap<String, Float>();
		
		String[] rows = loadrows(path);
		
		for(String row : rows) {
			
			String[] columns = row.split(",");
			
			for(String column : columns) {
				continue;
			}
		}
		
		return LifeExpMap;
	}
	
	public void setup() {
		size(800, 600, OPENGL);
		
		countries = GeoJSONReader.loadData(this, "data/countries.geo.json");
		markers = MapUtils.createSimpleMarkers(countries);
		
		LifeExpByCountry = loadLifeExpecatancyFromCSV("data/MY.csv");
		map = new UnfoldingMap(this, 200, 50, 700, 500, new Microsoft.AerialProvider());
		map.zoomToLevel(2);
		MapUtils.createDefaultEventDispatcher(this, map);
		map.addMarkers(markers);
		shadeCountries();
	}
	
	public void draw() {
		map.draw();
	}
}
