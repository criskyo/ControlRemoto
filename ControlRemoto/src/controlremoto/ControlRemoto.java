/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlremoto;

import java.util.Scanner;

/**
 *
 * @author jam
 */
public class ControlRemoto {
    
    Movimientos mov = new Movimientos();

    public  void Inicializar() {
        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.print("Cuantas fila tiene la matriz:");
        int filas = teclado.nextInt();
        System.out.print("Cuantas columnas tiene la matriz:");
        int columnas = teclado.nextInt();
        mov.InicializaTablero(filas, columnas);
        

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String entrada = "";
        Scanner teclado;
        teclado = new Scanner(System.in);
        String[] serie ;
        String[] comando;
        ControlRemoto con = new ControlRemoto();
        Movimientos mov = new Movimientos();
        con.Inicializar();
        do {
            System.out.print("dijite los comandos de movimiento deje en blanco para salir");
            entrada = teclado.next();
            if (!entrada.equals("")) {
                 serie = entrada.split(";");
                for (int i = 0; i < serie.length; i++) {
                     comando = serie[i].split(",");
                    if (comando.length == 2) {
                        if (comando[0].matches("[0-9]*")) {
                            if (comando[1].equalsIgnoreCase("N") || comando[1].equalsIgnoreCase("S") || comando[1].equalsIgnoreCase("E") || comando[1].equalsIgnoreCase("O")) {
                            mov.Mover(comando[1], Integer.parseInt(comando[0]));
                            } else {
                                System.out.println("Error en formato de comando");
                            }
                        } else {
                            System.out.println("Error en formato de comando");
                        }

                    } else {
                        System.out.println("Error en formato de comando");
                    }
                }
            }
        } while (!entrada.equals(""));
    }
}
