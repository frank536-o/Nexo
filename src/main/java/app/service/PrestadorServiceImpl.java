package app.service;

import app.domain.Billetera;
import app.domain.Prestador;
import app.service.inputport.PrestadorService;
import app.service.outputport.PrestadorRepositoryInterface;

import java.util.Date;
import java.util.List;

public class PrestadorServiceImpl implements PrestadorService {

    private final PrestadorRepositoryInterface prestadorRepositoryInterface;

    public PrestadorServiceImpl(PrestadorRepositoryInterface PrestadorRepositoryInterface) {
        this.prestadorRepositoryInterface= PrestadorRepositoryInterface;
    }

    @Override
    public Prestador createPrestador(int id, String docType, String name, String lastName, String phone,
                                     String email, String address, String password, Date birthdate, Billetera billetera, String role,
                                     String descripPerfil, Integer serviciosRealizados) {
        Prestador nuevoPrestador= new Prestador(id, docType, name, lastName, phone, email, address, password, birthdate, billetera, role, descripPerfil, serviciosRealizados);
        return prestadorRepositoryInterface.savePrestador(nuevoPrestador);
    }

    @Override
    public Prestador selectPrestadorById(int id) {return prestadorRepositoryInterface.selectPrestadorById(id);
    }

    @Override
    public List<Prestador> selectAllPrestador() {
        return prestadorRepositoryInterface.selectAllPrestador();
    }

    @Override
    public Prestador updatePrestador(int id, String docType, String name, String lastName, String phone,
                                 String email, String address, String password, Date birthdate, Billetera billetera, String role,
                                 String descripPerfil, Integer serviciosRealizados) {
        return prestadorRepositoryInterface.updatePrestador(id, docType, name, lastName, phone, email, address, password,
                birthdate, billetera, role, descripPerfil, serviciosRealizados);
    }

    @Override
    public void deletedPrestadorById(int id) {
        prestadorRepositoryInterface.deletePrestador(id);

    }
}
