package domain;

import java.util.Date;

public class Pago {

    private Integer idPago;
    private Double montoPago;
    private Date fechaPago;
    private String metodoPago;
    private String estadoPago;
    private Reserva reserva;
    private Billetera billetera;

    // Constructores
    public Pago(Integer idPago, Double montoPago, Date fechaPago, String metodoPago,
                String estadoPago, Reserva reserva, Billetera billetera) {
        this.idPago = idPago;
        this.montoPago = montoPago;
        this.fechaPago = fechaPago;
        this.metodoPago = metodoPago;
        this.estadoPago = estadoPago;
        this.reserva = reserva;
        this.billetera = billetera;
    }
}
