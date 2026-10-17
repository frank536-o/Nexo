package app.service.outputport;

import app.domain.Calificacion;

import java.util.List;

public interface CalificacionRepositoryInterface {
    Calificacion savedCalificacion();

    Calificacion selectCalificacionById(int id);

    List<Calificacion> selectAllCalificacion();

    void deletedCalificacionById(int id);

    Calificacion updateCalificacion(Calificacion calificacion);
}
