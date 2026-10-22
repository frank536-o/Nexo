package app.domain;

import java.util.Date;

public class Prestador extends Usuario {
    //atributos
    private String descripPerfil;
    private Integer serviciosRealizados;

    //Constructores

    public Prestador(int id, String docType, String name, String lastName, String phone,
                     String email, String address, String password, Date birthdate, Billetera billetera, String role,
                     String descripPerfil, Integer serviciosRealizados) {
        super(id, docType, name, lastName, phone, email, address, password, birthdate, billetera, role);
        this.descripPerfil = descripPerfil;
        this.serviciosRealizados = serviciosRealizados;

    }

    //Getter and Setters

    public String getDescripPerfil() {
        return descripPerfil;
    }

    public void setDescripPerfil(String descripPerfil) {
        this.descripPerfil = descripPerfil;
    }

    public Integer getServiciosRealizados() {
        return serviciosRealizados;
    }

    public void setServiciosRealizados(Integer serviciosRealizados) {
        this.serviciosRealizados = serviciosRealizados;
    }

    //metodos

    @Override
    public void create() {
        super.create();
    }

    @Override
    public void selectById(int id) {
        super.selectById(id);
    }

    @Override
    public void selectAll() {
        super.selectAll();
    }

    @Override
    public void update() {
        super.update();
    }

    @Override
    public void delete(int id) {
        super.delete(id);
    }

}
