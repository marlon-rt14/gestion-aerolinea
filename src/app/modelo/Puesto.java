
package app.modelo;

public class Puesto {
	
	private Pasajero pasajero;
	
	private int numeroPuesto;
	
	public Puesto(int puesto){
		this.numeroPuesto = puesto;
	}
	
	public Pasajero getPasajero(){
		return pasajero;
	}
	
	public boolean estaOcuapado(){
		boolean ocupado = pasajero != null;
		return ocupado;
	}
	
	public void setPasajero(Pasajero pasajero){
		this.pasajero = pasajero;
	}
	
	public void eliminarPasajero(){
		pasajero = null;
	}
	
	public int darNumeroDePuesto(){
		return numeroPuesto;
	}
	
}
