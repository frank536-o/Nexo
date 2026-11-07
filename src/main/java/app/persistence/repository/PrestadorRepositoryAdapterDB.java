package app.persistence.repository;

import app.domain.Billetera;
import app.domain.Calificacion;
import app.domain.Prestador;
import app.service.outputport.PrestadorRepositoryInterface;

import java.sql.Connection;
import java.util.Date;
import java.util.List;

public class PrestadorRepositoryAdapterDB implements PrestadorRepositoryInterface {


    private final Connection dbConnetion;

    PrestadorRepositoryAdapterDB(Connection dbConnetion){
        this.dbConnetion = dbConnetion;


    }


    @Override
    public Prestador savePrestador(Prestador prestador) {

        String sql = "INSERT INTO";

        try {

        }catch (){

        }

        return prestador;
    }

    @Override
    public List<Prestador> selectAllPrestador() {
        return List.of();
    }

    @Override
    public Prestador selectPrestadorById(int id) {
        return null;
    }

    @Override
    public Prestador updatePrestador(int id, String docType, String name, String lastName, String phone, String email, String address, String password, Date birthdate, Billetera billetera, String role, String descripPerfil, Integer serviciosRealizados) {
        return null;
    }

    @Override
    public void deletePrestador(int id) {

    }
}
