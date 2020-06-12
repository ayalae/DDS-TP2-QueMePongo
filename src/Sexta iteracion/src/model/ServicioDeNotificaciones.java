package model;

public interface ServicioDeNotificaciones {
	public void suscribirUsuario(Usuario usuario);
	public void desuscribirUsuario(Usuario usuario);
	public void nuevaAlerta();
}
