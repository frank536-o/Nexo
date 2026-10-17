package app.repository;

import app.domain.Reserva;
import app.service.outputport.ReservaRepositoryInterface;

import java.util.List;

public class ReservaRepositoryImpl implements ReservaRepositoryInterface {
    @Override
    public Reserva savedReserva() {
        return null;
    }

    @Override
    public Reserva selectReservaById(int id) {
        return null;
    }

    @Override
    public List<Reserva> selectAllReserva() {
        return List.of();
    }

    @Override
    public void deletedReservaById(int id) {
    }

    @Override
    public Reserva updateReserva(Reserva reserva) {
        return null;
    }
}

