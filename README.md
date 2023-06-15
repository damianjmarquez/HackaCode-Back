# HackaCode-Back

Diagrama de Clases 
https://lucid.app/lucidchart/651ffb73-9447-4cf8-a3eb-38f714a4e02f/edit?beaconFlowId=E7E4F106AD3C5EB9&invitationId=inv_156a92f5-b0e8-4069-aa0d-b05a68b1ead7&page=0_0#


Restricciones de integridad:
Garantizar que los campos obligatorios no puedan estar vacíos, como el nombre de usuario, contraseña, nombre y apellido de los empleados, nombre y apellido de los compradores, etc.
Establecer reglas para la longitud y formato válido de los campos, como el DNI, teléfono y dirección de correo electrónico.
Validar que los precios de los juegos y las entradas sean valores numéricos no negativos.

Reglas de horarios y ventas:
Verificar que las fechas y horarios de venta sean válidos, es decir, no se permita realizar una venta en un horario en el que el juego no esté disponible.
Establecer límites de capacidad para los juegos y evitar vender más entradas de las que el juego puede manejar en un determinado horario.
Controlar que las fechas de venta y fecha de uso de las entradas estén dentro de un rango válido y no en el pasado.

Reglas de asignación de empleados y usuarios:
Asegurar que cada empleado tenga un único usuario asociado y que no existan usuarios sin empleados o empleados sin usuarios.
Limitar el acceso a ciertas funcionalidades según el tipo de empleado (juego o administrativo), de modo que solo los empleados autorizados puedan realizar ciertas operaciones.

Validación de duplicados:
Evitar la creación de registros duplicados en las tablas principales, como juegos, empleados, compradores, etc., a través de restricciones de clave primaria o índices únicos.

Reglas de consistencia de datos:
Mantener la coherencia de los datos al realizar actualizaciones o eliminaciones en las tablas relacionadas, para evitar datos huérfanos o inconsistencias.