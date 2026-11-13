package app.configuration;

import app.domain.Cliente;
import app.domain.Prestador;
import app.persistence.dbconnection.DataBaseConnection;
import app.persistence.mapper.ClienteMapper;
import app.persistence.mapper.PrestadorMapper;
import app.persistence.mapper.RowMapper;
import app.persistence.repository.ClienteRepositoryAdapterDB;
import app.persistence.repository.PrestadorRepositoryAdapterDB;
import app.service.BilleteraServiceImpl;
import app.service.ClienteServiceImpl;
import app.service.PrestadorServiceImpl;
import app.service.inputport.BilleteraService;
import app.service.inputport.ClienteService;
import app.service.inputport.PrestadorService;
import app.service.outputport.ClienteRepositoryInterface;
import app.service.outputport.PrestadorRepositoryInterface;
import app.userInterface.UserInterface;
import app.view.ClienteView;
import app.view.PrestadorView;

import java.sql.Connection;


public class Config {
    public static UserInterface createUserInterface() {
        Connection connection = DataBaseConnection.getInstance().getConnection();

        RowMapper<Cliente> rowMapperCliente = new ClienteMapper();
        ClienteRepositoryInterface clienteRepositoryInterface = new ClienteRepositoryAdapterDB(connection, rowMapperCliente);
        ClienteService clienteService = new ClienteServiceImpl(clienteRepositoryInterface);
        BilleteraService billeteraService =new BilleteraServiceImpl();
        ClienteView clienteView = new ClienteView(clienteService, billeteraService);
        RowMapper<Prestador> rowMapperPrestador = new PrestadorMapper();
        PrestadorRepositoryInterface prestadorRepositoryInterface = new PrestadorRepositoryAdapterDB(connection,rowMapperPrestador);
        PrestadorService prestadorService = new PrestadorServiceImpl(prestadorRepositoryInterface);
        PrestadorView prestadorView = new PrestadorView(prestadorService, billeteraService);
        return new UserInterface(clienteView, prestadorView);

    }
}
