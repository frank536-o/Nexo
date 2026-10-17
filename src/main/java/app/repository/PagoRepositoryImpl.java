package app.repository;

import app.domain.Pago;
import app.service.outputport.PagoRepositoryInterface;

import java.util.List;

public class PagoRepositoryImpl implements PagoRepositoryInterface {
    @Override
    public Pago savedPago() {
        return null;
    }

    @Override
    public Pago selectPagoById(int id) {
        return null;
    }

    @Override
    public List<Pago> selectAllPago() {
        return List.of();
    }

    @Override
    public void deletedPagoById(int id) {
    }

    @Override
    public Pago updatePago(Pago pago) {
        return null;
    }
}

