package app.service.outputport;

import app.domain.Servicio;

import java.util.List;

public interface ServicioRepositoryInterface {
    Servicio savedServicio();

    Servicio selectServicioById(int id);

    List<Servicio> selectAllServicio();

    void deletedServicioById(int id);

    Servicio updateServicio(Servicio servicio);
}
