package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Usuario {
		List<Guardarropa> guardarropas = new ArrayList<>();
		List<Prenda> prendasDisponibles = new ArrayList<>();
		String ciudad;
		
		public Usuario(List<prenda> prendasDisponibles, String ciudad,List<guardarropa> guardarropas) {
			this.prendasDisponibles = prendasDisponibles;
			this.ciudad = ciudad;
			this.guardarropas=guardarropas;
		}
		
		public void agregarGuardarropaCompartido(Guardarropa guardarropaCompartido, Usuario usuario) {
			guardarropas.add(guardarropaCompartido);
		    usuario.agregarGuardarropa(guardarropaCompartido);
		}
		
		public void agregarGuardarropa(Guardarropa guardarropa) {
			guardarropas.add(guardarropa);
		}
	

		
}
