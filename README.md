# Sistema-parqueadero
Este trabajo tiene como objetivo implementar un módulo de gestión de parqueos dentro de un sistema de administración de estacionamientos. El sistema está basado en un diagrama UML diseñado previamente, el sistema de parqueo permite la administración eficiente de múltiples pisos de estacionamiento y plazas de parqueo, facilitando la asignación de vehículos, la reserva de plazas, y el control de membresías para los clientes regulares. Además, incorpora funcionalidades para gestionar los pagos y registros de estacionamiento, asegurando que los datos sean manejados de manera segura y organizada.

### Diagrama UML
Se adjunta el diagrama UML actualizado, que refleja los cambios realizados al modelo original durante la implementación.

![Diagrama_UML_Pedidos](https://github.com/user-attachments/assets/81173562-1998-4c66-9fc9-bc8f9b56c033).
> Diagrama de clases-UML del modulo de pedidos 

# Carpeta java
[Carpeta.java](https://github.com/Dan1el17/Parqueadero/tree/801141d13ab3ed40368ff33160157e72857db344/Parqueadero/src)

Esta carpeta te redirecciona a donde se encuentran los archivos.java necesarios para ejecutar el proyecto localmente.

# Cambios Realizados en el Diagrama de Clases
Después de un análisis detallado y mejora del primer diagrama UML, se han realizado los siguientes cambios principales para mejorar la estructura, la claridad y el diseño del sistema:

1. Mejora en el Encapsulamiento:
   Se cambiaron algunos atributos de las clases a privados para mejorar su encapsulamiento y garantizar un acceso controlado.
   
2. Nueva Clase Boleto y Enumeración Boleto:
   Se ha agregado la clase Boleto, junto con la enumeración Boleto, para gestionar los diferentes estados de los boletos en el sistema de parqueo.

3. Nueva Enumeración EstadoPlaza:
   Se introdujo una nueva enumeración llamada EstadoPlaza para manejar el estado de las plazas de parqueo.
   
4. Modificación en la Clase PlazaParqueo:
   - Se ha agregado el atributo estadoPlaza para representar el estado de la plaza.
   - Se eliminó el atributo estaDisponible, ya que la gestión de disponibilidad ahora se maneja con el nuevo atributo estadoPlaza.
   - Se añadió el atributo esExclusivaParaBicicletas para identificar plazas dedicadas exclusivamente a bicicletas.
   - Se agregaron los métodos reservarPlaza() y cancelarPlaza() para mejorar la gestión de las plazas de parqueo.

5. Cambios en la Clase Parqueadero:
   - Se agregó el atributo pisos: List<Piso> para gestionar los diferentes pisos del parqueadero.
   - Se creó la clase Piso, que ahora se utiliza para representar los pisos dentro de un parqueadero.

7. Modificación de la Clase Empleado:
   - La clase Empleado se cambió a abstracta para evitar instancias directas y reforzar la especialización de las clases hijas.
   - Los atributos de la clase Empleado se modificaron para ser protegidos (protected), permitiendo que las subclases accedan a ellos.
   - Se eliminó el método asignarTarea() de la clase Empleado.

8. Modificaciones en la Clase ClienteRegular:
   - Se eliminó el atributo metodoPago de la clase ClienteRegular para simplificar la gestión de pagos.
   - Se añadió el atributo duracionMembresia, que ahora representa la duración de la membresía de un cliente regular.
   - Se estableció una relación de dependencia entre la clase ClienteRegular y PlazaParqueo, ya que ClienteRegular hace uso del método reservarPlaza() en la clase PlazaParqueo.

9. Modificación en la Clase Reserva:
   El método confirmarReserva() de la clase Reserva fue reemplazado por realizarReserva() para reflejar mejor la acción de realizar una reserva en el sistema.
