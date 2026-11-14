package app.persistence.repository;

import app.domain.Billetera;
import app.persistence.mapper.RowMapper;
import app.service.outputport.BilleteraRepositoryInterface;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BilleteraRepositoryAdapterDB implements BilleteraRepositoryInterface {

    private final Connection dbConnection;

    private final RowMapper<Billetera> rowMapper;

    public BilleteraRepositoryAdapterDB(Connection dbConnection, RowMapper<Billetera> rowMapper) {
        this.dbConnection = dbConnection;
        this.rowMapper = rowMapper;
    }

    @Override
    public Billetera guardarBilletera(Billetera billetera) {
        String sql = "INSERT INTO billetera (saldo, id_cliente, id_prestador) VALUES (?, ?, ?)";
        try (PreparedStatement ps = dbConnection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setDouble(1, billetera.getSaldo());
            ps.setObject(2, billetera.getId_Cliente());
            ps.setObject(3, billetera.getId_Prestador());
            ps.executeUpdate();

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    billetera.setId_Billetera(rs.getInt(1));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al crear la billetera: " + e.getMessage());
        }
        return billetera;
    }

    @Override
    public Optional<Billetera> selectBilleteraById(int id) {
        String sql = "SELECT * FROM billetera WHERE id_billetera = ?";
        try (PreparedStatement ps = dbConnection.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return Optional.of(rowMapper.mapRow(rs));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al consultar billetera: " + e.getMessage());
        }
        return Optional.empty();
    }

    @Override
    public Optional<Billetera> selectBilleteraByClienteId(int idCliente) {
        String sql = "SELECT * FROM billetera WHERE id_cliente = ?";
        try (PreparedStatement ps = dbConnection.prepareStatement(sql)) {
            ps.setInt(1, idCliente);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return Optional.of(rowMapper.mapRow(rs));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al consultar billetera del cliente: " + e.getMessage());
        }
        return Optional.empty();
    }

    @Override
    public Optional<Billetera> selectBilleteraByPrestadorId(int idPrestador) {
        String sql = "SELECT * FROM billetera WHERE id_prestador = ?";
        try (PreparedStatement ps = dbConnection.prepareStatement(sql)) {
            ps.setInt(1, idPrestador);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return Optional.of(rowMapper.mapRow(rs));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al consultar billetera del prestador: " + e.getMessage());
        }
        return Optional.empty();
    }

    @Override
    public List<Billetera> selectAllBilletera() {
        List<Billetera> billeteras = new ArrayList<>();
        String sql = "SELECT * FROM billetera";
        try (PreparedStatement ps = dbConnection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                billeteras.add(rowMapper.mapRow(rs));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al consultar las billeteras: " + e.getMessage());
        }
        return billeteras;
    }

    @Override
    public Billetera actualizarBilletera(int idBilletera, double nuevoSaldo) {
        String sql = "UPDATE billetera SET saldo = ? WHERE id_billetera = ?";
        try (PreparedStatement ps = dbConnection.prepareStatement(sql)) {
            ps.setDouble(1, nuevoSaldo);
            ps.setInt(2, idBilletera);
            ps.executeUpdate();
            System.out.println("Saldo actualizado correctamente en la BD");
        } catch (SQLException e) {
            throw new RuntimeException("Error al actualizar el saldo: " + e.getMessage());
        }
        return selectBilleteraById(idBilletera).orElse(null);
    }

    @Override
    public void eliminarBilleteraById(int id) {
        String sql = "DELETE FROM billetera WHERE id_billetera = ?";
        try (PreparedStatement ps = dbConnection.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Billetera eliminada de la BD");
        } catch (SQLException e) {
            throw new RuntimeException("Error al eliminar la billetera: " + e.getMessage());
        }
    }
}
