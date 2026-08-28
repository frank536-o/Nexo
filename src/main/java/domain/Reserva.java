package domain;

import java.util.Date;

public class Reserva {

    private Integer idReserva;
    private Date fechaSolicitudReserva;
    private Date fechaRserva;
    private String horaReserva;
    private Double precioReserva;
    private String estadoReserva;
    private Cliente cliente;
    private Servicio servicio;

    // Constructores

    public Reserva(Integer idReserva, Date fechaSolicitudReserva, Date fechaRserva, String horaReserva,
                   Double precioReserva, String estadoReserva, Cliente cliente, Servicio servicio) {
        this.idReserva = idReserva;
        this.fechaSolicitudReserva = fechaSolicitudReserva;
        this.fechaRserva = fechaRserva;
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
        return fechaRserva;
    }

    public void setFechaRserva(Date fechaRserva) {
        this.fechaRserva = fechaRserva;
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
}
