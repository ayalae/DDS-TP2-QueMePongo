package model;

public class MailSender implements ServicioDeNotificaciones {
	List<Usuario> usuariosSuscriptos = new ArrayList<>();
	
	public void suscribirUsuario(Usuario usuario) {
		usuariosSuscriptos.add(usuario);
	}
	public void desuscribirUsuario(Usuario usuario) {
		usuariosSuscriptos.remove(usuario);
	}
	
	@Override
	public void nuevaAlerta() {
		usuariosSuscriptos.forEach(usuario-> enviarMail(usuario.email,/*alerta*/));
	}
	
	
}
