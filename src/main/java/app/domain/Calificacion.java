package app.domain;

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
    //Getter and setter

    public Integer getIdCalifiacion() {
        return idCalifiacion;
    }

    public void setIdCalifiacion(Integer idCalifiacion) {
        this.idCalifiacion = idCalifiacion;
    }

    public Double getPuntCalificacion() {
        return puntCalificacion;
    }

    public void setPuntCalificacion(Double puntCalificacion) {
        this.puntCalificacion = puntCalificacion;
    }

    public String getComentCalificacion() {
        return comentCalificacion;
    }

    public void setComentCalificacion(String comentCalificacion) {
        this.comentCalificacion = comentCalificacion;
    }

    public Date getFechaCalificacion() {
        return fechaCalificacion;
    }

    public void setFechaCalificacion(Date fechaCalificacion) {
        this.fechaCalificacion = fechaCalificacion;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    // Metodo vacio sin argumentos

    public void createCalificacion(){

    }
    // Metodo vacio con argumentos

    public void selectCalificacionById(int id){

    }

    public void selectAllCalificacion(){

    }

    public void updateCalificacion(){

    }

    public void deleteCalificacion(int id){

    }
}
