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
    
    public String mover(String direccion, int cantidad)
    {
        String resultado="";
        if(direccion.equalsIgnoreCase("S"))
        {
           
           resultado= this.moverFila(cantidad);
        }else if(direccion.equalsIgnoreCase("N"))
        {cantidad = cantidad * (-1);
           resultado= this.moverFila(cantidad);
        }else if(direccion.equalsIgnoreCase("E"))
        {
           resultado= this.moverColumna(cantidad);
        }else if(direccion.equalsIgnoreCase("O"))
        {
           cantidad = cantidad * (-1);
          resultado= this.moverColumna(cantidad);
        }
        
        return resultado;
    }  
    
    
    public String moverColumna(int cantidad)
    {
       return this.tab.mueveColumna(cantidad);
         
    }
    
    public String moverFila(int cantidad)
    {
       return this.tab.mueveFila(cantidad);
         
    }
    
    public void inicializaTablero(int filas, int columnas)
    {
        this.tab = new Tablero(filas, columnas);
        this.tab.setPosisionFila(filas - 1);
        System.out.println("La posicion es " + ((tab.getPosisionFila()-filas)+1) +","+ tab.getPosisionColumna());
    }
    
}
