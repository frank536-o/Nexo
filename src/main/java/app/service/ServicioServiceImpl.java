package app.service;

import app.domain.Billetera;

import app.domain.Prestador;
import app.domain.Servicio;
import app.service.inputport.ServicioService;
import app.service.outputport.ServicioRepositoryInterface;

import java.util.Date;
import java.util.List;

public class ServicioServiceImpl implements  ServicioService {

    private final ServicioRepositoryInterface servicioRepositoryInterface;

    public ServicioServiceImpl(ServicioRepositoryInterface servicioRepositoryInterface) {
        this.servicioRepositoryInterface = servicioRepositoryInterface;
    }

    @Override
    public Servicio createServicio(Integer idServicio, String nombreServicio, String descripServcio,
                                   Double precioServicio, Prestador prestador) {
        Servicio nuevoServicio = new Servicio(idServicio, nombreServicio, descripServcio, precioServicio, prestador);
        return servicioRepositoryInterface.savedServicio(nuevoServicio);
    }

    @Override
    public Servicio selectServicioById(int id) {
        return servicioRepositoryInterface.selectServicioById(id);
    }

    @Override
    public List<Servicio> selectAllServicio() {
        return servicioRepositoryInterface.selectAllServicio();
    }

    @Override
    public Servicio updateServicio(Integer idServicio, String nombreServicio, String descripServcio, Double precioServicio, Prestador prestador) {
        return null;
    }

    @Override
    public void deletedServicio(int id) {
        servicioRepositoryInterface.deleteServicio(id);

    }



}

