import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Crear un parqueadero
        Parqueadero parqueadero = new Parqueadero("Parqueadero Amigable", "Av. Principal 123");
        System.out.println("Nombre del parqueadero: " + parqueadero.getNombre());
        System.out.println("Dirección: " + parqueadero.getDireccion());
        System.out.println("");

        // Crear pisos
        Piso piso1 = new Piso(1, 10); // Piso 1 con 10 plazas de parqueo
        Piso piso2 = new Piso(2, 10); // Piso 2 con 10 plazas de parqueo


        // Agregar pisos al parqueadero
        parqueadero.agregarPiso(piso1);
        parqueadero.agregarPiso(piso2);


        // Crear plazas de parqueo
        PlazaParqueo plaza1 = new PlazaParqueo("P1-01", Estado.DISPONIBLE);
        PlazaParqueo plaza2 = new PlazaParqueo("P1-02", Estado.DISPONIBLE);
        PlazaParqueo plaza3 = new PlazaParqueo("P2-01", Estado.DISPONIBLE);
        PlazaParqueo plaza4 = new PlazaParqueo("P2-02", Estado.DISPONIBLE);
        System.out.println("");

        piso1.agregarPlaza(plaza1);
        piso1.agregarPlaza(plaza2);

        piso1.mostrarPlazasDisponibles();
        piso1.mostrarPlazasOcupadas();

        // Mostrar las plazas en cada piso
        System.out.println("Plazas en el piso 1:");
        piso1.getPlazas().forEach(plaza -> System.out.println(plaza.getId()));

        System.out.println("Plazas en el piso 2:");
        piso2.getPlazas().forEach(plaza -> System.out.println(plaza.getId()));

        // Crear vehículos
        Automovil automovil1 = new Automovil("BDF589", "Sedán", "Rojo", "Compacto");
        Motocicleta motocicleta1 = new Motocicleta("SDF934", "Deportiva", "Verde", "250cc");
        Bicicleta bicicleta1 = new Bicicleta("Suspensión completa", "Negra", "Montaña");

        System.out.println("=== Detalles de los Vehículos ===");
        automovil1.mostrarDetalles();
        motocicleta1.mostrarDetalles();
        bicicleta1.mostrarDetalles();

        // Crear boletos
        Boleto boleto1 = new Boleto("B001", automovil1, Boleto.EstadoBoleto.VIGENTE, new Date());
        Boleto boleto2 = new Boleto("B002", motocicleta1, Boleto.EstadoBoleto.VIGENTE, new Date());
        Boleto boleto3 = new Boleto("B003", bicicleta1, Boleto.EstadoBoleto.VIGENTE, new Date());
        System.out.println("");

        System.out.println("=== Detalles de los Boletos ===");
        boleto1.mostrarDetalle();
        boleto2.mostrarDetalle();
        boleto3.mostrarDetalle();

        // Crear registros de estacionamiento
        RegistroEstacionamiento registro1 = new RegistroEstacionamiento(new Date(), plaza1, automovil1);
        RegistroEstacionamiento registro2 = new RegistroEstacionamiento(new Date(), plaza2, motocicleta1);
        RegistroEstacionamiento registro3 = new RegistroEstacionamiento(new Date(), plaza3, bicicleta1);

        // Registrar salida
        Date horaSalida1 = new Date(new Date().getTime() + 1000 * 60 * 120);
        Date horaSalida2 = new Date(new Date().getTime() + 1000 * 60 * 60);
        Date horaSalida3 = new Date(new Date().getTime() + 1000 *60 *90);
        registro1.registrarSalida(horaSalida1, 0.50f);
        registro2.registrarSalida(horaSalida2, 0.50f);
        registro3.registrarSalida(horaSalida3, 0.30f);
        System.out.println("");

        System.out.println("Duracion del estacionamiento (Registro 1): " + registro1.calcularDuracion() + " minutos");
        System.out.println();

        // Asignar vehículos a plazas de parqueo
        plaza1.asignarVehiculo(automovil1);
        plaza2.asignarVehiculo(motocicleta1);
        plaza3.asignarVehiculo(bicicleta1);
        System.out.println("");

        // Mostrar plazas disponibles en el parqueadero
        parqueadero.mostrarPlazasDisponibles();

        // Mostrar plazas ocupadas en el piso 1
        piso1.mostrarPlazasOcupadas();

        // Mostrar plazas ocupadas en el piso 2
        piso2.mostrarPlazasOcupadas();

        // Liberar una plaza y mostrar el cambio
        plaza1.liberarPlaza();
        parqueadero.mostrarPlazasDisponibles();

        ClienteRegular cliente1 = new ClienteRegular("Daniel", "Pardo", "1105647896", "0957846842", "Tarjeta de credito", 30);
        ClienteRegular cliente2 = new ClienteRegular("Andres", "Rojas", "1187456312", "0658974563", "Transferencia", 10);
        ClienteRegular cliente3 = new ClienteRegular("Kevin", "Valladolid", "1174586894", "0924567896", "Efectivo", 4 );
        System.out.println("");

        cliente1.imprimirDetallesMembresia();
        System.out.println("");
        cliente2.imprimirDetallesMembresia();
        System.out.println("");
        cliente3.imprimirDetallesMembresia();
        System.out.println("");

        Reserva reserva1 = new Reserva(new Date(), 60);
        Reserva reserva2 = new Reserva(new Date(), 90);
        Reserva reserva3 = new Reserva(new Date(), 120);
        System.out.println("");

        cliente1.realizarReserva(plaza1);
        cliente2.realizarReserva(plaza2);
        cliente3.realizarReserva(plaza3);
        System.out.println("");

        Cajero cajero = new Cajero("Mateo", "C001", "Cajero");
        cajero.procesarPago();
        System.out.println("");

        Supervisor supervisor = new Supervisor("Jose", "S001","Supervisor");
        supervisor.revisarReporte();
    }

}
