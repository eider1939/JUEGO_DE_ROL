package baseDatos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import gestorAplicacion.Loadout.Inventario;
import gestorAplicacion.pjs.Player;

public class persistencia {
    static String fichero = System.getProperty("user.dir");

    public static void escribirFichero(){
        try{
            
            ObjectOutputStream jugador = new ObjectOutputStream(new FileOutputStream(fichero+"\\baseDatos\\temp\\pj.dat"));
            System.out.println(gestorAplicacion.pjs.Player.clase.name());
            //gestorAplicacion.pjs.Player.getClase().setNombre(gestorAplicacion.pjs.Player.clase.name());            
            jugador.writeObject(gestorAplicacion.pjs.Player.player);
            jugador.close();            
            
            ObjectOutputStream escenaActualSaved = new ObjectOutputStream(new FileOutputStream(fichero+"\\baseDatos\\temp\\scene.dat"));
            escenaActualSaved.writeObject(gestorAplicacion.mecanicas.Narrador.escenaActual);
            escenaActualSaved.close();

            ObjectOutputStream claseSaved = new ObjectOutputStream(new FileOutputStream(fichero+"\\baseDatos\\temp\\class.dat"));
            claseSaved.writeObject(gestorAplicacion.pjs.Player.getClase());
            claseSaved.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void leerFichero(){
        try{
            ObjectInputStream dataPj = new ObjectInputStream(new FileInputStream(fichero+"\\baseDatos\\temp\\pj.dat"));
            
            
            gestorAplicacion.pjs.Player playerData = (gestorAplicacion.pjs.Player) dataPj.readObject();            
            gestorAplicacion.pjs.Player.player = playerData;
            

            ObjectInputStream dataEsc = new ObjectInputStream(new FileInputStream(fichero+"\\baseDatos\\temp\\scene.dat"));
            int escenaActualSavedData = (int) dataEsc.readObject();

            ObjectInputStream dataClase = new ObjectInputStream(new FileInputStream(fichero+"\\baseDatos\\temp\\class.dat"));
            gestorAplicacion.pjs.Clase playerClass = (gestorAplicacion.pjs.Clase) dataClase.readObject();

            Player.clase = playerClass;
            //

            gestorAplicacion.mecanicas.Narrador.escenaActual = escenaActualSavedData;
            
            dataPj.close();
            
            dataEsc.close();

        }catch(Exception e){
            System.out.println("No hay una partida guardada - se iniciará una partida nueva, elige un opción: \n");
            //e.printStackTrace();
        }
    }
}

