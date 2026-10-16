package app.service.inputport;

import app.domain.Admnistrador;
import app.domain.Billetera;

import java.util.Date;
import java.util.List;

public interface BilleteraService {

    public Billetera createBilletera(Integer idBilletera, Double saldo) ;
    public Billetera selectBilleteraById(int id);
    public List<Billetera> selectAllBilletera();
    public Billetera updateBilletera(Integer idBilletera, Double saldo) ;
    public void deletedBilleteraById(int id);
}
