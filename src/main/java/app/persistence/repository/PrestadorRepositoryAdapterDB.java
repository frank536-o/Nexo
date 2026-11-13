package app.persistence.repository;

import app.domain.Billetera;
import app.domain.Cliente;
import app.domain.Prestador;
import app.persistence.mapper.RowMapper;
import app.service.outputport.PrestadorRepositoryInterface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class PrestadorRepositoryAdapterDB implements PrestadorRepositoryInterface {


    private final Connection dbConnetion;

    private final RowMapper rowMapper;

    public PrestadorRepositoryAdapterDB(Connection dbConnetion, RowMapper rowMapper){
        this.dbConnetion = dbConnetion;
        this.rowMapper = rowMapper;
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
        List<Prestador> prestadores = new ArrayList<>();
        String sql= "SELECT * FROM prestador";
        try (PreparedStatement ps = dbConnetion.prepareStatement(sql)) {
            ResultSet rs= ps.executeQuery();

            while (rs.next()){
                prestadores.add((Prestador)rowMapper.mapRow(rs));
            }

        }
        catch (SQLException e){
            throw new RuntimeException("Error al consultar los Prestadores" + e.getMessage());
        }
        return prestadores;
    }

    @Override
    public Optional<Prestador> selectPrestadorById(int id) {
        String sql= "SELECT * FROM prestador WHERE id_prestador = ?";

        try (PreparedStatement ps = dbConnetion.prepareStatement(sql)) {
            ps.setInt(1,id);
            ResultSet rs= ps.executeQuery();

            if (rs.next()){
                return Optional.of((Prestador)rowMapper.mapRow(rs));
            }

        }
        catch (SQLException e){
            throw new RuntimeException("Error al consultar el Prestador" + e.getMessage());
        }

        return Optional.empty();

    }

    @Override
    public Prestador actualizarPrestador(int id, Prestador prestador) {
        String sql = "UPDATE prestador SET doc_type = ?, name = ?, last_name = ?, phone = ?, email = ?, address = ?, password = ?, descrip_perfil = ? WHERE id_prestador = ?";

        try (PreparedStatement ps = dbConnetion.prepareStatement(sql)) {
            ps.setString(1, prestador.getDocType());
            ps.setString(2, prestador.getName());
            ps.setString(3, prestador.getLastName());
            ps.setString(4, prestador.getPhone());
            ps.setString(5, prestador.getEmail());
            ps.setString(6, prestador.getAddress());
            ps.setString(7, prestador.getPassword());
            ps.setString(8, prestador.getDescripPerfil());
            ps.setInt(9, id);

            ps.executeUpdate();
            System.out.println("Se actualizaron los datos del Prestador en la BD");
        } catch (SQLException e) {
            throw new RuntimeException("Error al actualizar el Prestador: " + e.getMessage());
        }
        return prestador;
    }
    @Override
    public void eliminarPrestador(int id) {
        String sql= "DELETE FROM prestador WHERE id_prestador = ?";

        try (PreparedStatement ps = dbConnetion.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Se elimino el Prestador de la BD");

        }
        catch (SQLException e){
            throw new RuntimeException("No se pudo eliminar el Prestador en BD" + e.getMessage());
        }

    }


    @Override
    public boolean iniciarSesionPrestador(String email, String password) {
        String sql = "SELECT * FROM prestador WHERE email = ? AND password = ?";

        try (PreparedStatement ps = dbConnetion.prepareStatement(sql)) {
            ps.setString(1, email);
            ps.setString(2, password);

            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al iniciar sesión: " + e.getMessage());
        }

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
}
