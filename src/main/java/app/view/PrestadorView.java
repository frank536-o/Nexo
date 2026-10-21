package app.view;

import app.domain.Billetera;
import app.service.Validations.FormTypeValidator;
import app.service.helpers.SetDocumentType;
import app.service.inputport.BilleteraService;
import app.service.inputport.PrestadorService;

import java.util.Date;

public class PrestadorView {

    private final PrestadorService prestadorService;
    private final BilleteraService billeteraService;

    public PrestadorView(PrestadorService prestadorService, BilleteraService billeteraService) {
        this.prestadorService = prestadorService;
        this.billeteraService = billeteraService;
    }
    public void crearUsuarioPrestador() {

        int id = FormTypeValidator.intValidator("Ingrese el id del Prestado");
        String docType = SetDocumentType.getDocType();
        String name = FormTypeValidator.stringValidator("Ingrese el nombre del Prestado");
        String lastName = FormTypeValidator.stringValidator("Ingrese el apellido del Prestado");
        String phone = FormTypeValidator.stringValidator("Ingrese el telefono del Prestado");
        String email = FormTypeValidator.stringValidator("Ingrese el correo del Prestado");
        String address = FormTypeValidator.stringValidator("Ingrese la dirección del Prestado");
        String password = FormTypeValidator.stringValidator("Ingrese la contraseña del Prestado");
        Date birthDate = getBirthDateFromInput();
        String role = "PRESTADOR";
        Billetera billetera = billeteraService.createBilletera(1, id, 0.0);

        prestadorService.createPrestador(id, docType, name, lastName, phone,
                email, address, password, birthDate, billetera, role,0);
    }

    public void iniciarSesionPrestador(){}

    public void actualizarUsuarioPrestador(){}

    public void eliminarUsuarioPrestador(){}

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
}
