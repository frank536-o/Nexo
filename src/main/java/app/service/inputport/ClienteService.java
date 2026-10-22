package app.service.inputport;

import app.domain.Billetera;
import app.domain.Cliente;

import java.util.Date;
import java.util.List;

public interface ClienteService {

    public Cliente createCliente(int id, String docType, String name, String lastName, String phone,
                                 String email, String address, String password, Date birthdate, Billetera billetera,
                                 String role, Integer cantServicios);
    public Cliente selectClienteById(int id);
    public List<Cliente> selectAllCliente();
    public Cliente updateCliente(int id, String docType, String name, String lastName, String phone,
                                 String email, String address, String password, Date birthdate, Billetera billetera,
                                 Integer cantServicios);
    public void deletedClienteById(int id);

}
