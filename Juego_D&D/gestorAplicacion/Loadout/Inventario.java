package gestorAplicacion.Loadout;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Inventario implements Serializable{
	
	public static List<Arma>   listaArmasGuerrero   = new ArrayList<Arma>();
	public static List<Arma>   listaArmasArquero    = new ArrayList<Arma>();
	public static List<Arma>   listaArmasMago       = new ArrayList<Arma>();

	public static List<Armadura> listaArmaduras  = new ArrayList<Armadura>();
		
	public static List<Pocion>   listaPociones   = new ArrayList<Pocion>();

}