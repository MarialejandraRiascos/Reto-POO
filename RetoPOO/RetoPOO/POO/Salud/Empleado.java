package Salud;

public class Empleado extends Persona
{
    public String cargo;
    public double valorhora;
    public int horastrabajadas;
    public String departamento;
    public double total;

    public Empleado( String tipoDoc,int documento,String nombre, String apellido,double peso,double estatura,int edad,String sexo,String cargo,double valorhora,int horastrabajadas,String departamento,double total)
    {
            super(tipoDoc, documento, nombre,  apellido, peso, estatura, edad, sexo);

            this.cargo = cargo;
            this.valorhora = valorhora;
            this.horastrabajadas = horastrabajadas;
            this.departamento = departamento;
            this.total = total;
    }
        
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getValorhora() {
        return valorhora;
    }

    public void setValorhora(double valorhora) {
        this.valorhora = valorhora;
    }

    public int getHorastrabajadas() {
        return horastrabajadas;
    }

    public void setHorastrabajadas(int horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void calcularHonorarios()
    {

        total = ((valorhora*horastrabajadas) - 0.966)/100;
        System.out.println(total);

        System.out.println("Sus datos: ");
        
        System.out.println("Tipo documento: " + getTipoDoc());
        System.out.println("Documento: " + getDocumento());
        System.out.println("Nombre: " + getNombre()); 
        System.out.println("Apellido: " + getApellido());
        System.out.println("Cargo: " + getCargo());   
        System.out.println("Horas trabajadas: " + getHorastrabajadas()); 
        System.out.println("Valor hora: " + getValorhora() + total);
    }

}
