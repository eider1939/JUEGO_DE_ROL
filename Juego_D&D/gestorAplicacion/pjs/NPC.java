package gestorAplicacion.pjs;

import java.io.Serializable;

public abstract class NPC implements Serializable{
    public String nombre;
    protected int edad;
    public int nivel; // Hice public nivel
    protected Clase clase;  
    public int HP; // Agregué HP (Hit Points = Puntos de vida)
    public int AC; // Agregué AC (Armor class = clase de armadura)
    public int dano;
    public int FUE, DES, INT, CON, CAR, SAB;     // Cambié de private a public para poderlos usar en Player y Narrador "JM". Cambié VEL por CAR.
    
                                                    //CON = constitucion, define la cantidad de vida del personaje 
                                                    
                                                    //SAB = Sabiduria, define la 
    
    //private Raza raza;                   Quitar comentario cuando se agregue clase Raza
    //private Inventario inventario        Quitar comentario cuandos e agregue clase Inventario
    
    public NPC() { // Agrego contructor sin argumentos para poder crear constructor en Player   - Sobrecarga de método necesariaa
	}
    
    public NPC(String nombre, int edad, Clase clase, int nivel) {
        this.nombre = nombre;
        this.edad = edad;
        this.clase = clase;
        this.nivel= nivel;                                                          //Se crea un NPC de nivel especificado
                             
        switch(clase){
            case GUERRERO:
                this.FUE= Clase.GUERRERO.getFuerza() + 3 *nivel;                 // clase Guerrero tendrá un aumento mayor para el atributo FUE 
                this.CON = Clase.GUERRERO.getConstitucion() + 2*nivel;           //clase Guerrero tendrá un aumento secundario para el atributo consitutcion;
                this.DES = Clase.GUERRERO.getDestreza() + 1*nivel;               //para todas las demas caracteristicas tendrá un aumento minimo
                this.INT = Clase.GUERRERO.getInteligencia() + 1*nivel;
                this.CAR = Clase.GUERRERO.getCarisma()+1*nivel;
                this.SAB= Clase.GUERRERO.getSabiduria() +1*nivel;
                clase.aplicarVentajas(clase);
            
            case ARQUERO:
                this.FUE= Clase.ARQUERO.getFuerza() + 1 *nivel;                 // clase Arquero tendrá un aumento mayor para el atributo DES 
                this.CON = Clase.ARQUERO.getConstitucion() + 1*nivel;           //clase Arquero tendrá un aumento secundario para el atributo VEL;
                this.DES = Clase.ARQUERO.getDestreza() + 3*nivel;               //para todas las demas caracteristicas tendrá un aumento minimo
                this.INT = Clase.ARQUERO.getInteligencia() + 1*nivel;
                this.CAR= Clase.ARQUERO.getCarisma()+2*nivel;
                this.SAB= Clase.ARQUERO.getSabiduria() +1*nivel;
                clase.aplicarVentajas(clase);
            
                
            case MAGO:
                this.FUE= Clase.MAGO.getFuerza() + 1 *nivel;                 // clase Mago tendrá un aumento mayor para el atributo INT 
                this.CON = Clase.MAGO.getConstitucion() + 1*nivel;           //clase Mago tendrá un aumento secundario para el atributo SAB
                this.DES = Clase.MAGO.getDestreza() + 1*nivel;               //para todas las demas caracteristicas tendrá un aumento minimo
                this.INT = Clase.MAGO.getInteligencia() + 3*nivel;
                this.CAR= Clase.MAGO.getCarisma()+1*nivel;
                this.SAB= Clase.MAGO.getSabiduria() + 2*nivel;
                clase.aplicarVentajas(clase);
                
        }
        
                
    }

    public abstract String getNombre();
    public abstract int getNivel();
    
   /* public void atacar(Arma arma){
        int danio = arma.danio + (arma.danio* clase.)
    }*/
    
}
