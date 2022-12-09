package Principal;
import java.util.Scanner;

import Salud.Empleado;

public class Inicio 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        Empleado empleado = new Empleado(null, 0, null, null, 0, 0, 0, null, null, 0, 0, null, 0);

        Double totalImc;

        empleado.pedirDatos();
        empleado.mostrarPersona();
        totalImc = empleado.calcularImc();

        if (totalImc<20) 
        {
            System.out.println(totalImc+"PESO BAJO.");
        }

        else if (totalImc>=20 && totalImc<=25) 
        {
            System.out.println(totalImc+" PESO IDEAL.");
        }

        else if ( totalImc>25) 
        {
            System.out.println(totalImc+"SOBRE PESO."); 
        }

        empleado.mayorEdad();

        System.out.println("Ingrese la información de su cargo:");

        System.out.println("Ingrese el cargo:");
        empleado.setCargo(scanner.next());
        System.out.println("Ingrese el valor de la hora:");
        empleado.setValorhora(scanner.nextDouble());
        System.out.println("Ingrese las horas trabajadas:");
        empleado.setHorastrabajadas(scanner.nextInt());
        System.out.println("Ingrese el departamento:");
        empleado.setDepartamento(scanner.next());

        empleado.calcularHonorarios();

        scanner.close();
    }
}
