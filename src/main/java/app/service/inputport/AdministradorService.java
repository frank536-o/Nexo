package app.service.inputport;

import app.domain.Admnistrador;
import app.domain.Billetera;
import app.domain.Cliente;

import java.util.Date;
import java.util.List;

public interface AdministradorService {

    public Admnistrador createAdministrador(int id, String docType, String name, String lasName, String phone,
                                            String email, String address, String password, Date birthdate, Billetera billetera,
                                            String role);
    public Admnistrador selectAdministradorById(int id);
    public List<Admnistrador> selectAllAdministrador();
    public Admnistrador updateAdministrador(int id, String docType, String name, String lasName, String phone,
                                            String email, String address, String password, Date birthdate, Billetera billetera,
                                            String role);
    public void deletedAdministradorById(int id);

    void createAdministrador(int id, String docType, String name, String lastName, String phone, String email, String address, String password, Date birthDate);
}
