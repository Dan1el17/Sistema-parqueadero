import java.util.ArrayList;
import java.util.List;

public class Piso {
    private int numero;
    private int totalPlazas;
    private List<PlazaParqueo> plazas;

    public Piso(int numero, int totalPlazas) {
        this.numero = numero;
        this.totalPlazas = totalPlazas;
        this.plazas = new ArrayList<>();
    }

    public void agregarPlaza(PlazaParqueo plaza) {
        if (plazas.size() < totalPlazas) {
            plazas.add(plaza);
            System.out.println("Plaza agregada al piso " + numero + ": " + plaza.getId());
        } else {
            System.out.println("No se pueden agregar más plazas. El piso " + numero + " está lleno.");
        }
    }

    public void mostrarPlazasDisponibles() {
        System.out.println("Plazas disponibles en el piso " + numero + ":");
        boolean hayDisponibles = false;

        for (PlazaParqueo plaza : plazas) {
            if (plaza.getEstado() == Estado.DISPONIBLE) {
                System.out.println("Plaza disponible: " + plaza.getId());
                hayDisponibles = true;
            }
        }

        if (!hayDisponibles) {
            System.out.println("No hay plazas disponibles en el piso " + numero + ".");
        }
    }

    public void mostrarPlazasOcupadas() {
        System.out.println("Plazas ocupadas en el piso " + numero + ":");
        boolean hayOcupadas = false;

        for (PlazaParqueo plaza : plazas) {
            if (plaza.getEstado() == Estado.OCUPADA) {
                System.out.println("Plaza ocupada: " + plaza.getId());
                hayOcupadas = true;
            }
        }

        if (!hayOcupadas) {
            System.out.println("No hay plazas ocupadas en el piso " + numero + ".");
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTotalPlazas() {
        return totalPlazas;
    }

    public void setTotalPlazas(int totalPlazas) {
        this.totalPlazas = totalPlazas;
    }

    public List<PlazaParqueo> getPlazas() {
        return plazas;
    }

    public void setPlazas(List<PlazaParqueo> plazas) {
        this.plazas = plazas;
    }
}
