package trabajofinal;
import java.time.LocalDate;

/**
 *
 * @author maren
 */
public class Cliente {
    private Bien bien;
    private double salario;
    public int annoNacimiento;
    public Cliente(Bien bien,double salario, int annoNacimiento){
        this.bien = bien;
        this.salario = salario;
        this.annoNacimiento = annoNacimiento;
    }
    public Bien getBien(){
        return bien;
    }
    public int calcularEdad(){
        return LocalDate.now().getYear() - annoNacimiento;
    }
    public double getSalario(){
        return salario;
   }
    public boolean esValido(){
        return annoNacimiento > 1900 && annoNacimiento <= LocalDate.now().getYear();
    }
}
