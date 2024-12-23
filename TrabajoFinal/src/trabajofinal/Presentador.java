package trabajofinal;
import java.util.Arrays;
/**
 *
 * @author maren
 */
public class Presentador {
    private Vista vista;
    
    public Presentador(Vista vista){
        this.vista = vista;
    }
    public void ejecutarPrograma(){
        Cliente cliente = null;
        do{
            cliente = vista.solicitarDatosCliente();
            if(!cliente.esValido()){
                vista.mostrarMensaje("Datos del cliente no validos. Por favor, registrelos nuevamente");
            }      
        }while(!cliente.esValido());       
        Bien bien = null;
        do{
            bien = vista.solicitarDatosBien();
            if(!bien.esValido()){
                vista.mostrarMensaje("Datos del bien no validos, Por favor, registrelos nuevamente");
            }
        }while(!bien.esValido());
        
        cliente = new Cliente(bien,cliente.getSalario(),cliente.annoNacimiento);
        Correduria correduria = new Correduria(Arrays.asList(new Mafro(),new LineaIndirecta(),new Asdales()));
        OfertaMásVentajosa mejorOferta = correduria.calcularOfertaMasVentajosa(cliente);
       vista.mostrarMejorOferta(mejorOferta); 
    }
    
}
