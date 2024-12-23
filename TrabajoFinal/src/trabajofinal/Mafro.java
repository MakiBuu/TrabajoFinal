package trabajofinal;
/**
 *
 * @author maren
 */
public class Mafro implements Aseguradora {
    private final String nombre = "MAFRO";
    
    @Override
    public String getNombre(){
        return nombre;
    }
    
    @Override
    public OfertaMásVentajosa getPrecio(Cliente cliente){
       Bien bien = cliente.getBien();
       int edad = cliente.calcularEdad();
       double importe = bien.getValor() * 0.03;
       double comision;
       
       if("vehiculo".equalsIgnoreCase(bien.getTipo()) && edad < 20){
           importe = bien.getValor() * 0.05;
       }
       else if("vivienda".equalsIgnoreCase(bien.getTipo()) && bien.getValor() > 200000 && cliente.getSalario() < 20000){
           importe = bien.getValor() * 0.02;
       }
       if(importe < 1000){
               comision = importe * 0.01;
       }
       else{
           comision = importe * 0.03;
       }
       return new OfertaMásVentajosa(getNombre(),importe,comision);
   }
}
