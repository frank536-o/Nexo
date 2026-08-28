package domain;

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
}
