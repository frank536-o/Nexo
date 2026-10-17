package app.service.outputport;

import java.util.List;

public interface ClienteRepositoryInterface {
    ClienteRepositoryInterface saveCliente(ClienteRepositoryInterface clienteRepositoryInterface);

    List<ClienteRepositoryInterface> selectAllClienteRepositoryInterface();

    ClienteRepositoryInterface selectClienteRepositoryInterfaceById(int id);

    ClienteRepositoryInterface updateClienteRepositoryInterface(ClienteRepositoryInterface clienteRepositoryInterface);

    void deletedAClienteRepositoryInterface(int id);
}
