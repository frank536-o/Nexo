package app.repository;

import app.domain.Calificacion;
import app.service.outputport.CalificacionRepositoryInterface;

import java.util.List;

public class CalificacionRepositoryImpl implements CalificacionRepositoryInterface {
    @Override
    public Calificacion savedCalificacion() {
        return null;
    }

    @Override
    public Calificacion selectCalificacionById(int id) {
        return null;
    }

    @Override
    public List<Calificacion> selectAllCalificacion() {
        return List.of();
    }

    @Override
    public void deletedCalificacionById(int id) {
    }

    @Override
    public Calificacion updateCalificacion(Calificacion calificacion) {
        return null;
    }
}
