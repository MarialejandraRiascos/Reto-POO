package Salud;
import java.util.Scanner;

public class Persona 
{
    Scanner scanner = new Scanner(System.in);

    public String tipoDoc;
    public int documento;
    public String nombre;
    public String apellido;
    public double peso;
    public double estatura;
    public int edad;
    public String sexo;

    public Persona()
    {
 
    }

    public Persona(String tipoDoc, int documento, String nombre, String apellido, double peso, double estatura,int edad, String sexo) 
    {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
        this.sexo = sexo;
    }

   
public String getTipoDoc() {
    return tipoDoc;
}

public void setTipoDoc(String tipoDoc) {
    this.tipoDoc = tipoDoc;
}

public int getDocumento() {
    return documento;
}

public void setDocumento(int documento) {
    this.documento = documento;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getApellido() {
    return apellido;
}

public void setApellido(String apellido) {
    this.apellido = apellido;
}

public double getPeso() {
    return peso;
}

public void setPeso(double peso) {
    this.peso = peso;
}

public double getEstatura() {
    return estatura;
}

public void setEstatura(double estatura) {
    this.estatura = estatura;
}

public int getEdad() {
    return edad;
}

public void setEdad(int edad) {
    this.edad = edad;
}

public String getSexo() {
    return sexo;
}

public void setSexo(String sexo) {
    this.sexo = sexo;
}

public void pedirDatos()
   {
    System.out.println("Ingrese sus datos ");

    System.out.println("Ingrese su tipo documento: ");
    tipoDoc =scanner.next();
    System.out.println("Ingrese su documento: ");
    documento =scanner.nextInt();
    System.out.println("Ingrese su nombre: ");
    nombre =scanner.next();
    System.out.println("Ingrese su apellido: ");
    apellido =scanner.next();
    System.out.println("Ingrese su peso: ");
    peso =scanner.nextDouble();
    System.out.println("Ingrese su estatura: ");
    estatura =scanner.nextDouble();
    System.out.println("Ingrese su edad: ");
    edad =scanner.nextInt();
    System.out.println("Ingrese su sexo: ");
    sexo =scanner.next();
   }

   public void mostrarPersona()
   {
    System.out.println("Sus datos: ");
    
    System.out.println("Tipo documento: " + tipoDoc);
    System.out.println("Documento: " + documento);
    System.out.println("Nombre: " + nombre);
    System.out.println("Apellido: " + apellido);
    System.out.println("Peso: " + peso);
    System.out.println("Estatura : " + estatura);
    System.out.println("Edad: " + edad);
    System.out.println("Sexo: " + sexo);
   }

   public void calcularImc()
   {
    double pesoActual =peso / Math.pow(estatura,2);

    if (pesoActual<20) 
    {
        System.out.println(pesoActual+"PESO BAJO.");
    }

   else if (pesoActual>=20 && pesoActual<=25) 
    {
        System.out.println(pesoActual+" PESO IDEAL.");
    }

    else if ( pesoActual>25) 
    {
        System.out.println(pesoActual+"SOBRE PESO.");
    }
   }

    public void mayorEdad()
    {
        if (edad<18)
        {
            System.out.println("Menor de edad.");
        }

        else if (edad>=18)
        {
            System.out.println("Mayor de edad.");
        }
    } 
}
