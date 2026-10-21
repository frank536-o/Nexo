package app.service;

import app.domain.Billetera;
import app.service.inputport.BilleteraService;

import java.util.List;

public class BilleteraServiceImpl implements BilleteraService {
    @Override
    public Billetera createBilletera(Integer idBilletera, Integer idOwner, Double saldo) {
        return null;
    }

    @Override
    public Billetera selectBilleteraById(int id) {
        return null;
    }

    @Override
    public List<Billetera> selectAllBilletera() {
        return List.of();
    }

    @Override
    public Billetera updateBilletera(Integer idBilletera, Double saldo) {
        return null;
    }

    @Override
    public void deletedBilleteraById(int id) {

    }
}
