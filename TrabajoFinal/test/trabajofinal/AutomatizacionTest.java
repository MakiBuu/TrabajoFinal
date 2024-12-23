package trabajofinal;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author maren
 */
public class AutomatizacionTest {
    @Test
    public void pruebaSolicitarYOferta() {
        Cliente cliente = new Cliente(null,15000,2005);
        Bien bien = new Bien("vehiculo",30000);
        VistaFalsa vista = new VistaFalsa(cliente,bien);
        Presentador presentador = new Presentador(vista);
        presentador.ejecutarPrograma();
        assertEquals("LINEA INDIRECTA|900|9",vista.getOfertaMostrada().toString());
    }
    
}
