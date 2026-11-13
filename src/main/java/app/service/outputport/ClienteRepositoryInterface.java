package app.service.outputport;

import app.domain.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteRepositoryInterface {

    public Cliente saveCliente(Cliente cliente);

    public List<Cliente> selectAllCliente();

    public Optional<Cliente> selectClienteById(int id);
    public Cliente actualizarCliente(int id, Cliente cliente);
    public void eliminarCliente(int id);


    public boolean iniciarSesionCliente(String email, String password);
}
