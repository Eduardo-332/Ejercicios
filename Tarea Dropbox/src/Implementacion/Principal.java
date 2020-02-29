package Implementacion;

import java.util.ArrayList;

import javax.swing.JOptionPane;


import Clases.Archivo;
import Clases.Fecha;
import Clases.Usuario;


public class Principal {
	
	
	public Principal() {
		
		int opcion;
		archivos = new ArrayList<Archivo>();
		
		do{
			opcion = Integer.parseInt(JOptionPane.showInputDialog(
					"1. Ingresar Informacion \n"
					+ "2. Mostar Informacion \n"
					+ "0. Salir"
			));
			switch(opcion) {
			case 1:
				AgregarArchivo();
				break;
				
			case 2:
				MostrarInformacion();
				break;
				
			case 0:
				System.out.println("Adios");
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Opción inválida");
				break;
			}
		}while(opcion!=0);
	}
	
	public void AgregarArchivo() {
		System.out.println("Agregar");
		
		Archivo a1 = new Archivo();
		
		
		do {
			a1.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del archivo"));
		} while (!a1.VerificarExtension());
		
		do{
			a1.setTamañobytes(Integer.parseInt(JOptionPane.showInputDialog("Tamanio bytes")));
			}
			while(!a1.VerificarTamanio());
		
		Usuario usuario = new Usuario();
		usuario.setNombreusuario(JOptionPane.showInputDialog("Ingrese el nombre del usuario."));
		do {
			usuario.setCorreoelectronico(JOptionPane.showInputDialog("Ingrese el correo electronico."));
		} while (!usuario.VerificarCorreo());
		a1.setUsuariosubio(usuario);
		
		int cantusuarios = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de usuarios a compartir"));
				
		if( cantusuarios > 5 || cantusuarios < 1 );
			Usuario usuarioscompartidos[] = new Usuario[cantusuarios];
			for(int i=0; i<cantusuarios; i++) {
				usuarioscompartidos[i].setNombreusuario(JOptionPane.showInputDialog("Ingrese el nombre del usuario"));
				do {
					usuarioscompartidos[i].setCorreoelectronico(JOptionPane.showInputDialog("Ingrese el correo electronico"));
				} while (!usuarioscompartidos[i].VerificarCorreo());
			}
						
			a1.setUsuarios(usuarioscompartidos);
			
			a1.setNombrecarpeta(JOptionPane.showInputDialog("ingrese el nombre de la carpeta."));
			
			
			
			a1.setSubida(new Fecha(JOptionPane.showInputDialog("Ingrese la fecha de subida.")));
			
			a1.setUltimaFecha(new Fecha(JOptionPane.showInputDialog("Ingrese la ultima fecha de modificacion.")));
	}
	
	public void MostrarInformacion() {
		System.out.println("Mostrar");
		System.out.println();
		
		
	}

	public static void main(String[] args) {
		new Principal();
	}

}
