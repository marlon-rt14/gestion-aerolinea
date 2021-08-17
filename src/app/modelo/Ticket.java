package app.modelo;

import java.util.Random;

public class Ticket {

	//Pasajero pasajero;
	public static final int TAMANIO = 80;
	public static final int NO_HAY_PUESTO = -1;
	public static final int PASAJERO_NO_EXISTE = -3;
	public static final int PASAJERO_YA_EXISTE = -4;

	private Puesto puestos[];
	private int contador;
	private Ticket siguiente;

	public Ticket() {
		puestos = new Puesto[TAMANIO];
		for (int i = 0; i < TAMANIO; i++) {
			puestos[i] = new Puesto(i);
		}
		this.contador = 1;
		this.siguiente = null;
	}

	

	
	public Ticket getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Ticket siguiente) {
		this.siguiente = siguiente;
	}

	public Puesto[] getPuestos() {
		return puestos;
	}

	public void setPuestos(Puesto[] puestos) {
		this.puestos = puestos;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public void comprarTicket(String cedula, String nombre, String apellido, String direccion, String telefono, String vacunado, String horaVuelo) {
		int resultado = buscarPuestoLibre();
		if (resultado != NO_HAY_PUESTO) {
			Pasajero nuevo = new Pasajero(contador, cedula, nombre, apellido, direccion, telefono, vacunado, horaVuelo);
			contador++;
			puestos[resultado].setPasajero(nuevo);
		}
	}

	public void cambiarTicket(String cedula) {
		int puestoActual = buscarPuestoPasajero(cedula);
		if (puestoActual != PASAJERO_NO_EXISTE) {
			if (existePuestoLibre()) {
				int nuevoPuesto = buscarPuestoLibreAleatorio();
				while (nuevoPuesto == puestoActual) {
					nuevoPuesto = buscarPuestoLibreAleatorio();
				}
				puestos[nuevoPuesto].setPasajero(puestos[puestoActual].getPasajero());
				cancelarTicket(cedula);

			}
		}
	}

	public void cancelarTicket(String cedula) {
		int numeroPuesto = buscarPuestoPasajero(cedula);
		if (numeroPuesto != PASAJERO_NO_EXISTE) {
			puestos[numeroPuesto].eliminarPasajero();
		}
	}

	private  int buscarPuestoLibre() {
		int puesto = NO_HAY_PUESTO;
		for (int i = 0; i < TAMANIO && puesto == NO_HAY_PUESTO; i++) {
			if (!puestos[i].estaOcuapado()) {
				puesto = i;
			}
		}
		return puesto;
	}

	private  int buscarPuestoLibreAleatorio() {
		int puesto = NO_HAY_PUESTO;
		Random rnd = new Random();
		int num = rnd.nextInt(80);
		do {
			if (!puestos[num].estaOcuapado()) {
				puesto = num;
			}
		} while (puesto == NO_HAY_PUESTO);
		return puesto;
	}

	private  boolean existePuestoLibre() {
		for (int i = 0; i < TAMANIO; i++) {
			if (!puestos[i].estaOcuapado()) {
				return true;
			}
		}
		return false;
	}

	private int buscarPuestoPasajero(String cedula) {
		int puesto = PASAJERO_NO_EXISTE;
		for (int i = 0; i < TAMANIO && puesto == PASAJERO_NO_EXISTE; i++) {
			if (puestos[i].getPasajero().getCedula().equals(cedula)) {
				puesto = i;
			}
		}
		return puesto;
	}

	public String imprimirPuestos() {
		String puestosOcupados = "";
		for (int i = 0; i < TAMANIO; i++) {
			if (puestos[i].estaOcuapado()) {
				puestosOcupados = puestosOcupados + puestos[i].getPasajero().getAtributos() + "\n";
			}
		}
		return puestosOcupados;
	}


}
