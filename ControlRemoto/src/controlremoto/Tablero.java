/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlremoto;

/**
 *
 * @author jam
 */
public class Tablero {
  private int [][] tablero;
  private int posisionColumna=0,posisionFila=0 ;

    public int getPosisionColumna() {
        return posisionColumna;
    }

    public void setPosisionColumna(int posisionColumna) {
        tablero[posisionFila][this.posisionColumna] =0;
        this.posisionColumna = posisionColumna;
        tablero[posisionFila][this.posisionColumna] =1;
    }

    public int getPosisionFila() {
       
        return posisionFila;
    }

    public void setPosisionFila(int posisionFila) {
        tablero[posisionFila][posisionColumna] =0;
        this.posisionFila = posisionFila;
        tablero[posisionFila][posisionColumna] =1;
    }
    
    
  
  public  Tablero(int filas, int columnas){
    tablero = new int[filas][columnas];
    System.out.println("filas "+tablero.length);
    System.out.println("columnas "+tablero[0].length);
    }
  
  public String mueveColumna(int movimiento)
  {
      if(((getPosisionColumna()+movimiento)>=0) || (getPosisionColumna()+movimiento)<=tablero.length )
      {
          setPosisionColumna(getPosisionColumna()+movimiento);
        return "ahora se encuentra en la posision";  
      }else
  {
      return "Se ha detenido el avance por salir de los límites";
  }
      
  }
  
  public String mueveFila(int movimiento)
  {
     if(((getPosisionFila()+movimiento)>=0) || (getPosisionFila()+movimiento)<=tablero[0].length )
      {
          setPosisionFila(getPosisionFila()+movimiento);
        return "ahora se encuentra en la posision";  
      }else
  {
      return "Se ha detenido el avance por salir de los límites";
  }
  }
  
  
}
