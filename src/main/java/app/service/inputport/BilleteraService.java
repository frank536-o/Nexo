package app.service.inputport;

import app.domain.Billetera;

import java.util.List;

public interface BilleteraService {

    public Billetera createBilletera(Integer idBilletera,Double saldo);

    public Billetera selectBilleteraById(int id);
    public List<Billetera> selectAllBilletera();
    public Billetera actualizarBilletera(Integer idBilletera, Double saldo) ;
    public void eliminarBilleteraById(int id);

    Billetera createBilleteraCliente(Integer idCliente, double Saldo);

    Billetera createBilleteraPrestador(Integer idPrestador, double Saldo);

}

