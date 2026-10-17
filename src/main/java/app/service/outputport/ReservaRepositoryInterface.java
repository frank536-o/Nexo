package app.service.outputport;

import app.domain.Reserva;

import java.util.List;

public interface ReservaRepositoryInterface {
    Reserva savedReserva();

    Reserva selectReservaById(int id);

    List<Reserva> selectAllReserva();

    void deletedReservaById(int id);

    Reserva updateReserva(Reserva reserva);
}
