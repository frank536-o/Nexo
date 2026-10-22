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

        int id = FormTypeValidator.intValidator("Ingrese el id del Prestador");
        String docType = SetDocumentType.getDocType();
        String name = FormTypeValidator.stringValidator("Ingrese el nombre del Prestador");
        String lastName = FormTypeValidator.stringValidator("Ingrese el apellido del Prestador");
        String phone = FormTypeValidator.stringValidator("Ingrese el telefono del Prestador");
        String email = FormTypeValidator.stringValidator("Ingrese el correo del Prestador");
        String address = FormTypeValidator.stringValidator("Ingrese la dirección del Prestador");
        String password = FormTypeValidator.stringValidator("Ingrese la contraseña del Prestador");
        Date birthDate = getBirthDateFromInput();
        String role = "PRESTADOR";
        String descripPerfil = FormTypeValidator.stringValidator("Ingrese la descripcion del Prestador");
        Billetera billetera = billeteraService.createBilletera(1, id, 0.0);


        prestadorService.createPrestador(id, docType, name, lastName, phone,
                email, address, password, birthDate, billetera, role,
                descripPerfil, 0);
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
