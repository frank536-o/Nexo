package app.userInterface;

import app.persistence.dbconnection.DataBaseConnection;
import app.service.Validations.FormTypeValidator;
import app.view.BilleteraView;
import app.view.ClienteView;
import app.view.PrestadorView;

public class UserInterface {

    private final ClienteView clienteView;
    private final PrestadorView prestadorView;
    private final BilleteraView billeteraView;

    public UserInterface(ClienteView clienteView, PrestadorView prestadorView, BilleteraView billeteraView) {
        this.clienteView = clienteView;
        this.prestadorView = prestadorView;
        this.billeteraView = billeteraView;
    }

    public void menuApp() {

        int init = FormTypeValidator.intValidator("Presione 1 para iniciar la aplicacion NEXO");

        while (init != 0) {
            DataBaseConnection.getInstance().getConnection();

            int option = FormTypeValidator.intValidator("""
                        ***BIENVENIDO A NEXO***
                        Seleccione:
                        1. Registrar
                        2. Iniciar Sesión
                        3. Salir
                    """);

            switch (option) {
                case 1:
                    System.out.println("Registrar Usuario Nuevo");
                    menuRegistrar();
                    break;
                case 2:
                    System.out.println("Inicio de Sesión");
                    menuInicioSesion();
                    break;
                case 3:
                    System.out.println("Salir");
                    init = 0;
                    break;
                default:
                    System.out.println("Seleccione una opcion valida");
            }
        }
    }

    public void menuRegistrar() {
        DataBaseConnection.getInstance().getConnection();

        int option = FormTypeValidator.intValidator("""
                    ***MENÚ REGISTRO***
                    1. Registrar como Cliente
                    2. Registrar como Prestador
                """);

        switch (option) {
            case 1:
                System.out.println("Registrar Cliente");
                clienteView.crearUsuarioCliente();
                break;
            case 2:
                System.out.println("Registrar Prestador");
                prestadorView.crearUsuarioPrestador();
                break;
            default:
                System.out.println("Seleccione una opción valida");
        }
    }

    public void menuInicioSesion() {
        DataBaseConnection.getInstance().getConnection();
        int option = FormTypeValidator.intValidator("""
                    ***MENÚ INICIO DE SESIÓN***
                    1. Iniciar Sesión como Cliente
                    2. Iniciar Sesión como Prestador
                """);

        switch (option) {
            case 1:
                System.out.println("Inicio Sesión Cliente");
                boolean isAuthCliente = clienteView.iniciarSesionCliente();
                if (isAuthCliente) {
                    menuCliente();
                }
                break;
            case 2:
                System.out.println("Inicio Sesión Prestador");
                boolean isAuthPrestador = prestadorView.iniciarSesionPrestador();
                if (isAuthPrestador) {
                    menuPrestador();
                }
                break;
            default:
                System.out.println("Seleccione una opción valida");
        }
    }

    public void menuCliente() {
        while (true) {
            int option = FormTypeValidator.intValidator("""
                        *** MENÚ CLIENTE ***
                        1. Consultar cliente por ID
                        2. Actualizar mis datos
                        3. Listar todos los clientes
                        4. Eliminar cuenta
                        5. Buscar mi billetera
                        6. Recargar saldo en billetera
                        7. Cerrar sesión
                    """);

            switch (option) {
                case 1:
                    clienteView.mostrarClienteById();
                    break;
                case 2:
                    clienteView.actualizarCliente();
                    break;
                case 3:
                    clienteView.mostrarTotalClientes();
                    break;
                case 4:
                    clienteView.eliminarCliente();
                    break;
                case 5:
                    billeteraView.buscarBilletera();
                    break;
                case 6:
                    billeteraView.recargarSaldo();
                    break;
                case 7:
                    System.out.println("Sesión cerrada.");
                    return;
                default:
                    System.out.println("Seleccione una opción válida");
            }
        }
    }

    public void menuPrestador() {
        while (true) {
            int option = FormTypeValidator.intValidator("""
                        *** MENÚ PRESTADOR ***
                        1. Consultar prestador por ID
                        2. Actualizar mis datos
                        3. Listar todos los prestadores
                        4. Eliminar cuenta
                        5. Buscar mi billetera
                        6. Recargar saldo en billetera
                        7. Cerrar sesión
                    """);

            switch (option) {
                case 1:
                    prestadorView.mostrarPrestadorById();
                    break;
                case 2:
                    prestadorView.actualizarPrestador();
                    break;
                case 3:
                    prestadorView.mostrarTotalPrestadores();
                    break;
                case 4:
                    prestadorView.eliminarUsuarioPrestador();
                    break;
                case 5:
                    billeteraView.buscarBilletera();
                    break;
                case 6:
                    billeteraView.recargarSaldo();
                    break;
                case 7:
                    System.out.println("Sesión cerrada.");
                    return;
                default:
                    System.out.println("Seleccione una opción válida");
            }
        }
    }
}
