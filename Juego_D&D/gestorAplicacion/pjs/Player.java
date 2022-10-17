package gestorAplicacion.pjs;

import java.io.Serializable;

import gestorAplicacion.Loadout.Inventario;

//import gestorAplicacion.Loadout.Arma;

public class Player extends gestorAplicacion.pjs.NPC implements Serializable { //player debe ser hija de NPC
	//private int id;  //creo que el id es mejor si es un numero 
	//protected String email; // ¿Para qué email?
	public int xp;
	//public int movimientoBase; // No es necesario
	public int HP;
        static int min = 1;  
	static int max = 20;
	public String descripcion;
    public static Clase clase;
	public static  gestorAplicacion.Loadout.Armadura armadura;
	public static gestorAplicacion.Loadout.Arma arma;
	public int aHP,aAC, aFUE, aDES, aINT, aCON, aCAR, aSAB;
	public int wallet;
	public gestorAplicacion.Loadout.Inventario inventario;
	 
	public Player(String Default) { // Jugador por defecto
		this.nombre = "Freud Baggins";
		this.HP = 20;
		this.AC = 6;
		this.nivel = 1;
		this.xp = 0;
		Player.clase = gestorAplicacion.pjs.Clase.GUERRERO;
		this.edad = 50;
		this.FUE = 12;
		this.DES = 12;
		this.CON = 12;
		this.INT = 12;		
		this.SAB = 12;
		this.CAR = 12;
		this.inventario = new gestorAplicacion.Loadout.Inventario();
		this.wallet = 0; //agrego a la clase por defecto la billetera para la tienda, implementar en general
		Player.armadura = new gestorAplicacion.Loadout.Armadura("Escudo de cuero", "Escudo pequeño hecho de cuero", 3, 300);
		Inventario.listaArmaduras.add(Player.armadura);
		Player.arma = new gestorAplicacion.Loadout.Arma("Espada corta", "Pequeña espada corta forjada por herreros locales",4,1);
		Inventario.listaArmasGuerrero.add(Player.arma);
		this.descripcion = "Humano del Este adiestrado en el arte de la guerra.";

	}
        
        public Player (String nombre, int edad){
            super(nombre, edad, clase, 1);
            this.HP = 20 + clase.getConstitucion();			
            this.FUE += clase.getFuerza() + gestorAplicacion.mecanicas.Narrador.lanzarDados();
            this.DES += clase.getDestreza() + gestorAplicacion.mecanicas.Narrador.lanzarDados();
            this.CON += clase.getConstitucion() + gestorAplicacion.mecanicas.Narrador.lanzarDados();
            this.CAR += clase.getCarisma() + gestorAplicacion.mecanicas.Narrador.lanzarDados();
            this.INT += clase.getInteligencia() + gestorAplicacion.mecanicas.Narrador.lanzarDados();
            this.SAB += clase.getSabiduria() + gestorAplicacion.mecanicas.Narrador.lanzarDados();
            arquetipo();
            
        }

	public void arquetipo(){
		this.aHP = this.HP;
		this.aAC = this.AC;						
		this.aFUE = this.FUE;
		this.aDES = this.DES;
		this.aCON = this.CON;
		this.aINT = this.INT;		
		this.aSAB = this.SAB;
		this.aCAR = this.CAR;
	}
	

	public void SubirNivel() {
		this.nivel++;
	}
	public void cambiarArmadura() {
		
	}
	public void cambiarArma() {
		
	}

	

	public static Player player = new Player("");

	@Override
	public String getNombre() {		
		return this.nombre;
	}

	@Override
	public int getNivel() {
		return this.nivel;
	}

    public static Clase getClase() {
        return clase;
    }        
}
