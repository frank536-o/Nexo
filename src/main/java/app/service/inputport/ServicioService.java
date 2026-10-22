package app.service.inputport;

import app.domain.Cliente;
import app.domain.Prestador;
import app.domain.Servicio;

import java.util.Date;
import java.util.List;

public interface ServicioService {

    public Servicio createServicio(Integer idServicio, String nombreServicio, String descripServcio,
                                   Double precioServicio, Prestador prestador) ;
    public Servicio selectServicioById(int id);
    public List<Servicio> selectAllServicio();
    public Servicio updateServicio(Integer idServicio, String nombreServicio, String descripServcio,
                                   Double precioServicio, Prestador prestador) ;
    public void deletedServicio(int id);
}
