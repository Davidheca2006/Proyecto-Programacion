/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoprogra;
import java.util.Scanner;
import java.util.ArrayList;
import static proyectoprogra.Supermercado.products;

/**
 *
 * @author da_he
 */
public class ProyectoProgra {

    /**
     * @param args the command line arguments
     */
    
    public static Jugador jugador;
    public static void main(String[] args) {
        // TODO code application logic here
        //carrito del usuario
        ArrayList<Producto> basket = new ArrayList<Producto>();
        Index inicio = new Index(basket);
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
        //llamo a los metodos para generar la lista de mama
        Supermercado.productosSuper();
        Supermercado.ListaMama();
        
        Scanner scanner = new Scanner(System.in);
        //importo el nombre del usuario
        String nombre = inicio.getUserName();
            boolean again=true;
            do{
                System.out.println("Instrucciones");
                int opcion = scanner.nextInt();
                switch(opcion){
                    case (1):
                         Supermercado.verProductos();//nos da una lista de lo que hay en el super
                        break;
                    case (2):
                        Supermercado.verListaMama();//le da al usuario una lista con las cosas que debe comprar
                        break;
                    case(3):
                        Super lista = new Super(jugador);
                         int objeto = lista.AgregarBasket();
                         if (objeto!=-1){
                             Producto obj = products[objeto];
                             inicio.addBasket(obj);
                         }

                        break;
                    case(4): 
                         //se llevan las cosas a pagar y se ve si se lleva todo
                        break;
                    default:
                        break;
                }
            }while(again);
    
        
    }
}
