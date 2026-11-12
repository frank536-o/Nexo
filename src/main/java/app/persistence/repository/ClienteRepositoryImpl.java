package app.persistence.repository;

import app.domain.Cliente;
import app.service.outputport.ClienteRepositoryInterface;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class ClienteRepositoryImpl implements ClienteRepositoryInterface {

    private final List<Cliente> clientes = new ArrayList<>();


    @Override
    public Cliente saveCliente(Cliente cliente) {
        clientes.add(cliente);
        return cliente;
    }


    @Override
    public List<Cliente> selectAllCliente() {
        return clientes;
    }

    @Override
    public Optional<Cliente> selectClienteById(int id) {
        return null;
    }


    @Override
    public Cliente actualizarCliente(int id, String docType, String name, String lastName, String phone,
                                     String email, String address, String password, Date birthdate, String role) {
        return null;
    }


    @Override
    public void deleteCliente(int id) {
        clientes.remove(id);
    }

    @Override
    public boolean iniciarSesionCliente(String email, String password) {
        if (email == null || password == null) return false;

        for (Cliente cliente : clientes) {
            if (email.equalsIgnoreCase(cliente.getEmail()) &&
                    password.equals(cliente.getPassword())) {
                return true;
            }
        }
        return false;
    }
}
