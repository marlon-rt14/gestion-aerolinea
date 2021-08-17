package app;

import app.modelo.Piloto;

public class MetodosPiloto {

	private Piloto piloto;
	private int contador;

	public MetodosPiloto() {
		this.piloto = null;
		this.contador = 1;
	}

	private boolean estaVacia(Piloto lista) {
		return lista == null;
	}

	public void nuevoPiloto(int numCarnet, String cedula, String nombre, String apellido,
		String direccion, String telefono) {
		Piloto nuevo = new Piloto(contador, numCarnet, cedula, nombre, apellido, direccion, telefono);
		if (estaVacia(piloto)) {
			this.piloto = nuevo;
			contador++;
		} else {
			Piloto actual = this.piloto;
			while (actual.getSiguiente() != null) {
				actual = actual.getSiguiente();
			}
			actual.setSiguiente(nuevo);
			contador++;
		}
	}

	public Piloto getPiloto(String cedula){
		Piloto actual = piloto;
		while(!estaVacia(piloto)){
			if(actual.getCedula().equals(cedula)){
				return actual;
			}else{
				actual = actual.getSiguiente();
			}
		}
		return null;
	}
	
	public void imprimirLista() {
		Piloto actual = this.piloto;
		while (!estaVacia(actual)) {
			System.out.println("Piloto ID: " + actual.getID());
			System.out.println("Cedula: " + actual.getCedula());
			System.out.println("Nombre: " + actual.getNombre());
			System.out.println("Apellido: " + actual.getApellido());
			System.out.println("Direccion: " + actual.getDireccion());
			System.out.println("Telefono: " + actual.getTelefono());
			System.out.println("Numero de Permiso: " + actual.getNumCarnet());
			System.out.println("____________________________________ \n");
			actual = actual.getSiguiente();
		}
	}
	public void imprimirDisponibles() {
		Piloto actual = this.piloto;
		while (!estaVacia(actual)) {
			System.out.println("Piloto ID: " + actual.getID());
			System.out.println("Cedula: " + actual.getCedula());
//			System.out.println("Nombre: " + actual.getNombre());
//			System.out.println("Apellido: " + actual.getApellido());
//			System.out.println("Direccion: " + actual.getDireccion());
//			System.out.println("Telefono: " + actual.getTelefono());
//			System.out.println("Numero de Permiso: " + actual.getNumCarnet());
			System.out.println("____________________________________ \n");
			actual = actual.getSiguiente();
		}
	}

}
