package app.modelo;

public class Azafata extends Persona {

	private int numPermiso;
	private Azafata siguiente;

	public Azafata(int id, int numPermiso, String cedula, String nombre, String apellido,
		String direccion, String telefono) {
		super(id, cedula, nombre, apellido, direccion, telefono);
		this.numPermiso = numPermiso;
		this.siguiente = null;
	}

	public int getNumPermiso() {
		return numPermiso;
	}

	public void setNumPermiso(int numPermiso) {
		this.numPermiso = numPermiso;
	}

	public Azafata getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Azafata siguiente) {
		this.siguiente = siguiente;
	}

	public String getAtributos() {
		String atributos = "";
		atributos = atributos + "	Cedula: " + getCedula() + "\n";
		atributos = atributos + "	Nombre: " + getNombre() + "\n";
		atributos = atributos + "	Apellido: " + getApellido() + "\n";
		atributos = atributos + "	Direccion: " + getDireccion() + "\n";
		atributos = atributos + "	Telefono: " + getTelefono() + "\n";
		atributos = atributos + "	Numero de Permiso: " + getNumPermiso() + "\n";
		//System.out.println("____________________________________ \n");
		return atributos;
	}

}
