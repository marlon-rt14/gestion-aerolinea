package app;

import app.modelo.Avion;
import app.modelo.Azafata;
import app.modelo.Pasajero;
import app.modelo.Piloto;
import app.modelo.Ticket;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);

		Avion avionActual;
		Azafata azafataActual;
		Piloto pilotoActual;
		Pasajero pasajeroActual;
		
		Azafata azafataA = null;
		Azafata azafataB = null;
		Azafata azafataC = null;
		Azafata azafataD = null;
		
		Piloto pilotoA = null;
		Piloto pilotoB = null;
		
		Random rnd = new Random();
		
		int op = 0;
		String cedula = "";
		String nombre = "";
		String apellido = "";
		String direccion = "";
		String telefono = "";

		int numCarnet = 0;
		String vacunado = "";
		String horaVuelo = "";
		int numPermiso = 0;

		//iniciar datos
		MetodosAvion metodosAvion = new MetodosAvion();
		MetodosAzafata metodosAzafata = new MetodosAzafata();
		MetodosPiloto metodosPiloto = new MetodosPiloto();
		MetodosPasajero metodosPasajero = new MetodosPasajero();
//
		metodosAzafata.nuevaAzafata(001, "0401974480", "Karol", "Egas", "Bolivar", "0992623321");
		metodosAzafata.nuevaAzafata(001, "0405655122", "Kathy", "Armas", "Ibarra", "0998456122");
		metodosAzafata.nuevaAzafata(001, "0408794651", "Andrea", "Itas", "Tulcan", "0768419873");
		metodosAzafata.nuevaAzafata(001, "1324874324", "Megan", "Parker", "bolivar", "0954545468");

		metodosPiloto.nuevoPiloto(145789, "1004789640", "Andres", "Lopez", "Quito", "0956434315");
		metodosPiloto.nuevoPiloto(145789, "1021598656", "Roberto", "Cardenas", "Cuenca", "0955489453");
		metodosPiloto.nuevoPiloto(145789, "0549692498", "Carlos", "Milagros", "Guayaquil", "0189746514");
		metodosPiloto.nuevoPiloto(145789, "1534867453", "Kevin", "Erazo", "Esmeraldas", "09515798231");
//
		azafataA = metodosAzafata.getAzafata("0401974480");
		azafataB = metodosAzafata.getAzafata("0405655122");
		azafataC = metodosAzafata.getAzafata("0408794651");
		azafataD = metodosAzafata.getAzafata("1324874324");
//		
		pilotoA = metodosPiloto.getPiloto("1004789640");
		pilotoB = metodosPiloto.getPiloto("1021598656");
////		
		metodosAvion.nuevoAvion(azafataA, azafataB, azafataC, azafataD, pilotoA, pilotoB);
		metodosAvion.nuevoAvion(azafataA, azafataB, azafataC, azafataD, pilotoA, pilotoB);
//		//metodosAvion.nuevoAvion(azafataA, azafataB, azafataC, azafataD, pilotoA, pilotoB);
//		//metodosAvion.nuevoAvion(azafataA, azafataB, azafataC, azafataD, pilotoA, pilotoB);
//
////		metodosAzafata.imprimirLista();
////		metodosPiloto.imprimirLista();
////		metodosAvion.imprimirLista();
//		avionActual = metodosAvion.getAvion(1);
//		avionActual.getTicket().comprarTicket("010", "marlon", "ruiz", "bolivar", "0992623321", "si", "21/05/2021");
//		avionActual.getTicket().comprarTicket("020", "javier", "ruiz", "bolivar", "0992623321", "si", "21/05/2021");
////		avionActual.getTicket().comprarTicket("030", "andres", "ruiz", "bolivar", "0992623321", "si", "21/05/2021");
////		
//		Avion actual2 = metodosAvion.getAvion(2);
//		actual2.getTicket().comprarTicket("040", "karol", "taruchain", "ecuador", "0992623321", "si", "21/05/2021");
//		actual2.getTicket().comprarTicket("050", "kathy", "taruchain", "ecuador", "0992623321", "si", "21/05/2021");
//		actual2.getTicket().comprarTicket("060", "megan", "taruchain", "ecuador", "0992623321", "si", "21/05/2021");
//		
//		avionActual.getTicket().cancelarTicket("020");
//		
//		metodosAvion.nuevoAvion(azafataA, azafataB, azafataC, azafataD, pilotoA, pilotoB);
//		
		do {
			System.out.println("SELECCIONE UNA OPCION DEL MENU");
			System.out.println("1.- Ingresar datos de aviones, pilotos, azafatas o pasajeros\n"
				+ "2.- Compra, cambio o cancelacion de tickets\n"
				+ "3.- Ver atributos de objetos\n"
				+ "4.- Datos generales (estaditicas)\n"
				+ "5.- Salir");
			op = dato.nextInt();
			System.out.println("");
			switch (op) {
				case 1: // Ingresar datos de aviones, pilotos, azafatas o pasajeros
					System.out.println("1.- Ingresar un avion\n"
						+ "2.- Ingresar un piloto\n"
						+ "3.- Ingresar un azafata\n"
						+ "4.- Inggresar un pasajero\n"
						+ "5.- Regresar");
					op = dato.nextInt();
					System.out.println("");
					if (op > 1 && op < 5) {
						System.out.print("Cedula: ");
						cedula = validarCedula();
						System.out.print("Nombre: ");
						nombre = dato.next();
						System.out.print("Apellido: ");
						apellido = dato.next();
						System.out.print("Direccion: ");
						direccion = dato.next();
						System.out.print("Telefono: ");
						telefono = dato.next();
					}
					switch (op) {
						case 1: //avion
							System.out.println("SELECCIONE UNA AZAFATA: ");
							metodosAzafata.imprimirDisponibles();
							
							System.out.println("Azafata 1");
							System.out.print("Cedula: ");
							cedula = validarCedula();
							azafataA = metodosAzafata.getAzafata(cedula);
							System.out.println("");
							
							System.out.println("Azafata 2");
							System.out.print("Cedula: ");
							cedula = validarCedula();
							azafataB = metodosAzafata.getAzafata(cedula);
							System.out.println("");
							
							System.out.println("Azafata 3");
							System.out.print("Cedula: ");
							cedula = validarCedula();
							azafataC = metodosAzafata.getAzafata(cedula);
							System.out.println("");
							
							System.out.println("Azafata 4");
							System.out.print("Cedula: ");
							cedula = validarCedula();
							azafataD = metodosAzafata.getAzafata(cedula);
							System.out.println("");
							
							System.out.println("SELECCIONE UN PILOTO");
							metodosPiloto.imprimirDisponibles();
							
							System.out.println("Piloto 1");
							System.out.print("Cedula: ");
							cedula = validarCedula();
							pilotoA = metodosPiloto.getPiloto(cedula);
							System.out.println("");
							
							System.out.println("Piloto 2");
							System.out.print("Cedula: ");
							cedula = validarCedula();
							pilotoB = metodosPiloto.getPiloto(cedula);
							System.out.println("");
							
							metodosAvion.nuevoAvion(azafataA, azafataB, azafataC, azafataD, pilotoA, pilotoB);
							break;
						case 2: // piloto
							System.out.print("Numero de carnet: ");
							numCarnet = dato.nextInt();
							System.out.println("");
							
							metodosPiloto.nuevoPiloto(numCarnet, cedula, nombre, apellido, direccion, telefono);
							
							break;
						case 3://azafata
							System.out.print("Numero de permiso: ");
							numPermiso = dato.nextInt();
							System.out.println("");

							metodosAzafata.nuevaAzafata(numPermiso, cedula, nombre, apellido, direccion, telefono);
							break;
						case 4: //pasajero
							System.out.print("¿Esta vacunado? ");
							vacunado = dato.next();
							System.out.print("Fecha de vuelo: ");
							horaVuelo = dato.next();
							System.out.println("");
							
							metodosPasajero.nuevaPasajero(cedula, nombre, apellido, direccion, telefono, vacunado, horaVuelo);
							break;
						case 5:
							op = 0;
							break;
					}
					break;
				case 2: // Compra, cambio o cancelacion de tickets
					System.out.println("1.- Comprar ticket\n"
						+ "2.- Cambiar ticket\n"
						+ "3.- Cancelar ticket\n"
						+ "4.- Regresar");
					op = dato.nextInt();
					System.out.println("");
					switch (op) {
						case 1: // comprar
							System.out.println("SELECCIONE UN AVION: ");
							metodosAvion.imprimirDisponibles();
							op = dato.nextInt();

							System.out.println("DATOS DEL PASAJERO: ");
							System.out.print("Cedula: ");
							cedula = validarCedula();
							System.out.print("Nombre: ");
							nombre = dato.next();
							System.out.print("Apellido: ");
							apellido = dato.next();
							System.out.print("Direccion: ");
							direccion = dato.next();
							System.out.print("Telefono: ");
							telefono = dato.next();
							System.out.print("¿Esta vacunado? ");
							vacunado = dato.next();
							System.out.print("Fecha de vuelo: ");
							horaVuelo = dato.next();
							System.out.println("");

							avionActual = metodosAvion.getAvion(op);
							avionActual.getTicket().comprarTicket(cedula, nombre, apellido, direccion, telefono, vacunado, horaVuelo);
							break;
						case 2: // cambiar
							System.out.println("Seleccione un avion: ");
							metodosAvion.imprimirDisponibles();
							op = dato.nextInt();
							
							System.out.print("Cedula: ");
							cedula = validarCedula();
							System.out.println("");
							
							avionActual = metodosAvion.getAvion(op);
							avionActual.getTicket().cambiarTicket(cedula);
							break;
						case 3: // cancelar
							System.out.println("Seleccione un avion: ");
							metodosAvion.imprimirDisponibles();
							op = dato.nextInt();
							
							System.out.print("Cedula: ");
							cedula = dato.next();
							System.out.println("");
							
							avionActual = metodosAvion.getAvion(op);
							avionActual.getTicket().cancelarTicket(cedula);
							break;
						case 4:
							//op = 0;
							break;
					}

					break;
				case 3: // ver atributos de objetos
					System.out.println("1.- Avion\n"
						+ "2.- Azafata\n"
						+ "3.- Piloto\n"
						+ "4.- Regrear");
					op = dato.nextInt();
					System.out.println("");
					
					switch(op){
						case 1: // avion
							System.out.println("SELECCIONE UN AVION");
							metodosAvion.imprimirDisponibles();
							op = dato.nextInt();
							
							avionActual = metodosAvion.getAvion(op);
							System.out.println(avionActual.getAtributos());
							break;
						case 2: // azafata
							System.out.println("SELECCIONE UNA AZAFATA");
							metodosAzafata.imprimirDisponibles();
							System.out.print("Cedula: ");
							cedula = validarCedula();
							System.out.println("");
							
							azafataActual = metodosAzafata.getAzafata(cedula);
							System.out.println(azafataActual.getAtributos());
							break;
						case 3: // piloto
							System.out.println("SELECCIONE UN PILOTO");
							metodosPiloto.imprimirDisponibles();
							System.out.print("Cedula: ");
							cedula = validarCedula();
							System.out.println("");
							
							pilotoActual = metodosPiloto.getPiloto(cedula);
							System.out.println(pilotoActual.getAtributos());
							break;
						case 4: // regresar
							break;
					}
					break;
				case 4: // Datos generales (estaditicas)
					metodosAvion.imprimirLista();
					
					break;
				case 5:
					break;
			}

		} while (op != 5);
	}
	
	public static String validarCedula(){
		String valor = "";
		Scanner leer = new Scanner(System.in);
		valor = leer.next();
		while(valor.trim().length() != 10){
			System.out.println("!La cedula debe contener 10 digitos!");
			System.out.print("Cedula: ");
			valor = leer.next();
		}
		return valor;
	}

}
