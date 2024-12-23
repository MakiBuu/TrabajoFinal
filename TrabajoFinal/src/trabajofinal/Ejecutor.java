package trabajofinal;

/**
 *
 * @author maren
 */
public class Ejecutor {
    public static void main(String[] args){
        Vista vista = new VistaOfertaMásVentajosa();
        Presentador presentador = new Presentador(vista);
        presentador.ejecutarPrograma();
    }
}
