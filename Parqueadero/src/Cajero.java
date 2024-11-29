public class Cajero extends Empleado {
    public Cajero(String nombre, String idEmpleado, String cargo) {
        super(nombre, idEmpleado, cargo);
    }

    public void procesarPago(){
        System.out.println("El cajero " + getIdEmpleado() + " esta procesando un pago.");
    }
}
