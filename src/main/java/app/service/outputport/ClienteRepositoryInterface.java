package app.service.outputport;

import app.domain.Billetera;
import app.domain.Cliente;

import java.util.Date;
import java.util.List;

public interface ClienteRepositoryInterface {

    Cliente saveCliente(Cliente cliente);

    List<Cliente> selectAllCliente();

    Cliente selectClienteById(int id);

    Cliente updateCliente(int id, String docType, String name, String lastName, String phone, String email, String address, String password, Date birthdate, Billetera billetera, Integer cantServicios);

    void deleteCliente(int id);


}
