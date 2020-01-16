package Airport;

import java.util.*;

public class Airport_ implements Comparable<Airport_>{
    private String country;
    private String city;
    private String code3;

    public Airport_(String country, String city, String code3){
        this.country = country;
        this.city = city;
        this.code3 = code3;
    }

    public String getCountry(){
        return this.country;
    }

    public String getCity(){
        return this.city;
    }

    public String getCode3(){
        return this.code3;
    }
    
    public int compareTo(Airport_ other) {
    	return this.getCity().compareTo(other.getCity());
    }
    
    public static void main(String[] args) {
    	List<Airport_> list = new ArrayList<Airport_>();
    	
    	list.add(new Airport_("Brasil", "Guarulhos", "br8"));
    	list.add(new Airport_("Brasil", "Campinas", "br3"));
    	
    	list.forEach(n -> System.out.println(n.getCity()));
    	
    	Collections.sort(list);
    	
    	list.forEach(n -> System.out.println(n.getCity()));
  
    }
}