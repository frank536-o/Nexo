package app.repository;

import app.domain.Billetera;
import app.domain.Cliente;
import app.service.outputport.ClienteRepositoryInterface;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClienteRepositoryImpl implements ClienteRepositoryInterface{

    private final List<Cliente> clientes = new ArrayList<>();


    @Override
    public Cliente saveCliente(Cliente cliente){
        clientes.add(cliente);
        return cliente;
    }


    @Override
    public List<Cliente> selectAllCliente() {
        return clientes;
    }

    @Override
    public Cliente selectClienteById(int id) {
        return clientes.get(id);
    }

    @Override
    public Cliente updateCliente(int id, String docType, String name, String lastName, String phone, String email, String address, String password, Date birthdate, Billetera billetera, Integer cantServicios) {
        return null;
    }

    @Override
    public void deleteCliente(int id) {
        clientes.remove(id);
    }
}
