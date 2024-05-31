package ec.edu.ups.ppw64.demo64.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class MensajesUsuarios {

	@Id
	@GeneratedValue
	private int codigo;
	private String nombre;
	private String correo;
	private String mensaje;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public String toString() {
		return "MensajesUsuarios [codigo=" + codigo + ", nombre=" + nombre + ", correo=" + correo + ", mensaje="
				+ mensaje + "]";
	}
}
