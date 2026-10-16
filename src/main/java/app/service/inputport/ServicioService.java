package app.service.inputport;

import app.domain.Cliente;
import app.domain.Servicio;

import java.util.Date;
import java.util.List;

public interface ServicioService {

    public Servicio createServicio(Integer idReserva, Date fechaSolicitudReserva, Date fechaRserva, String horaReserva,
                                   Double precioReserva, String estadoReserva, Cliente cliente, Servicio servicio) ;
    public Servicio selectServicioById(int id);
    public List<Servicio> selectAllServicio();
    public Servicio updateServicio(Integer idReserva, Date fechaSolicitudReserva, Date fechaRserva, String horaReserva,
                                   Double precioReserva, String estadoReserva, Cliente cliente, Servicio servicio) ;
    public void deletedServicioById(int id);
}
