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
    private final String nombre = "LINEA INDIRECTA";   
    @Override
    public String getNombre(){
        return nombre;
    }  
    @Override
    public OfertaMásVentajosa getPrecio(Cliente cliente){
        Bien bien = cliente.getBien();
        int edad = cliente.calcularEdad();
        double importe = bien.getValor() * 0.03;
        double comision;
        if(("vehiculo".equalsIgnoreCase(bien.getTipo()) && bien.getValor() < 20000) || ("vivienda".equalsIgnoreCase(bien.getTipo()) && bien.getValor() < 150000)) {
            importe = bien.getValor() * 0.04;
        }else if ("vehiculo".equalsIgnoreCase(bien.getTipo()) && bien.getValor() >= 20000 && edad > 60){
            importe = bien.getValor() * 0.06;
        }
        if(importe < 1000){
               comision = importe * 0.01;
        }
       else{
           comision = importe * 0.04;
        }
        return new OfertaMásVentajosa(getNombre(),importe,comision);
    }
}
