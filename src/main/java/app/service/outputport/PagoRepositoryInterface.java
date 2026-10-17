package app.service.outputport;

import app.domain.Pago;

import java.util.List;

public interface PagoRepositoryInterface {
    Pago savedPago();

    Pago selectPagoById(int id);

    List<Pago> selectAllPago();

    void deletedPagoById(int id);

    Pago updatePago(Pago pago);
}
