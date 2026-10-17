package app.repository;

import app.service.outputport.ClienteRepositoryInterface;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepositoryImpl implements ClienteRepositoryInterface {
    List<ClienteRepositoryInterface> owners = new ArrayList<>();


    @Override
    public ClienteRepositoryInterface saveCliente(ClienteRepositoryInterface clienteRepositoryInterface){

        owners.add(clienteRepositoryInterface);

        return clienteRepositoryInterface;
    }


    @Override
    public List<ClienteRepositoryInterface> selectAllClienteRepositoryInterface() {

        return owners;
    }

    @Override
    public ClienteRepositoryInterface selectClienteRepositoryInterfaceById(int id) {
        return null;
    }

    @Override
    public ClienteRepositoryInterface updateClienteRepositoryInterface(ClienteRepositoryInterface clienteRepositoryInterface) {
        return null;
    }

    @Override
    public void deletedAClienteRepositoryInterface(int id) {

    }
}
