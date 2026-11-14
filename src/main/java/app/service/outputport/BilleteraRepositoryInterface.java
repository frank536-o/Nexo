package app.service.outputport;

import app.domain.Billetera;

import java.util.List;
import java.util.Optional;

public interface BilleteraRepositoryInterface {
    Billetera guardarBilletera( Billetera billetera);

    public Optional<Billetera> selectBilleteraById(int id);
    public Optional<Billetera> selectBilleteraByClienteId(int id_Cliente);
    public Optional<Billetera> selectBilleteraByPrestadorId(int id_Prestador);
    public List<Billetera> selectAllBilletera();
    public Billetera actualizarBilletera(int idBilletera, double nuevoSaldo);
    public void eliminarBilleteraById(int id);

}
