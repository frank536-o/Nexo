package app.repository;

import app.domain.Servicio;
import app.service.outputport.ServicioRepositoryInterface;

import java.util.List;

public class ServicioRepositoryImpl implements ServicioRepositoryInterface {
    @Override
    public Servicio savedServicio() {
        return null;
    }

    @Override
    public Servicio selectServicioById(int id) {
        return null;
    }

    @Override
    public List<Servicio> selectAllServicio() {
        return List.of();
    }

    @Override
    public void deletedServicioById(int id) {
    }

    @Override
    public Servicio updateServicio(Servicio servicio) {
        return null;
    }
}

