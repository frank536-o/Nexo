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
}
