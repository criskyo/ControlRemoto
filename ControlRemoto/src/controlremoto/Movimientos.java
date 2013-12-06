/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlremoto;

/**
 *
 * @author ASUS
 */
public class Movimientos {
    
 Tablero tab;   
    
    public void Mover(String direccion, int cantidad)
    {
        if(direccion.equalsIgnoreCase("S"))
        {
           cantidad = cantidad * (-1);
            this.moverColumna(cantidad);
        }else if(direccion.equalsIgnoreCase("N"))
        {
            this.moverColumna(cantidad);
        }else if(direccion.equalsIgnoreCase("E"))
        {
            this.moverFila(cantidad);
        }else if(direccion.equalsIgnoreCase("O"))
        {
           cantidad = cantidad * (-1);
           this.moverFila(cantidad);
        }
    }  
    
    
    public String moverColumna(int cantidad)
    {
        tab.mueveColumna(cantidad);
        return "false";
    }
    
    public String moverFila(int cantidad)
    {
        tab.mueveFila(cantidad);
        return "false";
    }
    
    public void InicializaTablero(int filas, int columnas)
    {
        tab = new Tablero(filas, columnas);
        tab.setPosisionColumna(columnas - 1);
        System.out.println("La posicion es " + tab.getPosisionFila() + tab.getPosisionColumna());
    }
    
}
