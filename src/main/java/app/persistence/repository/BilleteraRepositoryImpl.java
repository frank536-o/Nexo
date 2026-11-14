package app.persistence.repository;

import app.domain.Billetera;
import app.service.outputport.BilleteraRepositoryInterface;

import java.util.List;
import java.util.Optional;

public class BilleteraRepositoryImpl implements BilleteraRepositoryInterface {
    @Override
    public Billetera guardarBilletera(Billetera billetera) {
        return null;
    }

    @Override
    public Optional<Billetera> selectBilleteraById(int id) {

        return Optional.empty();
    }
    @Override
    public Optional<Billetera> selectBilleteraByClienteId(int id_Cliente) {
        return Optional.empty();
    }

    @Override
    public Optional<Billetera> selectBilleteraByPrestadorId(int id_Prestador){
        return Optional.empty();
    }
    @Override
    public List<Billetera> selectAllBilletera() {
        return List.of();
    }

    @Override
    public void eliminarBilleteraById(int id) {
    }

    @Override
    public Billetera actualizarBilletera(int id_Billetera, double nuevoSaldo) {
        return null;
    }
}
