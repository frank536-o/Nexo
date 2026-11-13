package app.domain;

import java.util.Date;

public class Cliente extends Usuario{

    private Integer cantServicios;

    public Cliente(int id, String docType, String name, String lastName, String phone,
                   String email, String address, String password, Date birthdate, String role,
                   Integer cantServicios) {
        super(id, docType, name, lastName, phone, email, address, password, birthdate,null,role);
        this.cantServicios = cantServicios;
    }

    public Cliente(int id,String docType, String name, String lastName, String phone, String email, String address, String password, Date birthdate, String role) {
        super(id, docType,name,lastName,phone,email,address,password,birthdate,null,role);

    }

    public Cliente() {}

    //Getter and Setters

    public Integer getCantServicios() {
        return cantServicios;
    }

    public void setCantServicios(Integer cantServicios) {
        this.cantServicios = cantServicios;
    }

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
