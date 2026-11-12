package app.persistence.mapper;

import app.domain.Cliente;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteMapper implements RowMapper<Cliente> {

    @Override
    public Cliente mapRow(ResultSet rs) throws SQLException {

        Cliente cliente = new Cliente();

        cliente.setId(rs.getInt("id_cliente"));
        cliente.setDocType(rs.getString("doc_type"));
        cliente.setName(rs.getString("name"));
        cliente.setLastName(rs.getString("last_name"));
        cliente.setPhone(rs.getString("phone"));
        cliente.setEmail(rs.getString("email"));
        cliente.setAddress(rs.getString("address"));
        cliente.setPassword(rs.getString("password"));
        cliente.setBirthdate(rs.getDate("birthday"));
        cliente.setRole(rs.getString("role"));
        cliente.setCantServicios(rs.getInt("cant_servicios"));

        return cliente;
    }
}


