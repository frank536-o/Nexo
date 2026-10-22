package app.service.outputport;

import app.domain.Billetera;
import app.domain.Prestador;

import java.util.Date;
import java.util.List;

public interface PrestadorRepositoryInterface {

    Prestador savePrestador(Prestador prestador);

    List<Prestador> selectAllPrestador();

    Prestador selectPrestadorById(int id);

    Prestador updatePrestador(int id, String docType, String name, String lastName, String phone,
                                                                    String email, String address, String password, Date birthdate, Billetera billetera, String role,
                                                                    String descripPerfil, Integer serviciosRealizados);

    void deletePrestador(int id);
}
