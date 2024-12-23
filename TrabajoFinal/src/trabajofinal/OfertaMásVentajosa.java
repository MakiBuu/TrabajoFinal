package trabajofinal;
/**
 *
 * @author maren
 */
public class OfertaMásVentajosa {
    public  String aseguradora;
    public double prima;
    public double cobertura;
    
    public OfertaMásVentajosa(String aseguradora, double prima, double cobertura) {
        this.aseguradora = aseguradora;
        this.prima = prima;
        this.cobertura = cobertura;
    } 
    public String getAseguradora(){
        return aseguradora;
    }
    public double getPrima(){
        return prima;
    }
    public double getCobertura(){
        return cobertura;
    }
}

