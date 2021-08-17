
package app.modelo;

public class Pasajero extends Persona {
	
	private String vacunado;
	private String horaVuelo;
	private Pasajero siguiente;
	
	public Pasajero(int id, String cedula, String nombre, String apellido, 
		String direccion, String telefono, String vacunado, String horaVuelo){
		
		super(id, cedula, nombre, apellido, direccion, telefono);
		this.vacunado = vacunado;
		this.horaVuelo = horaVuelo;
		this.siguiente = null;
	}

	public String getVacunado() {
		return vacunado;
	}

	public void setVacunado(String vacunado) {
		this.vacunado = vacunado;
	}

	public String getHoraVuelo() {
		return horaVuelo;
	}

	public void setHoraVuelo(String horaVuelo) {
		this.horaVuelo = horaVuelo;
	}

	public Pasajero getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Pasajero siguiente) {
		this.siguiente = siguiente;
	}

	public boolean tieneCedula(String cedula){
		boolean tieneCedula = false;
		if(super.getCedula().equalsIgnoreCase(cedula)){
			tieneCedula = true;
		}else{
			tieneCedula = false;
		}
		return tieneCedula;
	}
	
	
	
	public String getAtributos() {
		String atributos = "";
		atributos = atributos + "	Cedula: " + getCedula() + "\n";
		atributos = atributos + "	Nombre: " + getNombre() + "\n";
		atributos = atributos + "	Apellido: " + getApellido() + "\n";
		atributos = atributos + "	Direccion: " + getDireccion() + "\n";
		atributos = atributos + "	Telefono: " + getTelefono() + "\n";
		atributos = atributos + "	Vacunado: " + getVacunado() + "\n";
		atributos = atributos + "	Hora de vuelo: " + getHoraVuelo() + "\n";
		//System.out.println("____________________________________ \n");
		return atributos;
	}
}
