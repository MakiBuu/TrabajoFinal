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
    public OfertaMásVentajosa getPrecio(Bien bien){
       double prima = bien.getValor() * 0.03; // Es el 3% del bien
       double cobertura = bien.getValor() * 0.09;
       return new OfertaMásVentajosa(getNombre(),prima,cobertura);
   }
}
