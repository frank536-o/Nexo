package app.service.outputport;

import app.domain.Cliente;
import app.domain.Prestador;

import java.util.List;
import java.util.Optional;

public interface PrestadorRepositoryInterface {
    public Prestador savePrestador(Prestador prestador);

  public List<Prestador> selectAllPrestador();

    public Optional<Prestador> selectPrestadorById(int id);

    public Prestador actualizarPrestador(int id, Prestador prestador);

    public void eliminarPrestador(int id);

    public boolean iniciarSesionPrestador(String email, String password);

}