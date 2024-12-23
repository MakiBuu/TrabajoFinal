package trabajofinal;
/**
 *
 * @author maren
 */
public interface Aseguradora {
    String getNombre();
    OfertaMásVentajosa getPrecio(Bien bien);
}
