package trabajofinal;
/**
 *
 * @author maren
 */
public class OfertaMásVentajosa {
    public  String aseguradora;
    public double importe;
    public double comision;
    
    public OfertaMásVentajosa(String aseguradora, double importe, double comision) {
        this.aseguradora = aseguradora;
        this.importe = importe;
        this.comision = Math.floor(comision);
    } 
    public String getAseguradora(){
        return aseguradora;
    }
    public double getImporte(){
        return importe;
    }
    public double getComision(){
        return comision;
    }
    
    @Override
    public String toString(){
        return aseguradora + "|" + (int) importe + "|" + (int) comision;
    }
    
}

