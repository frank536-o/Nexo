package app.service;

import app.domain.Billetera;
import app.domain.Cliente;
import app.service.inputport.ClienteService;
import app.service.outputport.ClienteRepositoryInterface;

import java.util.Date;
import java.util.List;

public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepositoryInterface clienteRepositoryInterface;

    public ClienteServiceImpl(ClienteRepositoryInterface clienteRepositoryInterface) {
        this.clienteRepositoryInterface = clienteRepositoryInterface;
    }

    @Override
    public Cliente createCliente(int id, String docType, String name, String lastName, String phone, String email, String address, String password, Date birthdate, Billetera billetera, String role, Integer cantServicios) {
        Cliente nuevoCliente= new Cliente(id, docType, name, lastName, phone, email, address, password, birthdate, billetera, role, cantServicios);
        return clienteRepositoryInterface.saveCliente(nuevoCliente);
    }

    @Override
    public Cliente selectClienteById(int id) {
        return clienteRepositoryInterface.selectClienteById(id);
    }

    @Override
    public List<Cliente> selectAllCliente() {
        return clienteRepositoryInterface.selectAllCliente();
    }

    @Override
    public Cliente updateCliente(int id, String docType, String name, String lastName, String phone, String email, String address, String password, Date birthdate, Billetera billetera, Integer cantServicios) {
        return clienteRepositoryInterface.updateCliente(id, docType,name, lastName,phone,email,address,password,birthdate,billetera,cantServicios);
    }

    @Override
    public void deletedClienteById(int id) {
        clienteRepositoryInterface.deleteCliente(id);

    }
}
