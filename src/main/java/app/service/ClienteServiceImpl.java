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
        Cliente nuevoCliente= new Cliente(id, docType, name, lastName, phone, email, address, password, birthdate, role, cantServicios);
        return clienteRepositoryInterface.saveCliente(nuevoCliente);
    }

    @Override
    public Cliente selectClienteById(int id) {
        return clienteRepositoryInterface.selectClienteById(id).orElse(null);
    }

    @Override
    public List<Cliente> selectAllCliente() {

        return clienteRepositoryInterface.selectAllCliente();
    }

    @Override
    public Cliente actualizarCliente(int id, String docType, String name, String lastName, String phone,
                                     String email, String address, String password, Date birthdate, String role) {
        Cliente cliente = new Cliente (id,docType,name,lastName,phone,email,address,password,birthdate,role);
        return clienteRepositoryInterface.actualizarCliente(id, cliente);
    }


    @Override
    public void  eliminarClienteById(int id) {
        clienteRepositoryInterface.eliminarCliente(id);

    }

    @Override
    public boolean iniciarSesionCliente(String email, String password) {
        return clienteRepositoryInterface.iniciarSesionCliente(email,password);
    }
}
