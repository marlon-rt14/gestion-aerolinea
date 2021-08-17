package app;

import app.modelo.Avion;
import app.modelo.Azafata;
import app.modelo.Piloto;
import app.modelo.Ticket;

public class MetodosAvion {

	private Avion avion;
	private int contador;
	private Ticket ticket;
	
	public MetodosAvion() {
		this.avion = null;
		this.contador = 1;
		this.ticket = null;
	}

	private boolean estaVacia(Avion lista) {
		if (lista == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void nuevoAvion(Azafata azafataA, Azafata azafataB, Azafata azafataC, Azafata azafataD, Piloto pilotoA, Piloto pilotoB){
		ticket = new Ticket();
		Avion nuevo = new Avion(contador, azafataA, azafataB, azafataC, azafataD, pilotoA, pilotoB, ticket);
		if(estaVacia(avion)){
			this.avion = nuevo;
			contador++;
		}else{
			Avion actual = avion;
			while(actual.getSiguiente() != null){
				actual = actual.getSiguiente();
			}
			actual.setSiguiente(nuevo);
			contador++;
		}
	}
	
	public Avion getAvion(int contador){
		Avion actual = avion;
		while(!estaVacia(actual)){
			if(actual.getContador() == contador){
				return actual;
			}else{
				actual = actual.getSiguiente();
			}
		}
		return null;
	}

	public void imprimirLista(){
		Avion actual = avion;
		while(!estaVacia(actual)){
			System.out.println("Avion No.: " + actual.getContador());
			System.out.println("Azafata 1: \n" + actual.getAzafataA().getAtributos());
			System.out.println("Azafata 2: \n" + actual.getAzafataB().getAtributos());
			System.out.println("Azafata 3: \n" + actual.getAzafataC().getAtributos());
			System.out.println("Azafata 4: \n" + actual.getAzafataD().getAtributos());
			System.out.println("Piloto 1: \n" + actual.getPilotoA().getAtributos());
			System.out.println("Piloto 2: \n" + actual.getPilotoB().getAtributos());
			System.out.println("Tickets: \n" + actual.getTicket().imprimirPuestos());
			System.out.println("________________________________________________ \n");
			actual = actual.getSiguiente();
		}
	}
	
	public void imprimirDisponibles(){
		Avion actual = avion;
		while(!estaVacia(actual)){
			System.out.println("Avion No.: " + actual.getContador());
			System.out.println("________________________________________________ \n");
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
