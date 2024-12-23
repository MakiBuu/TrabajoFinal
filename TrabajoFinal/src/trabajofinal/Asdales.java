package trabajofinal;
/**
 *
 * @author maren
 */
public class Asdales implements Aseguradora {
    private final String nombre = "ASDALES";
    
    @Override
    public String getNombre(){
        return nombre;
    }
    
    @Override
    public OfertaMásVentajosa getPrecio(Cliente cliente){
        Bien bien = cliente.getBien();
        int edad = cliente.calcularEdad();
        double importe = bien.getValor() * 0.02;
        double comision;
        if ("vehiculo".equalsIgnoreCase(bien.getTipo()) && (edad < 20 || edad > 60)) {
            importe = bien.getValor() * 0.06;
        }
        if(importe < 1000){
               comision = importe * 0.01;
        }
        else{
           comision = importe * 0.05;
        }
     return new OfertaMásVentajosa(getNombre(),importe,comision);
    }
}
