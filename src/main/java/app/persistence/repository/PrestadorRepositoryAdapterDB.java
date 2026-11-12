/*package app.persistence.repository;

import app.domain.Billetera;
import app.domain.Prestador;
import app.service.outputport.PrestadorRepositoryInterface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class PrestadorRepositoryAdapterDB implements PrestadorRepositoryInterface {


    /*private final Connection dbConnetion;

    PrestadorRepositoryAdapterDB(Connection dbConnetion){
        this.dbConnetion = dbConnetion;
    }


    @Override
    public Prestador savePrestador(Prestador prestador) {

        String sql = "INSERT INTO prestador( id_prestador, doc_type, name, last_name, phone, email, address, password, birthday, role, descrip_perfil, servicios_realizados)VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        try(PreparedStatement ps= dbConnetion.prepareStatement(sql)) {
            setPrestadorParams(ps, prestador);
            ps.executeUpdate();
            System.out.println("Se Registro Prestador en la base de datos");
        }
        catch (SQLException e){
            throw new RuntimeException("No se pudo crear el prestador" + e.getMessage());
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

    private void setPrestadorParams(PreparedStatement ps, Prestador prestador) throws SQLException{
        ps.setInt(1,prestador.getId());
        ps.setString(2, prestador.getDocType());
        ps.setString(3, prestador.getName());
        ps.setString(4, prestador.getLastName());
        ps.setString(5, prestador.getPhone());
        ps.setString(6, prestador.getEmail());
        ps.setString(7, prestador.getAddress());
        ps.setString(8, prestador.getPassword());
        ps.setDate(9, new java.sql.Date(prestador.getBirthdate().getTime()));
        ps.setString(10, prestador.getRole());
        ps.setString(11, prestador.getDescripPerfil());
        ps.setInt(12, prestador.getServiciosRealizados());
    }
}*/
