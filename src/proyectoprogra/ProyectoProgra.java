/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoprogra;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author da_he
 */
public class ProyectoProgra {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Inicio inicio = new Inicio();
        //inicio.setVisible(true);
        //inicio.setLocationRelativeTo(null);
        Scanner scanner = new Scanner(System.in);
        Producto[] productos = productos();
        Producto[] listamama = ListaMama();
        CarritodeCompras basket = new CarritodeCompras();
        boolean again=true;
        do{
            System.out.println("Instrucciones");
            int opcion = scanner.nextInt();
            switch(opcion){
                case (1):
                    VerPasillos();
                case (2):
                    VerListaMama();
                case(3):
                    VerCarrito();
                case(4): 
                    
            }
        }while(again);
    }
    
    public static Producto[] ListaMama(){
        
    }
    
    public static Producto[] productos(){
        
    }
    
}
