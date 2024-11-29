import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TipoPago {
    private Pago metodo;
    private float monto;
    private Date fecha;

    public TipoPago(Pago metodo, float monto, Date fecha){
        this.metodo = metodo;
        this.monto = monto;
        this.fecha = fecha;
    }

    public boolean procesarPago(){
        System.out.println("Procesando pago de " + monto + " mediante " + metodo);
        return true;
    }

    public void mostrarDetallePago(){
        System.out.println("Metodo de pago: " + metodo + ", Monto: $" + monto);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy 'Hota:' HH:mm", new Locale("es", "ES"));
    }
    public Pago getMetodo() {
        return metodo;
    }

    public void setMetodo(Pago metodo) {
        this.metodo = metodo;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}


