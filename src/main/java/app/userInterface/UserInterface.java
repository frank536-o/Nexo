package app.userInterface;

import app.persistence.dbconnection.DataBaseConnection;
import app.service.Validations.FormTypeValidator;
import app.view.ClienteView;

public class UserInterface {

    private final ClienteView clienteView;
    public UserInterface(ClienteView clienteView) {
        this.clienteView = clienteView;
    }

    public void menuApp(){

        int init = FormTypeValidator.intValidator("Presione 1 para inciar la aplicacion");

        while(init!=0){
            DataBaseConnection.getInstance().getConnection();

            int option = FormTypeValidator.intValidator("""
                        Seleccione:
                        1.Registrar
                        2.Consultar Cliente por ID
                        3.Inicio de sesión Cliente
                        4.Actualizar datos Cliente
                        5.Consultar todos los usuarios
                        6.Eliminar Cliente
                    """);

            switch (option){
                case 1:
                    System.out.println(" Registrar Usuario Nuevo");
                    menuRegistrar();
                    break;
                case 2:
                    System.out.println("Buscar Cliente por ID");
                    clienteView.mostrarClienteById();
                    break;
                case 3:
                    System.out.println("Iniciar Sesión Cliente");
                    boolean isAuth = clienteView.iniciarSesionCliente();
                    break;
                case 4:
                    System.out.println("Actualizar datos Cliente");
                    clienteView.actualizarCliente();
                    break;
                case 5:
                    System.out.println("Listar todos los usuarios");
                    clienteView.showAllClientes();
                    break;
                case 6:
                    System.out.println("Eliminar Cliente");
                    clienteView.eliminarCliente();
                default:
                    System.out.println("Seleccione una opción valida");
            }
        }
    }

    public void menuRegistrar(){
        DataBaseConnection.getInstance().getConnection();

        int option = FormTypeValidator.intValidator("""
                        Seleccione:
                        1.Registrar como Cliente
                        2.Registrar como Prestador
                    """);

        switch (option){
            case 1:
                System.out.println("Registrar Cliente");
                clienteView.crearUsuarioCliente();
                break;
                //case 2:
                 //   prestadorView.crearUsuarioPrestador();
                   // break;
            default:
                System.out.println("Seleccione una opción valida");

        }

    }
}
