package trabajofinal;
/**
 *
 * @author maren
 */
public class Asdales implements Aseguradora {
    private final String nombre = "Asdales";
    
    @Override
    public String getNombre(){
        return nombre;
    }
    
    @Override
    public OfertaMásVentajosa getPrecio(Cliente cliente){
        Bien bien = cliente.getBien();
        double prima = bien.getValor() * 0.02;
        double cobertura = bien.getValor() * 0.8;
        return new OfertaMásVentajosa(getNombre(),prima,cobertura);
    }
}
