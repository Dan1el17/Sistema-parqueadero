import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Reserva {
    private Date fecha;
    private int duracion;

    public Reserva(Date fecha, int duracion){
        this.fecha = fecha;
        this.duracion = duracion;
    }

    public void confirmarReserva(){
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy 'Hora:' HH:mm", new Locale("es", "ES"));
        String format = formatoFecha.format(fecha);
        System.out.println("La reserva esta confirmada para " + fecha + " por " + duracion + " minutos.");
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
