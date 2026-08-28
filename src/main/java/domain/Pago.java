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

}
