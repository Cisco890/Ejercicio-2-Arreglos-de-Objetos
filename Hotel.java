import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Habitaciones[] habitacionesDisponibles = new Habitaciones[3];

        habitacionesDisponibles[0] = new Habitaciones("Normal",100.0f, 2, false);
        habitacionesDisponibles[1] = new Habitaciones("Deluxe", 200.0f, 4, false);
        habitacionesDisponibles[2] = new Habitaciones("Suite", 300.0f, 6, false);
        while (true) {
            System.out.println("1. Para poder realizar una nueva reserva");
            System.out.println("2. Si es empleado y desea asignar a un cliente a una habitación");
            System.out.println("3. Para cerrar el uso del programa");
            int opcion = scanner.nextInt();
            if (opcion == 1) {
                System.out.print("Ingrese su nombre completo: ");
                scanner.nextLine();
                String Nombre = scanner.nextLine();
                System.out.print("Ingrese el número de familiares que lo acompaña (en números): ");
                int Numfam = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Ingrese que tipo de cliente es (Regular/Frecuente/VIP): ");
                String Tipo = scanner.nextLine();
                Clientes nuevoCliente = new Clientes(Nombre, Numfam, Tipo);

                System.out.println("Información del cliente:");
                System.out.println("Nombre: " + nuevoCliente.getNombre());
                System.out.println("Número de familiares: " + nuevoCliente.getNumfam());
                System.out.println("Tipo: " + nuevoCliente.getTipo());
            }
                 else if (opcion == 2) {
                System.out.println("Ingrese el índice de la habitación a asignar (0, 1, 2): ");
                int indiceHabitacion = scanner.nextInt();
                Habitaciones habitacion = habitacionesDisponibles[indiceHabitacion];

                if (!habitacion.isOcupada()) {
                    System.out.print("Ingrese el tipo de cliente (Regular/Frecuente/VIP): ");
                    scanner.nextLine();
                    String tipoCliente = scanner.nextLine();

                    if (habitacion.puedeOcupar(tipoCliente)) {
                        System.out.print("Ingrese el nombre del cliente: ");
                        String nombreCliente = scanner.nextLine();
                        System.out.print("Ingrese el número de familiares: ");
                        int numFamiliares = scanner.nextInt();

                        Clientes clienteAsignado = new Clientes(nombreCliente, numFamiliares, tipoCliente);

                        habitacion.setOcupada(true);
                        System.out.println("Cliente asignado a la habitación " + habitacion.getTipohabit());
                    } else {
                        System.out.println("El cliente no cumple con los requisitos para esta habitación.");
                    }
                } else {
                    System.out.println("La habitación ya está ocupada.");
                }
            } else if (opcion == 3) {
                System.out.println("Hasta luego, vuelva pronto :) .");
                break;
            }
        }
    }
}