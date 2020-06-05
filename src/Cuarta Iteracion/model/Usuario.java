package model;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Usuario {
	List<Prenda> prendasDisponibles = new ArrayList<>();
	String ciudad;
	
	public Usuario(List<Prenda> prendasDisponibles, String ciudad) {
		this.prendasDisponibles = prendasDisponibles;
		this.ciudad = ciudad;
	}
	
	public List<Prenda> prendasAptasPorTemperatura(ClimaAdapter clima) {
		int temperaturaActual = clima.temperaturaActual(ciudad);
		return prendasDisponibles.stream().filter(prenda -> prenda.temperaturaMaxima>temperaturaActual).collect(Collectors.toList());
	}
	
	public List<AtuendoSugerido> sugerirAtuendoPorTemperatura(ClimaAdapter clima, GeneradorDeSugerencias generador){
		return generador.generarSugerenciaDesde(prendasAptasPorTemperatura(clima));
	}
}
