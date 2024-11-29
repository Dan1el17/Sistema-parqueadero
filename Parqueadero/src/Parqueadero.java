import java.util.ArrayList;
import java.util.List;

public class Parqueadero {
    private String nombre;
    private String direccion;
    private List<Piso> pisos;

    public Parqueadero(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.pisos = new ArrayList<>();
    }

    public void agregarPiso(Piso piso) {
        if (piso != null) {
            pisos.add(piso);
            System.out.println("Piso agregado: " + piso.getNumero());
        } else {
            System.out.println("El piso no puede ser nulo.");
        }
    }

    public void mostrarPlazasDisponibles(){
        System.out.println("Plazas disponibles en el parqueadero " + nombre +  ":");
    for (Piso piso: pisos){
        piso.mostrarPlazasDisponibles();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Piso> getPisos() {
        return pisos;
    }

    public void setPisos(List<Piso> pisos) {
        this.pisos = pisos;
    }

}
