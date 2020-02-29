package Clases;

import java.util.Arrays;

import Clases.Fecha;

public class Archivo {
	private String nombre;
	private int tama�obytes;
	private Usuario usuariosubio;
	private Usuario[] usuarios;
	private String nombrecarpeta;
	private Fecha ultimaFecha;
	private Fecha subida;
	
	public Archivo(String nombre, int tama�obytes, Usuario usuariosubio, Usuario[] usuarios,
			String nombrecarpeta, Fecha ultimaFecha, Fecha subida) {
		this.nombre = nombre;
		this.tama�obytes = tama�obytes;
		this.usuariosubio = usuariosubio;
		this.usuarios = usuarios;
		this.nombrecarpeta = nombrecarpeta;
		this.ultimaFecha = ultimaFecha;
		this.subida = subida;
	}

	
	public String toString() {
		return "Archivo [nombre=" + nombre + ", tama�obytes=" + tama�obytes + ", usuariosubio=" + usuariosubio
				+ ", usuarios=" + Arrays.toString(usuarios) + ", nombrecarpeta=" + nombrecarpeta + ", ultimaFecha="
				+ ultimaFecha + ", subida=" + subida + "]";
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getTama�obytes() {
		return tama�obytes;
	}


	public void setTama�obytes(int tama�obytes) {
		this.tama�obytes = tama�obytes;
	}


	public Usuario getUsuariosubio() {
		return usuariosubio;
	}


	public void setUsuariosubio(Usuario usuariosubio) {
		this.usuariosubio = usuariosubio;
	}


	public Usuario[] getUsuarios() {
		return usuarios;
	}


	public void setUsuarios(Usuario[] usuarios) {
		this.usuarios = usuarios;
	}


	public String getNombrecarpeta() {
		return nombrecarpeta;
	}


	public void setNombrecarpeta(String nombrecarpeta) {
		this.nombrecarpeta = nombrecarpeta;
	}


	public Fecha getUltimaFecha() {
		return ultimaFecha;
	}


	public void setUltimaFecha(Fecha ultimaFecha) {
		this.ultimaFecha = ultimaFecha;
	}


	public Fecha getSubida() {
		return subida;
	}


	public void setSubida(Fecha subida) {
		this.subida = subida;
	}


	public boolean VerificarTamanio() {
		if(tama�obytes > 512000)
			return false;
		
		return true; 
	}

	
	public boolean VerificarExtension() {
		String partesnombre [] = nombre.split(".") ;
		if(partesnombre[1] == "bat" || partesnombre[1] == ".exe")
			return false;
		
		return true; 
	}
}
