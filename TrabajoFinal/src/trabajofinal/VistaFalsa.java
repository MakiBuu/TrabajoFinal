package trabajofinal;
/**
 *
 * @author maren
 */
public class VistaFalsa implements Vista {
    private Cliente cliente;
    private Bien bien;
    private OfertaMásVentajosa ofertaMostrada;
    
    public VistaFalsa(Cliente cliente, Bien bien){
        this.cliente = cliente;
        this.bien = bien;
    }
    
    @Override
    public void mostrarMensaje(String mensaje){
        System.out.println("Mensaje: " + mensaje);
    }
    
    @Override
    public void mostrarMejorOferta(OfertaMásVentajosa oferta){
        this.ofertaMostrada = oferta;
        System.out.println(oferta);
    }
    @Override
    public Cliente solicitarDatosCliente(){
        return cliente;
    }
    @Override
    public Bien solicitarDatosBien(){
        return bien;
    }
    public OfertaMásVentajosa getOfertaMostrada(){
        return ofertaMostrada;
    }
}

