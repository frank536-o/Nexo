package app.service.outputport;

import app.domain.Cliente;

import java.util.List;

public interface ClienteRepositoryInterface {
    Cliente saveCliente(Cliente cliente);

    List<Cliente> selectAllCliente();

    Cliente selectClienteById(int id);

    Cliente updateCliente(Cliente cliente);

    void deleteCliente(int id);
}
