package app.configuration;

import app.domain.Cliente;
import app.persistence.dbconnection.DataBaseConnection;
import app.persistence.mapper.ClienteMapper;
import app.persistence.mapper.RowMapper;
import app.persistence.repository.ClienteRepositoryAdapterDB;
import app.persistence.repository.ClienteRepositoryImpl;
import app.service.BilleteraServiceImpl;
import app.service.ClienteServiceImpl;
import app.service.inputport.BilleteraService;
import app.service.inputport.ClienteService;
import app.service.outputport.ClienteRepositoryInterface;
import app.userInterface.UserInterface;
import app.view.ClienteView;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Config {
    public static UserInterface createUserInterface() {
        Connection connection = DataBaseConnection.getInstance().getConnection();

        RowMapper<Cliente> rowMapper = new ClienteMapper();
        ClienteRepositoryInterface clienteRepositoryInterface = new ClienteRepositoryAdapterDB(connection, rowMapper);
        ClienteService clienteService = new ClienteServiceImpl(clienteRepositoryInterface);
        BilleteraService billeteraService =new BilleteraServiceImpl();
        ClienteView clienteView = new ClienteView(clienteService, billeteraService);
        return new UserInterface(clienteView);
    }
}
