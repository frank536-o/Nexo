package app.service;

import app.domain.Billetera;
import app.domain.Cliente;
import app.domain.Prestador;
import app.service.inputport.PrestadorService;
import app.service.outputport.PrestadorRepositoryInterface;

import java.util.Date;
import java.util.List;

public class PrestadorServiceImpl implements PrestadorService {

    private final PrestadorRepositoryInterface prestadorRepositoryInterface;

    public PrestadorServiceImpl(PrestadorRepositoryInterface PrestadorRepositoryInterface) {
        this.prestadorRepositoryInterface = PrestadorRepositoryInterface;
    }

    @Override
    public Prestador createPrestador(int id, String docType, String name, String lastName, String phone,
                                     String email, String address, String password, Date birthdate, Billetera billetera, String role,
                                     String descripPerfil, Integer serviciosRealizados) {
        Prestador nuevoPrestador = new Prestador(id, docType, name, lastName, phone, email, address, password, birthdate, role, descripPerfil, serviciosRealizados);
        return prestadorRepositoryInterface.savePrestador(nuevoPrestador);
    }

    @Override
    public Prestador selectPrestadorById(int id) {
        return prestadorRepositoryInterface.selectPrestadorById(id).orElse(null);
    }


    @Override
    public List<Prestador> selectAllPrestador() {
        return prestadorRepositoryInterface.selectAllPrestador();
    }

    @Override
    public Prestador actualizarPrestador(int id, String docType, String name, String lastName, String phone,
                                         String email, String address, String password, Date birthdate, String role,
                                         String descripPerfil) {
        Prestador prestador = new Prestador (id,docType,name,lastName,phone,email,address,password,birthdate,role,descripPerfil);
        return prestadorRepositoryInterface.actualizarPrestador(id, prestador);
    }

    @Override
    public void eliminarPrestadorById(int id) {
        prestadorRepositoryInterface.eliminarPrestador(id);

    }

    @Override
    public boolean iniciarSesionPrestador(String email, String password) {
        return prestadorRepositoryInterface.iniciarSesionPrestador(email, password);
    }
}

