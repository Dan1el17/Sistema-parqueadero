public abstract class Empleado {
    protected String idEmpleado;
    protected String cargo;
    protected String nombre;

    public Empleado(String nombre, String idEmpleado, String cargo){
        this.idEmpleado = idEmpleado;
        this.cargo = cargo;
    }

    public void registrarEntrada(){
        System.out.println("Entrada registrada para el empleado: " + idEmpleado);
    }

    public void registrarSalida(){
        System.out.println("Salida registrada por el empleado: " + idEmpleado);
    }

    public void generarReporte(){
        System.out.println("Generando reporte por el empleado: " + idEmpleado);
    }

    public void asignarTarea(){
        System.out.println("Asignando tarea por el empleado: " + idEmpleado);
    }

    public void actualizarDatos(){
        System.out.println("Actualizando datos por el empleado: " + idEmpleado);
    }

    public String getIdEmpleado() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdEmpelado(){
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado){
        this.idEmpleado = idEmpleado;
    }

    public String getCargo(){
        return cargo;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

}
