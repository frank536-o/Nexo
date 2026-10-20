package app.view;

import app.domain.Billetera;
import app.service.Validations.FormTypeValidator;
import app.service.helpers.SetDocumentType;
import app.service.inputport.AdministradorService;

import java.util.Date;

public class AdministradorView {
    private final AdministradorService administradorService;


    public AdministradorView(AdministradorService administradorService){
        this.administradorService = administradorService;
    }




    public void createAdministrador () {

        int id = FormTypeValidator.intValidator("Ingrese el id del Administrador");
        String docType = SetDocumentType.getDocType();
        String name = FormTypeValidator.stringValidator("Ingrese el nombre del Administrador");
        String lastName = FormTypeValidator.stringValidator("Ingrese el apellido del Administrador");
        String phone = FormTypeValidator.stringValidator("Ingrese el telefono del Administrador");
        String email = FormTypeValidator.stringValidator("Ingrese el correo del Administrador");
        String address = FormTypeValidator.stringValidator("Ingrese la dirección del Administrador");
        String password = FormTypeValidator.stringValidator("Ingrese la contraseña del Administrador");

        Date birthDate = getBirthDateFromInput();

     administradorService.createAdministrador( id, docType, String name, String lastName, String phone,
                String email, String address, String password, Date birthdate,billetera, role);



    }
    public void showAllPropertiesOwners(){
        administradorService.selectAllAdministrador();

    }
    // Metodos Helper , luego se convertiran en metodos de la clase service para que sean llamados desde el controller

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
