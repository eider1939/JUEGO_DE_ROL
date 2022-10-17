package gestorAplicacion.Loadout;

public class Armadura {
	public	 String nombre;
	public	 String descripcion;
	private	 static int defensa; // Lo hice static
	public int	 precio;

public Armadura(String nombre, String descripcion, int defensa, int precio) {
	this.nombre      = nombre;
	this.descripcion = descripcion;
	Armadura.defensa     = defensa;
	this.precio      = precio;
}

public static int getDefensa() { // Lo hice static
	return defensa;
}

public int CambiarDefensa(int dano) {   //Implementacion en la clase Player | e.g:   Class Player {
	Armadura.defensa -= dano;               //                                   			int defensa;  
	return Armadura.defensa;              	//                                      		Armadura  "nivel1" = new Armadura(); 
	}                                   //                                     			defensa = "nivel1".getDefensa();
                                        //                                      		defensa = "nivel1".CambiarDefensa("da�o"); } 
}										//Ideally this would be called in the method "combate"