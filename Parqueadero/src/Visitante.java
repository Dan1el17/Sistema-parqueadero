public class Visitante extends Usuario {
    public Visitante(String nombre, String apellido, String cedula, String telefono){
        super(nombre, apellido,cedula,telefono);
    }

    public void pagarPorTiempo(){
        System.out.println("Pago realizado por el tiempo de uso");
    }
}
