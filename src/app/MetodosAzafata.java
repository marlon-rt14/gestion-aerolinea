
package app;

import app.modelo.Azafata;

public class MetodosAzafata {
	
	private Azafata azafata;
	private int contador;
	
	public MetodosAzafata(){
		this.azafata = null;
		this.contador = 1;
	}
	
	private boolean estaVacia(Azafata lista){
		return lista == null;
	}
	
	public void nuevaAzafata(int numPermiso, String cedula, String nombre, String apellido, 
		String direccion, String telefono){
		Azafata nuevo = new Azafata(contador, numPermiso, cedula, nombre, apellido, direccion, telefono);
		if(estaVacia(azafata)){
			azafata = nuevo;
			contador++;
		}else{
			Azafata actual = azafata;
			while(actual.getSiguiente() != null){
				actual = actual.getSiguiente();
			}
			actual.setSiguiente(nuevo);
			contador++;
		}
	}
	
	public Azafata getAzafata(String cedula){
		Azafata actual = azafata;
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
		Azafata actual = azafata;
		while(!estaVacia(actual)){
			System.out.println("Azafata ID: "+ actual.getID());
			System.out.println("Cedula: " + actual.getCedula());
			System.out.println("Nombre: " + actual.getNombre());
			System.out.println("Apellido: " + actual.getApellido());
			System.out.println("Direccion: " + actual.getDireccion());
			System.out.println("Telefono: " + actual.getTelefono());
			System.out.println("Numero de Permiso: " + actual.getNumPermiso());
			System.out.println("____________________________________ \n");
			actual = actual.getSiguiente();
		}
	}
	
	public void imprimirDisponibles(){
		Azafata actual = azafata;
		while(!estaVacia(actual)){
			System.out.println("Azafata ID: "+ actual.getID());
			System.out.println("Cedula: " + actual.getCedula());
//			System.out.println("Nombre: " + actual.getNombre());
//			System.out.println("Apellido: " + actual.getApellido());
//			System.out.println("Direccion: " + actual.getDireccion());
//			System.out.println("Telefono: " + actual.getTelefono());
//			System.out.println("Numero de Permiso: " + actual.getNumPermiso());
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
