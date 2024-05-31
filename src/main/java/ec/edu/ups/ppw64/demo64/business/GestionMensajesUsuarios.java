package ec.edu.ups.ppw64.demo64.business;

import java.util.List;

import ec.edu.ups.ppw64.demo64.dao.MensajeUsuarioDAO;
import ec.edu.ups.ppw64.demo64.model.MensajesUsuarios;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class GestionMensajesUsuarios {

	@Inject
	private MensajeUsuarioDAO daoMsjUsuario;

	public void guardarMensajesUsuarioss(MensajesUsuarios MensajesUsuarios) {
		MensajesUsuarios men = daoMsjUsuario.read(MensajesUsuarios.getCodigo());
		if (men != null) {
			daoMsjUsuario.update(MensajesUsuarios);
		} else {
			System.out.println("MENSAJEEEEEEEEEEEES: " + MensajesUsuarios);
			daoMsjUsuario.insert(MensajesUsuarios);
			
		}
	}

	public void actualizarMensajesUsuarios(MensajesUsuarios MensajesUsuarios) throws Exception {
		MensajesUsuarios men = daoMsjUsuario.read(MensajesUsuarios.getCodigo());
		if (men != null) {
			daoMsjUsuario.update(MensajesUsuarios);
		} else {
			throw new Exception("MensajesUsuarios no existe");
		}
	}
	
	public void borrarCliente(int codigo) {

		daoMsjUsuario.remove(codigo);
	}

	public List<MensajesUsuarios> getMensajes() {
		return daoMsjUsuario.getAll();
	}
}
