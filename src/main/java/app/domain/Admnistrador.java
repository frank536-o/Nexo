package app.domain;

import java.util.Date;

public class Admnistrador extends Usuario{

    private String role;

    public Admnistrador(int id, String docType, String name, String lasName, String phone,
                        String email, String address, String password, Date birthdate,
                        String role) {
        super(id, docType, name, lasName, phone, email, address, password, birthdate);
        this.role = role;
    }

    //Getter and Setters


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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
