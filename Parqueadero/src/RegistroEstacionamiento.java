import java.util.Date;

public class RegistroEstacionamiento {
    // Atributos privados
    private Date horaEntrada;
    private Date horaSalida;
    private PlazaParqueo plazaAsignada;
    private Vehiculo vehiculo;
    private float costo;

    // Constructor
    public RegistroEstacionamiento(Date horaEntrada, PlazaParqueo plazaAsignada, Vehiculo vehiculo) {
        this.horaEntrada = horaEntrada;
        this.plazaAsignada = plazaAsignada;
        this.vehiculo = vehiculo;
        this.horaSalida = null; // Inicialmente la hora de salida es null
        this.costo = 0.0f; // Inicialmente el costo es 0.0
    }

    // Método para calcular la duración del estacionamiento
    public long calcularDuracion() {
        if (horaSalida == null) {
            throw new IllegalStateException("La hora de salida no está establecida.");
        }
        long duracion = horaSalida.getTime() - horaEntrada.getTime();
        return duracion / (1000 * 60); // Devuelve la duración en minutos
    }

    // Método para establecer la hora de salida y calcular el costo
    public void registrarSalida(Date horaSalida, float tarifaPorMinuto) {
        this.horaSalida = horaSalida;
        long duracion = calcularDuracion();
        this.costo = duracion * tarifaPorMinuto;
    }

    // Getters y Setters
    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public PlazaParqueo getPlazaAsignada() {
        return plazaAsignada;
    }

    public void setPlazaAsignada(PlazaParqueo plazaAsignada) {
        this.plazaAsignada = plazaAsignada;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
}
