package app.service.inputport;


import app.domain.Billetera;
import app.domain.Calificacion;
import app.domain.Reserva;
import app.domain.Usuario;

import java.util.Date;
import java.util.List;

public interface CalificacionService {

    public Calificacion createCalificacion(Integer idCalifiacion, Double puntCalificacion, String comentCalificacion,
                                           Date fechaCalificacion, Reserva reserva, Usuario usuario) ;
    public Calificacion selectCalificacionById(int id);
    public List<Calificacion> selectAllCalificacion();
    public Calificacion updateCalificacion(Integer idCalifiacion, Double puntCalificacion, String comentCalificacion,
                                           Date fechaCalificacion, Reserva reserva, Usuario usuario) ;
    public void deletedCalificacionById(int id);
}
