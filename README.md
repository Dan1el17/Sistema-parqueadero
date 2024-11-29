# Sistema-parqueadero
# Sistema Parqueadero
Este proyecto tiene como objetivo implementar el módulo de Parqueadero dentro de un sistema de gestión para un establecimiento. El sistema de Parqueadero permitirá gestionar eficientemente las operaciones relacionadas con el control de acceso de vehículos, asignación de espacios, registro de entradas y salidas, cálculo de tarifas y generación de reportes de ocupación y facturación.

### Diagrama UML
Se adjunta el diagrama UML actualizado, con los cambios realizados al modelo actual.

![Parqueadero](![Parqueadero](https://github.com/user-attachments/assets/a6296581-2b45-4893-af3d-38c5e94fde62)

> Diagrama de clases-UML del modulo de pedidos 

# Cambios Realizados en el Diagrama de Clases
Después de un análisis detallado y mejora del primer diagrama UML, se han realizado los siguientes cambios principales para mejorar la estructura, la claridad y el diseño del sistema:

1. Mejora en el Encapsulamiento :
   Se cambiaron algunos atributos de las clases a privadas para mejorar su encapsulamiento y garantizar un acceso controlado.
   
3. Nueva Clase Boletoy EnumeraciónBoleto :
   Se ha agregado la clase Boleto , junto con la enumeración Boleto , para gestionar los diferentes estados de los boletos en el sistema de parqueo.

4. Nueva EnumeraciónEstadoPlaza :
   Se introdujo una nueva enumeración llamada EstadoPlaza para gestionar el estado de las plazas de parqueo.
   
5. Modificación en la ClasePlazaParqueo :
   - Se ha agregado el atributo estadoPlazapara representar el estado de la plaza.
   - Se eliminó el atributo estaDisponible, ya que la gestión de disponibilidad ahora se maneja con el nuevo atributo estadoPlaza.
   - Se agregaron los métodos reservarPlaza()y cancelarPlaza()para mejorar la gestión de las plazas de parqueo.
   - Cambios en la ClaseParqueadero :

6. Se agregó el atributo pisos: List<Piso>para gestionar los diferentes pisos del parqueadero.
   - Se creó la clase Piso, que ahora se utiliza para representar los pisos dentro de un parqueadero.
     
7. Modificación de la ClaseEmpleado :
   - La clase Empleadose cambió a abstracta para evitar instancias directas y reforzar la especialización de las clases hijas.
   - Los atributos de la clase Empleadose modificaron para ser protegidos ( protected), permitiendo que las subclases accedan a ellas.
   - Se eliminó el método asignarTarea()de la clase Empleado.
     
8. Modificaciones en la ClaseClienteRegular :
   - Se eliminó el atributo metodoPagode la clase ClienteRegularpara simplificar la gestión de pagos.
   - Se agregó el atributo duracionMembresia, que ahora representa la duración de la membresía de un cliente regular.
   - Se desarrolló una relación de dependencia entre la clase ClienteRegulary PlazaParqueo, ya que ClienteRegularhace uso del método reservarPlaza()en la clase PlazaParqueo.
     
9. Modificación en la ClaseReserva :
   - El método confirmarReserva()de la clase Reservafue reemplazado por realizarReserva()para reflejar mejor la acción de realizar una reserva en el sistema.
