package trabajofinal;
import java.util.List;
/**
 *
 * @author maren
 */
public class Correduria {
    private List<Aseguradora> aseguradoras;
    
    public Correduria(List<Aseguradora> aseguradoras){
        this.aseguradoras = aseguradoras;
    }
    
    public OfertaMásVentajosa calcularOfertaMasVentajosa(Cliente cliente){
        OfertaMásVentajosa mejorOferta = null;
        for(Aseguradora aseguradora: aseguradoras){
            OfertaMásVentajosa oferta = aseguradora.getPrecio(cliente);
            if(mejorOferta == null || oferta.getPrima() < mejorOferta.getPrima()){
                mejorOferta = oferta;
            }
        }
    }
}
