package model;
import java.util.*;

public class AccuWeatherAdapter implements ClimaAdapter {
	AccuWeatherAPI apiClima = new AccuWeatherAPI();
	
	public float probabilidadDePrecipitaciones(String Ciudad){
		
		List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather(Ciudad);
		
		int PrecipitationProbability = (int) condicionesClimaticas.get(0).get("PrecipitationProbability");
		
		return PrecipitationProbability;
	}
	
	
	public int temperaturaActual(String Ciudad) {

		List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather(Ciudad);
		
		HashMap<String,Object> temperatura = (HashMap<String, Object>) condicionesClimaticas.get(0).get("Temperature");
		
		int grados = (int)temperatura.get("Value");
		return  grados - 32;//convierto  temperatura a Celcius
	}
}

