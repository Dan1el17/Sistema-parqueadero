public class Usuario {
    private String apellido;
    private String cedula;
    private String nombre;
    private String telefono;

    public Usuario(String apellido, String cedula, String nombre, String telefono){
        this.apellido = apellido;
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void actualizar(String nuevoApellido, String nuevaCedula, String nuevoNombre, String nuevoTelefono){
        this.apellido = nuevoApellido;
        this.cedula = nuevaCedula;
        this.nombre = nuevoNombre;
        this.telefono = nuevoTelefono;
        System.out.println("Datos actualizados; " + nombre + " " + apellido);
    }

    public void agregar(){
        System.out.println("Usuario agregado: " + nombre + " " + apellido);
    }

    public void eliminar(){
        System.out.println("Usuario eliminado: " + nombre + " " + apellido);
    }

    public void realizarPago(TipoPago pago){
        if (pago != null){
            System.out.println("Pago realizado por " + nombre + ": " + pago.getMetodo() + " - $" + pago.getMonto());
        } else {
            System.out.println("No se pudo realizar el pago.");
        }
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula(){
        return cedula;
    }

    public void setCedula(String cedula){
        this.cedula = cedula;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono(){
        return telefono;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
}
