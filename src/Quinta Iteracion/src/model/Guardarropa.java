package model;

import java.util.ArrayList;
import java.util.List;

public class Guardarropa {
	List<Propuesta> propuestasAceptadas = new ArrayList<>();
	List<Propuesta> propuestasPendientes = new ArrayList<>();
	List<Prenda> prendasGuardadas = new ArrayList<>();
	
	void proponerAgregarPrenda(Prenda prenda){
		propuestasPendientes.add(new PropuestadeAgregar(prenda,this));
	}
	
	void proponerQuitarPrenda(Prenda prenda) {
		if(prendasGuardadas.contains(prenda))
		propuestasPendientes.add(new PropuestadeQuitar(prenda,this));
	}
	
	List<Propuesta> obtenerPropuestasAceptadas() {
		return propuestasAceptadas;
	}
	
	List<Propuesta> obtenerPropuestasPendientes() {
		return propuestasPendientes;
	}
	
	void aceptarPropuesta(Propuesta propuesta) {
		propuestasPendientes.remove(propuesta);
		propuestasAceptadas.add(propuesta);
	}
	void rechazarPropuesta(Propuesta propuesta) {
		propuestasPendientes.remove(propuesta);
	}
	void deshacerPropuesta(Propuesta propuesta) {
		propuestasAceptadas.remove(propuesta);
	}
}
