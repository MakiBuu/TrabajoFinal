/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajofinal;

/**
 *
 * @author maren
 */
public class LineaIndirecta implements Aseguradora {
    private final String nombre = "Línea Indirecta";
    
    @Override
    public String getNombre(){
        return nombre;
    }
    
    @Override
    public OfertaMásVentajosa getPrecio(Bien bien){
        double prima = bien.getValor() * 0.025;
        double cobertura = bien.getValor() * 0.85;
        return new OfertaMásVentajosa(getNombre(),prima,cobertura);
    }
}
