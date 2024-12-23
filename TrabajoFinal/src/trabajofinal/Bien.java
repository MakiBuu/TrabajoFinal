package trabajofinal;
/**
 *
 * @author maren
 */
public class Bien {
    private String tipo;
    private Double valor;
    public Bien(String tipo, Double valor){
        this.tipo = tipo;
        this.valor = valor;
    }
    public String getTipo(){
        return tipo;
    } 
    public double getValor(){
        return valor;
    }
    public boolean esValido(){
        return tipo != null && !tipo.isEmpty() && valor > 0;
    }
}
