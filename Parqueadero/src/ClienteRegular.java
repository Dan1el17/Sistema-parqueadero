import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.SimpleTimeZone;
import java.util.Locale;

public class ClienteRegular extends Usuario{
    private boolean suscripcionActiva;
    private int duracionMembresia;
    private Date fechaInicioMembresia;

    public ClienteRegular(String nombre, String apellido, String cedula, String telefono, String metodoPago, int duracionMembresia){
        super(nombre, apellido, cedula, telefono);
        this.suscripcionActiva = true;
        this.duracionMembresia = duracionMembresia;
        this.fechaInicioMembresia = new Date();
    }

    public void realizarReserva(PlazaParqueo reserva) {
        if (reserva.estaDisponible()) {
            reserva.reservarPlaza();
            System.out.println("El cliente " + getNombre() + " ha reservado la plaza " + reserva.getId() + " por " + reserva.getEstado() + " minutos.");
        } else {
            System.out.println("La plaza " + reserva.getId() + " no está disponible para reservar.");
        }
    }

    public void imprimirDetallesMembresia(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        System.out.println("El cliente " + getNombre() + " tiene una membresia de " + duracionMembresia + " dias.");
        System.out.println("Fecha de inicio de la membresía: " + sdf.format(fechaInicioMembresia));
        System.out.println("Fecha de expiración de la membresía: " + sdf.format(getFechaExpiracionMembresia()));
        System.out.println("Suscripción activa: " + (estaMembresiaVigente() ? "Sí" : "No"));
    }

    public boolean estaMembresiaVigente() {
        Date ahora = new Date();
        return ahora.before(getFechaExpiracionMembresia());
    }

   public Date getFechaExpiracionMembresia() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaInicioMembresia);
        calendar.add(Calendar.DAY_OF_YEAR, duracionMembresia);
        return calendar.getTime();
    }

    public boolean isSuscripcionActiva(){
        return suscripcionActiva;
    }

    public void setSuscripcionActiva(boolean suscripcionActiva){
        this.suscripcionActiva = suscripcionActiva;
    }

    public int getDuracionMembresia(){
        return duracionMembresia;
}

    public void setDuracionMembresia(int duracionMembresia){
        this.duracionMembresia = duracionMembresia;
    }

}
