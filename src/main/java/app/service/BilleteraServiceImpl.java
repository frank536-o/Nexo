package app.service;

import app.domain.Billetera;
import app.service.inputport.BilleteraService;
import app.service.outputport.BilleteraRepositoryInterface;

import java.util.List;

public class BilleteraServiceImpl implements BilleteraService {

    private final BilleteraRepositoryInterface billeteraRepository;

    public BilleteraServiceImpl(BilleteraRepositoryInterface billeteraRepository) {
        this.billeteraRepository = billeteraRepository;
    }

    @Override
    public Billetera createBilletera(Integer idBilletera, Double saldo) {
        Billetera billetera = new Billetera(idBilletera, null, null, saldo);
        return billeteraRepository.guardarBilletera(billetera);
    }

    @Override
    public Billetera selectBilleteraById(int id) {
        return billeteraRepository.selectBilleteraById(id).orElse(null);
    }

    @Override
    public List<Billetera> selectAllBilletera() {
        return billeteraRepository.selectAllBilletera();
    }

    @Override
    public Billetera actualizarBilletera(Integer idBilletera, Double saldo) {
        return billeteraRepository.actualizarBilletera(idBilletera, saldo);
    }

    @Override
    public void eliminarBilleteraById(int id) {
        billeteraRepository.eliminarBilleteraById(id);
    }

    @Override
    public Billetera createBilleteraCliente(Integer idCliente, double Saldo) {
        Billetera billetera = new Billetera(null, idCliente, null, Saldo);
        return billeteraRepository.guardarBilletera(billetera);
    }

    @Override
    public Billetera createBilleteraPrestador(Integer idPrestador, double Saldo) {
        Billetera billetera = new Billetera(null, null, idPrestador, Saldo);
        return billeteraRepository.guardarBilletera(billetera);
    }
}
