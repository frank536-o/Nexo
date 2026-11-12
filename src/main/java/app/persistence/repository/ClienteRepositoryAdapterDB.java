package app.persistence.repository;

import app.domain.Cliente;
import app.persistence.mapper.RowMapper;
import app.service.outputport.ClienteRepositoryInterface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class ClienteRepositoryAdapterDB implements ClienteRepositoryInterface {
    
        private final Connection dbConnetion;

        private final RowMapper rowMapper;

        public ClienteRepositoryAdapterDB(Connection dbConnetion, RowMapper rowMapper){
            this.dbConnetion = dbConnetion;
            this.rowMapper = rowMapper;
        }


        @Override
        public Cliente saveCliente(Cliente Cliente) {

            String sql = "INSERT INTO Cliente( id_Cliente, doc_type, name, last_name, phone, email, address, password, birthday, role, cant_servicios)VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            try(PreparedStatement ps= dbConnetion.prepareStatement(sql)) {
                setClienteParams(ps, Cliente);
                ps.executeUpdate();
                System.out.println("Se Registro Cliente en la base de datos");
            }
            catch (SQLException e){
                throw new RuntimeException("No se pudo crear el Cliente" + e.getMessage());
            }

            return Cliente;
        }

        @Override
        public List<Cliente> selectAllCliente() {
            List<Cliente> clientes = new ArrayList<>();
            String sql= "SELECT * FROM cliente";

            try (PreparedStatement ps = dbConnetion.prepareStatement(sql)) {
                ResultSet rs= ps.executeQuery();

                while (rs.next()){
                    clientes.add((Cliente)rowMapper.mapRow(rs));
                }

            }
            catch (SQLException e){
                throw new RuntimeException("Error al consultar los cliente" + e.getMessage());
            }
            return clientes;
        }

        @Override
        public Optional<Cliente> selectClienteById(int id) {
            String sql= "SELECT * FROM cliente WHERE id_cliente = ?";

            try (PreparedStatement ps = dbConnetion.prepareStatement(sql)) {
                ps.setInt(1,id);
                ResultSet rs= ps.executeQuery();

                if (rs.next()){
                    return Optional.of((Cliente)rowMapper.mapRow(rs));
                }

            }
            catch (SQLException e){
                throw new RuntimeException("Error al consultar el cliente" + e.getMessage());
            }

            return Optional.empty();
        }

    @Override
    public Cliente actualizarCliente(int id, String docType, String name, String lastName, String phone, String email, String address, String password, Date birthdate, String role) {

        String sql= "UPDATE Cliente SET name = ?, last_name = ?, phone = ?, email = ?, address = ? WHERE id_Cliente = ?";

        try (PreparedStatement ps = dbConnetion.prepareStatement(sql)) {

        }
        catch (SQLException e){
            throw new RuntimeException("Error al actualizar el cliente" + e.getMessage());
        }
        return null;
    }

    @Override
        public void deleteCliente(int id) {
            String sql= "";

            try (PreparedStatement ps = dbConnetion.prepareStatement(sql)) {

            }
            catch (SQLException e){
                throw new RuntimeException("Error al consultar el cliente" + e.getMessage());
            }

        }

    @Override
    public boolean iniciarSesionCliente(String email, String password) {
        String sql = "SELECT * FROM cliente WHERE email = ? AND password = ?";

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

    private void setClienteParams(PreparedStatement ps, Cliente cliente) throws SQLException{
            ps.setInt(1,cliente.getId());
            ps.setString(2, cliente.getDocType());
            ps.setString(3, cliente.getName());
            ps.setString(4, cliente.getLastName());
            ps.setString(5, cliente.getPhone());
            ps.setString(6, cliente.getEmail());
            ps.setString(7, cliente.getAddress());
            ps.setString(8, cliente.getPassword());
            ps.setDate(9, new java.sql.Date(cliente.getBirthdate().getTime()));
            ps.setString(10, cliente.getRole());
            ps.setInt(11, cliente.getCantServicios());
        }
    }

