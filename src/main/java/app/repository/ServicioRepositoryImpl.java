package app.repository;

import app.domain.Cliente;
import app.domain.Prestador;
import app.domain.Servicio;
import app.service.outputport.ServicioRepositoryInterface;

import java.util.ArrayList;
import java.util.List;

public class ServicioRepositoryImpl implements ServicioRepositoryInterface {

    private final List<Servicio> servicios = new ArrayList<>();

    @Override
    public Servicio savedServicio(Servicio servicio) {
        servicios.add(servicio);
        return servicio;
    }

    @Override
    public Servicio selectServicioById(int id) {
        return servicios.get(id);

    }

    @Override
    public List<Servicio> selectAllServicio() {
        return servicios;
    }

    @Override
    public Servicio updateServicio(Integer idServicio, String nombreServicio, String descripServcio, Double precioServicio, Prestador prestador) {
        return null;
    }

    @Override
    public void deleteServicio(int id) {
        servicios.remove(id);

    }
}

