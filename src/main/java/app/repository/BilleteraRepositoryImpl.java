package app.repository;

import app.domain.Billetera;
import app.service.outputport.BilleteraRepositoryInterface;

import java.util.List;

public class BilleteraRepositoryImpl implements BilleteraRepositoryInterface {
    @Override
    public Billetera savedBilletera() {
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
    public void deletedBilleteraById(int id) {
    }

    @Override
    public Billetera updateBilletera(Billetera billetera) {
        return null;
    }
}
