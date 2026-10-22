package app.view;

import app.domain.Billetera;
import app.domain.Cliente;
import app.service.Validations.FormTypeValidator;
import app.service.helpers.SetDocumentType;
import app.service.inputport.BilleteraService;
import app.service.inputport.ClienteService;

import java.util.Date;
import java.util.List;

public class ClienteView {
    private final ClienteService clienteService;
    private final BilleteraService billeteraService;

    public ClienteView(ClienteService clienteService, BilleteraService billeteraService) {
        this.clienteService = clienteService;
        this.billeteraService = billeteraService;
    }

    public void crearUsuarioCliente() {

        String docType = SetDocumentType.getDocType();
        int id = FormTypeValidator.intValidator("Ingrese el id del Cliente");
        String name = FormTypeValidator.stringValidator("Ingrese el nombre del Cliente");
        String lastName = FormTypeValidator.stringValidator("Ingrese el apellido del Cliente");
        String phone = FormTypeValidator.stringValidator("Ingrese el telefono del Cliente");
        String email = FormTypeValidator.stringValidator("Ingrese el correo del Cliente");
        String address = FormTypeValidator.stringValidator("Ingrese la dirección del Cliente");
        String password = FormTypeValidator.stringValidator("Ingrese la contraseña del Cliente");
        Date birthDate = getBirthDateFromInput();
        String role = "CLIENTE";
        Billetera billetera = billeteraService.createBilletera(1, id, 0.0);

        clienteService.createCliente(id, docType, name, lastName, phone,
                email, address, password, birthDate, billetera, role,0);
    }

    public void iniciarSesionCliente(){}

    public void actualizarUsuarioCliente(){}

    public void eliminarUsuarioCliente(){}

    public Date getBirthDateFromInput() {
        String birthDateString = FormTypeValidator.stringValidator("Ingrese la fecha de nacimiento del propietario (formato: yyyy-MM-dd)");
        Date birthDate = null;
        try {
            birthDate = new java.text.SimpleDateFormat("yyyy-MM-dd").parse(birthDateString);
        } catch (java.text.ParseException e) {
            System.out.println("Formato de fecha inválido. Por favor, ingrese la fecha en el formato correcto.");
        }
        return birthDate;
    }

    public void showAllClientes(){

        List<Cliente> clientes = clienteService.selectAllCliente();

        for(Cliente cliente: clientes){
            System.out.println(cliente.getId() + "" + cliente.getName() + "");
        }

    }
}
