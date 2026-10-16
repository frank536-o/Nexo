package app.service.inputport;

import app.domain.Billetera;
import app.domain.Reserva;

import java.util.Date;
import java.util.List;

public interface PagoService {

    public PagoService createPagoService(Integer idPago, Double montoPago, Date fechaPago, String metodoPago,
                                         String estadoPago, Reserva reserva, Billetera billetera) ;
    public PagoService selectPagoServiceById(int id);
    public List<PagoService> selectAllPagoService();
    public PagoService updatePagoService(Integer idPago, Double montoPago, Date fechaPago, String metodoPago,
                                         String estadoPago, Reserva reserva, Billetera billetera) ;
    public void deletedPagoServiceById(int id);
}
