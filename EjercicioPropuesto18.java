//Ejercicio Propuesto N°18 - Cálculo de salario de empleado
import java.util.Scanner;
public class EjercicioPropuesto18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int codigo_empleado;
        String nombre;
        double horas_trabajadas, valor_hora, porcentaje_retencion;
        System.out.println("Ingrese el codigo del empleado: ");
        codigo_empleado=entrada.nextInt();
        System.out.println("Ingrese el nombre del empleado: ");
        nombre=entrada.nextLine();
        System.out.println("Ingrese las horas trabajadas por el empleado en el mes: ");
        horas_trabajadas=entrada.nextDouble();
        System.out.println("Ingrese el valor de la hora de trabajo: ");
        valor_hora=entrada.nextDouble();
        System.out.println("Ingrese el porcentaje de retencion en la fuente: (0/100)");
        porcentaje_retencion=entrada.nextDouble();
        double salario_bruto=horas_trabajadas*valor_hora;
        double retencion=salario_bruto*(porcentaje_retencion/100);
        double salario_neto=salario_bruto-retencion;


    }
}
