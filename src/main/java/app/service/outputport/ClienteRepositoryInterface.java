package app.service.outputport;

import app.domain.Cliente;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ClienteRepositoryInterface {

    public Cliente saveCliente(Cliente cliente);

    public List<Cliente> selectAllCliente();

    public Optional<Cliente> selectClienteById(int id);
    public Cliente actualizarCliente(int id, String docType, String name, String lastName, String phone,
                                     String email, String address, String password, Date birthdate, String role);

    public void deleteCliente(int id);


    public boolean iniciarSesionCliente(String email, String password);
}
