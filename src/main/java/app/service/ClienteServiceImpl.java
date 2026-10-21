package app.service;

import app.domain.Billetera;
import app.domain.Cliente;
import app.service.inputport.ClienteService;

import java.util.Date;
import java.util.List;

public class ClienteServiceImpl implements ClienteService {
    @Override
    public Cliente createCliente(int id, String docType, String name, String lasName, String phone, String email, String address, String password, Date birthdate, Billetera billetera, String role, Integer cantServicios) {
        return null;
    }

    @Override
    public Cliente selectClienteById(int id) {
        return null;
    }

    @Override
    public List<Cliente> selectAllCliente() {
        return List.of();
    }

    @Override
    public Cliente updateCliente(int id, String docType, String name, String lasName, String phone, String email, String address, String password, Date birthdate, Billetera billetera, Integer cantServicios) {
        return null;
    }

    @Override
    public void deletedClienteById(int id) {

    }
}
