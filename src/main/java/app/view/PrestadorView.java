package app.view;

import app.domain.Billetera;
import app.domain.Cliente;
import app.domain.Prestador;
import app.service.Validations.FormTypeValidator;
import app.service.helpers.SetDocumentType;
import app.service.inputport.BilleteraService;
import app.service.inputport.PrestadorService;

import java.util.Date;
import java.util.List;

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

    public boolean iniciarSesionPrestador() {
        String email = FormTypeValidator.stringValidator("Ingrese su correo");
        String password = FormTypeValidator.stringValidator("Ingrese su contraseña");
        boolean prestador = prestadorService.iniciarSesionPrestador(email, password);
        if (prestador) {
            System.out.println("Bienvenid@ de nuevo");
            return true;
        } else {
            System.out.println("Error en el inicio de sesión");
        }
        return false;
    }

    public void actualizarPrestador() {
        System.out.println("Actualizar Datos del prestador");

        String docType = SetDocumentType.getDocType();
        int id = FormTypeValidator.intValidator("Ingrese el id del Prestador");
        String name = FormTypeValidator.stringValidator("Ingrese el nombre del Prestador");
        String lastName = FormTypeValidator.stringValidator("Ingrese el apellido del Prestador");
        String phone = FormTypeValidator.stringValidator("Ingrese el telefono del Prestador");
        String email = FormTypeValidator.stringValidator("Ingrese el correo del Prestador");
        String address = FormTypeValidator.stringValidator("Ingrese la dirección del Prestador");
        String password = FormTypeValidator.stringValidator("Ingrese la contraseña del Prestador");
        String role = "PRESTADOR";
        String descripPerfil = FormTypeValidator.stringValidator("Ingrese la nueva descripción de su perfil");
        prestadorService.actualizarPrestador(id, docType, name, lastName, phone,
                email, address, password, null, role, descripPerfil);

    }

    public void mostrarPrestadorById() {

        int id = FormTypeValidator.intValidator("Ingrese el id del Prestador a consultar");

        Prestador prestador = prestadorService.selectPrestadorById(id);

        if (prestador == null) {
            System.out.println("No se encontro el Prestador en la BD");

            return;
        }
        System.out.println(" Id: " + prestador.getId() + "\n "
                + "Tipo de Documento: " + prestador.getDocType() + "\n "
                + "Nombre: " + prestador.getName() + "\n "
                + "Apellido: " + prestador.getLastName() + "\n "
                + "Telefono: " + prestador.getPhone() + "\n "
                + "Correo: " + prestador.getEmail() + "\n "
                + "Dirección: " + prestador.getAddress() + "\n "
                + "Contraseña: " + prestador.getPassword() + "\n "
                + "Fecha de Nacimiento: " + prestador.getBirthdate() + "\n "
                + "Role: " + prestador.getRole() + "\n ");
    }
        public void eliminarUsuarioPrestador () {
            int id = FormTypeValidator.intValidator("Ingrese el Id del prestador a eliminar");
            prestadorService.eliminarPrestadorById(id);
        }

        public Date getBirthDateFromInput () {
            String birthDateString = FormTypeValidator.stringValidator("Ingrese la fecha de nacimiento (formato: yyyy-MM-dd)");
            Date birthDate = null;
            try {
                birthDate = new java.text.SimpleDateFormat("yyyy-MM-dd").parse(birthDateString);
            } catch (java.text.ParseException e) {
                System.out.println("Formato de fecha inválido. Por favor, ingrese la fecha en el formato correcto.");
            }
            return birthDate;
        }

        public void mostrarTotalPrestadores () {

            List<Prestador> prestadores = prestadorService.selectAllPrestador();

            for (Prestador prestador : prestadores) {
                System.out.println(" Id: " + prestador.getId() + "\n "
                        + "Tipo de Documento: " + prestador.getDocType() + "\n "
                        + "Nombre: " + prestador.getName() + "\n "
                        + "Apellido: " + prestador.getLastName() + "\n "
                        + "Telefono: " + prestador.getPhone() + "\n "
                        + "Correo: " + prestador.getEmail() + "\n "
                        + "Dirección: " + prestador.getAddress() + "\n "
                        + "Contraseña: " + prestador.getPassword() + "\n "
                        + "Fecha de Nacimiento: " + prestador.getBirthdate() + "\n "
                        + "Role: " + prestador.getRole() + "\n ");

            }

        }

    }

