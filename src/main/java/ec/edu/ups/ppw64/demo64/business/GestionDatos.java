package ec.edu.ups.ppw64.demo64.business;

import ec.edu.ups.ppw64.demo64.model.MensajesUsuarios;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;

@Singleton
@Startup
public class GestionDatos {
	
	@Inject
	GestionMensajesUsuarios gMensajes;

	@PostConstruct
	public void init() {
		System.out.println("iniciando");
		
		MensajesUsuarios msj = new MensajesUsuarios();
		
		msj.setNombre("Paul Sigua");
		msj.setCorreo("mateosigua2002@gmail.com");
		msj.setMensaje("Necesito más información con respecto a la tarea de ayer");
		
		gMensajes.guardarMensajesUsuarioss(msj);
	}
}