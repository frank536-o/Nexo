package app.configuration;

import app.repository.ClienteRepositoryImpl;
import app.service.BilleteraServiceImpl;
import app.service.ClienteServiceImpl;
import app.service.inputport.BilleteraService;
import app.service.inputport.ClienteService;
import app.service.outputport.ClienteRepositoryInterface;
import app.userInterface.UserInterface;
import app.view.ClienteView;


public class Config {
    public static UserInterface createUserInterface() {
        ClienteRepositoryInterface clienteRepositoryInterface = new ClienteRepositoryImpl();
        ClienteService clienteService = new ClienteServiceImpl(clienteRepositoryInterface);
        BilleteraService billeteraService =new BilleteraServiceImpl();
        ClienteView clienteView = new ClienteView(clienteService, billeteraService);
        return new UserInterface(clienteView);
    }
}
