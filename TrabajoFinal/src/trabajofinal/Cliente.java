package trabajofinal;
import java.time.LocalDate;

/**
 *
 * @author maren
 */
public class Cliente {
    public double salario;
    public int annoNacimiento;
    public Cliente(double salario, int annoNacimiento){
        this.salario = salario;
        this.annoNacimiento = annoNacimiento;
    }
    public int calcularEdad(){
        return LocalDate.now().getYear() - annoNacimiento;
    }
}
