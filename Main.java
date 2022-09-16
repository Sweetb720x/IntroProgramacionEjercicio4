public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.edad = 25;
        cliente.nombre = "Juan Salvador Gaviota";
        cliente.telefono = "849-679-5353";
        cliente.setCredito("Buen cliente");
        System.out.println("Cliente\nEdad: "+cliente.edad+"\nNombre: "+cliente.nombre+"\nTelefono: "+cliente.telefono+"\nCredito: "+cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 30;
        trabajador.nombre = "Jarol Saul Espaillat Cruz";
        trabajador.telefono = "809-750-5552";
        trabajador.setSalario(35000);
        System.out.println("\nTrabajador\nEdad: "+trabajador.edad+"\nNombre: "+trabajador.nombre+"\nTelefono: "+trabajador.telefono+"\nSalario: $"+trabajador.getSalario());
    }
}

class Persona{
    int edad;
    String nombre;
    String telefono;
}

class Cliente extends Persona{
    private String credito;

    public String getCredito(){
        return this.credito;
    }
    public void setCredito(String credito){
        this.credito = credito;
    }
}

class Trabajador extends Persona{
    private int salario;
    public int getSalario(){
        return this.salario;
    }
    public void setSalario(int salario){
        this.salario = salario;
    }
}
