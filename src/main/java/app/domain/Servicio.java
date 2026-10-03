package app.domain;

public class Servicio {

    private Integer idServicio;
    private String nombreServicio;
    private String descripServcio;
    private Double precioServicio;
    private Prestador prestador;

    // Constructores

    public Servicio(Integer idServicio, String nombreServicio, String descripServcio,
                    Double precioServicio, Prestador prestador) {
        this.idServicio = idServicio;
        this.nombreServicio = nombreServicio;
        this.descripServcio = descripServcio;
        this.precioServicio = precioServicio;
        this.prestador = prestador;
    }
    //Getter and setter

    public Integer getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Integer idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public String getDescripServcio() {
        return descripServcio;
    }

    public void setDescripServcio(String descripServcio) {
        this.descripServcio = descripServcio;
    }

    public Double getPrecioServicio() {
        return precioServicio;
    }

    public void setPrecioServicio(Double precioServicio) {
        this.precioServicio = precioServicio;
    }

    public Prestador getPrestador() {
        return prestador;
    }

    public void setPrestador(Prestador prestador) {
        this.prestador = prestador;
    }

    // Metodo vacio sin argumentos

    public void createServicio(){

    }
    // Metodo vacio con argumentos

    public void selectServicioById(int id){

    }

    public void selectAllServicio(){

    }

    public void updateServicio(){

    }

    public void deleteServicio(int id){

    }
}
