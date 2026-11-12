package app.domain;

import java.util.Date;

public class Reserva {

    private Integer idReserva;
    private Date fechaSolicitudReserva;
    private Date fechaReserva;
    private String horaReserva;
    private Double precioReserva;
    private String estadoReserva;
    private Cliente cliente;
    private Servicio servicio;

    // Constructores

    public Reserva(Integer idReserva, Date fechaSolicitudReserva, Date fechaReserva, String horaReserva,
                   Double precioReserva, String estadoReserva, Cliente cliente, Servicio servicio) {
        this.idReserva = idReserva;
        this.fechaSolicitudReserva = fechaSolicitudReserva;
        this.fechaReserva = fechaReserva;
        this.horaReserva = horaReserva;
        this.precioReserva = precioReserva;
        this.estadoReserva = estadoReserva;
        this.cliente = cliente;
        this.servicio = servicio;
    }
    //Getter and setter

    public Integer getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

    public Date getFechaSolicitudReserva() {
        return fechaSolicitudReserva;
    }

    public void setFechaSolicitudReserva(Date fechaSolicitudReserva) {
        this.fechaSolicitudReserva = fechaSolicitudReserva;
    }
    public Date getFechaRserva() {
        return fechaReserva;
    }

    public void setFechaRserva(Date fechaRserva) {
        this.fechaReserva = fechaRserva;
    }

    public String getHoraReserva() {
        return horaReserva;
    }

    public void setHoraReserva(String horaReserva) {
        this.horaReserva = horaReserva;
    }

    public Double getPrecioReserva() {
        return precioReserva;
    }

    public void setPrecioReserva(Double precioReserva) {
        this.precioReserva = precioReserva;
    }

    public String getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(String estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    // Metodo vacio con argumentos

    public void selectReservaById(int id){

    }

    public void selectAllReserva(){

    }

    public void updateReserva(){

    }

    public void deleteReserva(int id ){

    }
}
