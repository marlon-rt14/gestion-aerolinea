
package app.modelo;

public class Avion {
	
	private int contador;
	private Azafata azafataA;
	private Azafata azafataB;
	private Azafata azafataC;
	private Azafata azafataD;
	private Piloto pilotoA;
	private Piloto pilotoB;
	private Ticket ticket;
//	private MetodosTicket ticket;
	private Avion siguiente;

	public Avion(int cont, Azafata azafataA, Azafata azafataB, Azafata azafataC, Azafata azafataD, Piloto pilotoA, Piloto pilotoB, Ticket ticket) {
		this.contador = cont;
		this.azafataA = azafataA;
		this.azafataB = azafataB;
		this.azafataC = azafataC;
		this.azafataD = azafataD;
		this.pilotoA = pilotoA;
		this.pilotoB = pilotoB;
		this.ticket = ticket;
		this.siguiente = null;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public Azafata getAzafataA() {
		return azafataA;
	}

	public void setAzafataA(Azafata azafataA) {
		this.azafataA = azafataA;
	}

	public Azafata getAzafataB() {
		return azafataB;
	}

	public void setAzafataB(Azafata azafataB) {
		this.azafataB = azafataB;
	}

	public Azafata getAzafataC() {
		return azafataC;
	}

	public void setAzafataC(Azafata azafataC) {
		this.azafataC = azafataC;
	}

	public Azafata getAzafataD() {
		return azafataD;
	}

	public void setAzafataD(Azafata azafataD) {
		this.azafataD = azafataD;
	}

	public Piloto getPilotoA() {
		return pilotoA;
	}

	public void setPilotoA(Piloto pilotoA) {
		this.pilotoA = pilotoA;
	}

	public Piloto getPilotoB() {
		return pilotoB;
	}

	public void setPilotoB(Piloto pilotoB) {
		this.pilotoB = pilotoB;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public Avion getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Avion siguiente) {
		this.siguiente = siguiente;
	}
	
	public String getAtributos() {
		String atributos = "";
		atributos = atributos + "AVION ID: \n" + getContador() + "\n";
		atributos = atributos + "Azafata 1: \n" + getAzafataA().getAtributos() + "\n";
		atributos = atributos + "Azafata 2: \n" + getAzafataB().getAtributos() + "\n";
		atributos = atributos + "Azafata 3: \n" + getAzafataC().getAtributos() + "\n";
		atributos = atributos + "Azafata 4: \n" + getAzafataD().getAtributos() + "\n";
		atributos = atributos + "Piloto 1: \n" + getPilotoA().getAtributos() + "\n";
		atributos = atributos + "Piloto 2: \n" + getPilotoB().getAtributos() + "";
		//System.out.println("____________________________________ \n");
		return atributos;
	}
	
}
