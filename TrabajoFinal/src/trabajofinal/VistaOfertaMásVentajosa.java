package trabajofinal;
import java.util.Scanner;

/**
 *
 * @author maren
 */
public class VistaOfertaMásVentajosa implements Vista {
    private Scanner scanner = new Scanner(System.in);
    
    @Override
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    @Override 
    public void mostrarMejorOferta(OfertaMásVentajosa oferta){
        System.out.println("Mejor oferta: " + oferta);
    }
    
    @Override
    public Cliente solicitarDatosCliente(){
        System.out.print("Introduce el año de nacimiento del cliente: ");
        int annoNacimiento = scanner.nextInt();
        System.out.print("Introduce el salario anual del cliente: ");
        double salario = scanner.nextInt();
        scanner.nextLine();
        return new Cliente(null,salario,annoNacimiento);
    }
    @Override
    public Bien solicitarDatosBien(){
        System.out.print("Introduce el tipo de bien (vehiculo/vivienda) : ");
        String tipo = scanner.nextLine();
        System.out.print("Introduce el valor del bien: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();
        return new Bien(tipo,valor);
    }
    
}
