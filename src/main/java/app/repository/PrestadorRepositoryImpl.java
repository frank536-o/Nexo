package app.repository;

import app.domain.Billetera;
import app.domain.Prestador;
import app.service.outputport.PrestadorRepositoryInterface;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PrestadorRepositoryImpl implements PrestadorRepositoryInterface {

    private final List<Prestador> prestadores = new ArrayList<>();


    @Override
    public Prestador savePrestador(Prestador prestador){
        prestadores.add(prestador);
        return prestador;
    }


    @Override
    public List<Prestador> selectAllPrestador() {return prestadores;}

    @Override
    public Prestador selectPrestadorById(int id) {
        return prestadores.get(id);
    }

    @Override
    public Prestador updatePrestador(int id, String docType, String name, String lastName, String phone,
                                     String email, String address, String password, Date birthdate, Billetera billetera, String role,
                                     String descripPerfil, Integer serviciosRealizados) {
        return null;
    }

    @Override
    public void deletePrestador(int id) {

    }

}
