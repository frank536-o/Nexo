package app.service.outputport;

import app.domain.Prestador;
import app.domain.Servicio;

import java.util.List;

public interface ServicioRepositoryInterface{

    Servicio savedServicio(Servicio servicio);

    Servicio selectServicioById(int id);

    List<Servicio> selectAllServicio();

    Servicio updateServicio(Integer idServicio, String nombreServicio, String descripServcio,
                            Double precioServicio, Prestador prestador);

    void deleteServicio(int id);

}
