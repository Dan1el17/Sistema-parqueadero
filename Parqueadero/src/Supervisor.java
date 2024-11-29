public class Supervisor extends Empleado {

    public Supervisor(String nombre, String idEmpleado, String cargo) {
        super(nombre, idEmpleado, cargo);
    }

    public void revisarReporte(){
        System.out.println("El supervisor " + getIdEmpleado() + " esta supervisando las plazas.");
    }
}
