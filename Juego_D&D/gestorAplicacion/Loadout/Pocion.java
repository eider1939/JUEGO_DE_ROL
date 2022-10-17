package gestorAplicacion.Loadout;

public class Pocion {
	public String nombre;
	public String descripcion; 
	public int curacion;
	public int precio;
	
	public Pocion(String nombre, String descripcion, int curacion, int precio) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.curacion = curacion;
		this.precio = precio;
	}

	public int getCuracion() {
		return curacion;
	}

}


