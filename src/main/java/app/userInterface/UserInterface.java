package app.userInterface;

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

            int option = FormTypeValidator.intValidator("""
                        Seleccione:
                        1.Registrar
                        2.Consultar todos los usuarios
                    """);

            switch (option){
                case 1:
                    System.out.println("Registrar");
                    clienteView.crearUsuarioCliente();
                    break;
                case 2:
                    System.out.println("Listar todos los usuarios");
                    clienteView.showAllClientes();
                    break;
                default:
                    System.out.println("Seleccione una opcion valida");
            }
        }
    }

}
