package app.service.outputport;

import app.domain.Billetera;

import java.util.List;

public interface BilleteraRepositoryInterface {
    Billetera savedBilletera();

    Billetera selectBilleteraById(int id);

    List<Billetera> selectAllBilletera();

    void deletedBilleteraById(int id);

    Billetera updateBilletera(Billetera billetera);
}
