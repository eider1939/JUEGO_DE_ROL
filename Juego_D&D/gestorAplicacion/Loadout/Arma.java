package gestorAplicacion.Loadout;

import java.io.Serializable;

public class Arma{
	public String nombre;
	public	String descripcion;
	public static int dano;
	public int precio;

	public Arma(String nombre, String descripcion, int dano, int precio) { // Agregué nombre del arma
		this.nombre = nombre;
		this.descripcion = descripcion;
		Arma.dano = dano;
		this.precio = precio;
	}

	public static int getDano() {  //Class Player{
		return dano;					//	int fuerza;
	}									//	Arma arma1 = new Arma();
										//	fuerza += arma1.getda�o
}

