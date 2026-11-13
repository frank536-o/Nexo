package app.persistence.repository;

import app.domain.Billetera;
import app.domain.Cliente;
import app.domain.Prestador;
import app.service.outputport.PrestadorRepositoryInterface;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

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
    public Optional<Prestador> selectPrestadorById(int id) {
        return null;
    }

    @Override
    public Prestador actualizarPrestador(int id, Prestador prestador) {
        return null;
    }

    @Override
    public void eliminarPrestador(int id) {
        prestadores.remove(id);

    }
    @Override
    public boolean iniciarSesionPrestador(String email, String password) {
        if (email == null || password == null) return false;

        for (Prestador prestador : prestadores) {
            if (email.equalsIgnoreCase(prestador.getEmail()) &&
                    password.equals(prestador.getPassword())) {
                return true;
            }
        }
        return false;
    }

}
