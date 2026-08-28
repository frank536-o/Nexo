package domain;

import java.util.Date;

public class Calificacion {

    private Integer idCalifiacion;
    private Double puntCalificacion;
    private String comentCalificacion;
    private Date fechaCalificacion;
    private Reserva reserva;
    private Usuario usuario;

    // Constructores
    public Calificacion(Integer idCalifiacion, Double puntCalificacion, String comentCalificacion,
                        Date fechaCalificacion, Reserva reserva, Usuario usuario) {
        this.idCalifiacion = idCalifiacion;
        this.puntCalificacion = puntCalificacion;
        this.comentCalificacion = comentCalificacion;
        this.fechaCalificacion = fechaCalificacion;
        this.reserva = reserva;
        this.usuario = usuario;
    }
}
