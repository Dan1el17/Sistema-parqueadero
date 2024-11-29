import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Boleto {
    private String idBoleto;
    private Vehiculo vehiculo;
    private EstadoBoleto estado;
    private Date fechaEmision;

    public Boleto(String idBoleto, Vehiculo vehiculo, EstadoBoleto estado, Date fechaEmision){
        this.estado = estado;
        this.idBoleto = idBoleto;
        this.vehiculo = vehiculo;
        this.fechaEmision = fechaEmision;
    }

    public void mostrarDetalle(){
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy '---> Hora: ' HH:mm", new Locale("es", "ES"));
        String fecha = formatoFecha.format(fechaEmision);
        System.out.println("ID del Boleto: " + idBoleto);
        System.out.println("Tipo de vehículo: " + vehiculo.getClass().getSimpleName() + " ---> Placa: " + vehiculo.getMatricula());
        System.out.println("Estado: " + estado);
        System.out.println("Fecha de emision: " + fecha);
    }

    public boolean validarBoleto(){
        return estado == EstadoBoleto.VIGENTE;
    }

    public long calcularTiempoEstacionamiento(Date horaSalida){
        long diff = horaSalida.getTime() - fechaEmision.getTime();
        return diff / (1000 * 60);
    }

    public void actualizarEstado(EstadoBoleto nuevoEstado){
        this.estado = nuevoEstado;
    }

    public String getIdBoleto(){
        return idBoleto;
    }

    public void setIdBoleto(String idBoleto){
        this.idBoleto = idBoleto;
    }

    public Vehiculo getVehiculo(){
        return  vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }

    public EstadoBoleto getEstado() {
        return estado;
    }

    public void setEstado(EstadoBoleto estado){
        this.estado = estado;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    enum EstadoBoleto{
        VIGENTE,
        VENCIDO,
        CANCELADO,
    }
}
