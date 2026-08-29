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
    //Getter and setter

    public Integer getIdPago() {
        return idPago;
    }

    public void setIdPago(Integer idPago) {
        this.idPago = idPago;
    }

    public Double getMontoPago() {
        return montoPago;
    }

    public void setMontoPago(Double montoPago) {
        this.montoPago = montoPago;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Billetera getBilletera() {
        return billetera;
    }

    public void setBilletera(Billetera billetera) {
        this.billetera = billetera;
    }

    // Metodo vacio sin argumentos

    public void createPago(){

    }
    // Metodo vacio con argumentos

    public void selectPagoById(int id){

    }

    public void selectAllPago(){

    }

    public void updatePago(){

    }

    public void deletePago(int id){

    }
}
