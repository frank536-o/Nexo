package app.view;


import app.domain.Prestador;
import app.domain.Servicio;
import app.service.Validations.FormTypeValidator;
import app.service.inputport.BilleteraService;
import app.service.inputport.PrestadorService;
import app.service.inputport.ServicioService;

import java.util.List;

public class ServicioView {
    private final ServicioService servicioService;
    private final BilleteraService billeteraService;
    private final PrestadorService prestadorService;

    public ServicioView(ServicioService servicioService, BilleteraService billeteraService, PrestadorService prestadorService) {
        this.servicioService = servicioService;
        this.billeteraService = billeteraService;
        this.prestadorService = prestadorService;
    }

    public void crearServicio() {
        Integer idServicio;
        String nombreServicio = FormTypeValidator.stringValidator("Ingrese el nombre del servicio");
        String descripServicio = FormTypeValidator.stringValidator("Ingrese la descripcion del servicio");
        Double precioServicio;
        Prestador prestador = prestadorService.selectPrestadorById(0);

        servicioService.createServicio(0, nombreServicio, descripServicio, 0.0, prestador);
    }

    public void iniciarSesionServicio() {
    }

    public void actualizarUsuarioServicio() {
    }

    public void eliminarUsuarioServicio() {
    }


    public void showAllSevicios() {

        List<Servicio> servicios = servicioService.selectAllServicio();

        if (servicios.isEmpty()) {
            System.out.println("No hay servicios registrados en la plataforma.");
        } else {
            for (Servicio servicio : servicios) {
                System.out.println("Id: " + servicio.getIdServicio() + "Servicio: " + servicio.getNombreServicio() + "Precio del servicio: " + servicio.getPrecioServicio());
            }

        }
    }
}
