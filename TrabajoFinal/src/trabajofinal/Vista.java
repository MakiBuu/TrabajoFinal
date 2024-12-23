package trabajofinal;

/**
 *
 * @author maren
 */
public interface Vista {
    void mostrarMensaje(String mensaje);
    void mostrarMejorOferta(OfertaMásVentajosa oferta);
    Cliente solicitarDatosCliente();
    Bien solicitarDatosBien();
    
}
