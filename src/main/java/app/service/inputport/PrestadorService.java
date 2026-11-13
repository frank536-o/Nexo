package app.service.inputport;

import app.domain.Billetera;
import app.domain.Prestador;

import java.util.Date;
import java.util.List;

public interface PrestadorService {

    public Prestador createPrestador(int id, String docType, String name, String lastName, String phone,
                                     String email, String address, String password, Date birthdate, Billetera billetera, String role,
                                     String descripPerfil, Integer serviciosRealizados);
    public Prestador selectPrestadorById(int id);
    public List<Prestador> selectAllPrestador();
    public Prestador actualizarPrestador(int id, String docType, String name, String lastName, String phone,
                                         String email, String address, String password, Date birthdate,
                                         String role, String descripPerfil);
    public void eliminarPrestadorById(int id);

    boolean iniciarSesionPrestador(String email, String password);
}

