package model;

public class Prenda {
	Tipo tipo;
	Color colorPrincipal;
	Color colorSecundario;
	Material material;
	Trama trama;
	int temperaturaMaxima;
	public Prenda(Tipo tipo, Color colorPrincipal, Color colorSecundario, Material material,Trama trama,Integer temperaturaMaxima ){
		this.tipo=tipo;
		this.colorPrincipal=colorPrincipal;
		this.colorSecundario=colorSecundario;
		this.material=material;
		this.trama=trama;
		this.temperaturaMaxima=temperaturaMaxima;
	}
}
