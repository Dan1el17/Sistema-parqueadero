public class PlazaParqueo {
    private boolean estaDisponible;
    private boolean esExclusivaParaBicicletas;
    private String id;
    private Estado estado;

    public PlazaParqueo(String id, Estado estado) {
        this.id = id;
        this.estado = estado;
        this.estaDisponible = true;
    }

    public void asignarVehiculo(Vehiculo vehiculo) {
        if (estado == Estado.DISPONIBLE) {
            this.estaDisponible = false;
            this.estado = Estado.OCUPADA;
            String tipoVehiculo = vehiculo.getClass().getSimpleName();
            imprimirMensaje("Asignación exitosa",
                    String.format("Vehículo de tipo '%s' asignado a la plaza '%s'. Estado actual: %s.",
                            tipoVehiculo, id, estado));
        } else {
            imprimirError("Asignación fallida", "La plaza ya está ocupada o no está disponible.");
        }
    }

    public void liberarPlaza() {
        if (estado == Estado.OCUPADA) {
            this.estaDisponible = true;
            this.estado = Estado.DISPONIBLE;
            imprimirMensaje("Liberación exitosa", String.format("La plaza '%s' ha sido liberada. Estado actual: %s.", id, estado));
        } else {
            imprimirError("Liberación fallida", "La plaza ya está libre o no estaba ocupada.");
        }
    }

    public void reservarPlaza() {
        if (estado == Estado.DISPONIBLE) {
            estado = Estado.RESERVADA;
            imprimirMensaje("Reserva exitosa", String.format("La plaza '%s' ha sido reservada. Estado actual: %s.", id, estado));
        } else {
            imprimirError("Reserva fallida", "La plaza ya está reservada u ocupada.");
        }
    }

    public void cancelarPlaza() {
        if (estado == Estado.RESERVADA) {
            estado = Estado.DISPONIBLE;
            imprimirMensaje("Cancelación exitosa", String.format("La reserva de la plaza '%s' ha sido cancelada. Estado actual: %s.", id, estado));
        } else {
            imprimirError("Cancelación fallida", "La plaza no estaba reservada.");
        }
    }

    public boolean estaDisponible() {
        return this.estado == Estado.DISPONIBLE;
    }

    // Métodos de impresión para reutilizar
    private void imprimirMensaje(String titulo, String mensaje) {
        System.out.println("[" + titulo + "] " + mensaje);
    }

    private void imprimirError(String titulo, String mensaje) {
        System.err.println("[" + titulo + "] " + mensaje);
    }

    // Getters y setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
