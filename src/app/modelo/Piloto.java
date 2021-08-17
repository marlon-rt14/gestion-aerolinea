
package app.modelo;

public class Piloto extends Persona {
	
	private int numCarnet;
	private Piloto siguiente;
	
	public Piloto(int id, int numCarnet, String cedula, String nombre, String apellido,
		String direccion, String telefono){
		super(id, cedula, nombre, apellido, direccion, telefono);
		this.numCarnet = numCarnet;
		this.siguiente = null;
	}

	public int getNumCarnet() {
		return numCarnet;
	}

	public void setNumCarnet(int numCarnet) {
		this.numCarnet = numCarnet;
	}

	public Piloto getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Piloto siguiente) {
		this.siguiente = siguiente;
	}
	
	public String getAtributos() {
		String atributos = "";
		atributos = atributos + "	Piloto ID: " + getID() + "\n";
		atributos = atributos + "	Cedula: " + getCedula() + "\n";
		atributos = atributos + "	Nombre: " + getNombre() + "\n";
		atributos = atributos + "	Apellido: " + getApellido() + "\n";
		atributos = atributos + "	Direccion: " + getDireccion() + "\n";
		atributos = atributos + "	Telefono: " + getTelefono() + "\n";
		atributos = atributos + "	Numero de Carnet: " + getNumCarnet()+ "\n";
		//System.out.println("____________________________________ \n");
		return atributos;
	}

}
