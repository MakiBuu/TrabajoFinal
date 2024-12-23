package trabajofinal;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maren
 */
public class ValidacionTest {
    
    @Test
    public void clienteValidoTest() {
        Cliente cliente = new Cliente(new Bien("vehiculo",25000),30000,1990);
        assertTrue(cliente.esValido());
    }
    @Test
    public void clienteInvalidoTest() {
        Cliente cliente = new Cliente(null,30000,1890);
        assertFalse(cliente.esValido());
    }
    
    @Test
    public void bienValidoTest(){
        Bien bien = new Bien("vivienda",150000);
        assertTrue(bien.esValido());
    }
    @Test
    public void bienInvalidoTest(){
        Bien bien = new Bien("vehiculo",-1012030);
        assertFalse(bien.esValido());
    }  
    @Test
    public void validarOfertaMafroMenosDe20YVehiculo(){
        Cliente cliente = new Cliente(new Bien("vehiculo", 30000),15000,2005);
        Mafro mafro = new Mafro();
        OfertaMásVentajosa oferta = mafro.getPrecio(cliente);
        assertEquals(1500,oferta.getImporte(),0.01);  
    }
    public void validarOfertaMafroVivienda(){
        Cliente cliente = new Cliente(new Bien("vivienda",250000),18000,1980);
        Mafro mafro = new Mafro();
        OfertaMásVentajosa oferta = mafro.getPrecio(cliente);
        assertEquals(5000,oferta.getImporte(),0.01);
    }
    @Test
    public void validarOfertaLineaIndirectaVehiculoBajoValor(){
        Cliente cliente = new Cliente(new Bien("vehiculo",15000),25000,1990);
        LineaIndirecta lineaIndirecta = new LineaIndirecta();
        OfertaMásVentajosa oferta = lineaIndirecta.getPrecio(cliente);
        assertEquals(600,oferta.getImporte(),0.01);
    }
    @Test
    public void validarOfertaLineaIndirectaVehiculoEdadMayor(){
        Cliente cliente = new Cliente(new Bien("vehiculo",25000),20000,1950);
        LineaIndirecta lineaIndirecta = new LineaIndirecta();
        OfertaMásVentajosa oferta = lineaIndirecta.getPrecio(cliente);
        assertEquals(1500,oferta.getImporte(),0.01);
    }
    @Test
    public void validarOfertaAsdalesVehiculoMenor20OMayor60(){
        Cliente cliente = new Cliente(new Bien("vehiculo",30000),20000,2005);
        Asdales asdales = new Asdales();
        OfertaMásVentajosa oferta = asdales.getPrecio(cliente);
        assertEquals(1800,oferta.getImporte(),0.01);
    }
    @Test
    public void validarOfertaAsdalesVehiculoEdadEntre20Y60(){
        Cliente cliente = new Cliente(new Bien("vehiculo",30000),20000,2000);
        Asdales asdales = new Asdales();
        OfertaMásVentajosa oferta = asdales.getPrecio(cliente);
        assertEquals(600,oferta.getImporte(),0.01);
    }
    
    
    
    
    
    
}
