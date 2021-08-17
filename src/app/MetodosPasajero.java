
package app;

import app.modelo.Pasajero;

public class MetodosPasajero {
	
	private Pasajero pasajero;
	private int contador;
	
	public MetodosPasajero(){
		this.pasajero = null;
		this.contador = 1;
	}
	
	private boolean estaVacia(Pasajero lista){
		return lista == null;
	}
	
	public void nuevaPasajero(String cedula, String nombre, String apellido, 
		String direccion, String telefono, String vacunado, String horaVuelo){
		
		Pasajero nuevo = new Pasajero(contador, cedula, nombre, apellido, direccion, telefono, vacunado, horaVuelo);
		
		if(estaVacia(pasajero)){
			pasajero = nuevo;
			contador++;
		}else{
			Pasajero actual = pasajero;
			while(actual.getSiguiente() != null){
				actual = actual.getSiguiente();
			}
			actual.setSiguiente(nuevo);
			contador++;
		}
	}
	
	public Pasajero getPasajero(String cedula){
		Pasajero actual = pasajero;
		while(!estaVacia(actual)){
			if(actual.getCedula().equals(cedula)){
				return actual;
			}else{
				actual = actual.getSiguiente();
			}
		}
		return null;
	}
	
	public void imprimirLista(){
		Pasajero actual = pasajero;
		while(!estaVacia(actual)){
			System.out.println("Cedula: " + actual.getCedula());
			System.out.println("Nombre: " + actual.getNombre());
			System.out.println("Apellido: " + actual.getApellido());
			System.out.println("Direccion: " + actual.getDireccion());
			System.out.println("Telefono: " + actual.getTelefono());
			System.out.println("Vacunado: " + actual.getVacunado());
			System.out.println("Hora de vuelo: " + actual.getHoraVuelo());
			System.out.println("____________________________________ \n");
			actual = actual.getSiguiente();
		}
	}
	public void imprimirDisponibles(){
		Pasajero actual = pasajero;
		while(!estaVacia(actual)){
			System.out.println("Cedula: " + actual.getCedula());
			System.out.println("Nombre: " + actual.getNombre());
			System.out.println("Apellido: " + actual.getApellido());
//			System.out.println("Direccion: " + actual.getDireccion());
//			System.out.println("Telefono: " + actual.getTelefono());
//			System.out.println("Vacunado: " + actual.getVacunado());
//			System.out.println("Hora de vuelo: " + actual.getHoraVuelo());
			System.out.println("____________________________________ \n");
			actual = actual.getSiguiente();
		}
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
	
}
