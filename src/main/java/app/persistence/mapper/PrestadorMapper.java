package app.persistence.mapper;

import app.domain.Prestador;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PrestadorMapper implements RowMapper<Prestador>{

        @Override
        public Prestador mapRow(ResultSet rs) throws SQLException {

            Prestador prestador = new Prestador ();
            prestador.setId(rs.getInt("id_prestador"));
            prestador.setDocType(rs.getString("doc_type"));
            prestador.setName(rs.getString("name"));
            prestador.setLastName(rs.getString("last_name"));
            prestador.setPhone(rs.getString("phone"));
            prestador.setEmail(rs.getString("email"));
            prestador.setAddress(rs.getString("address"));
            prestador.setPassword(rs.getString("password"));
            prestador.setBirthdate(rs.getDate("birthday"));
            prestador.setRole(rs.getString("role"));
            prestador.setDescripPerfil(rs.getString("descrip_perfil"));
            prestador.setServiciosRealizados(rs.getInt("servicios_realizados"));

            return prestador;
        }
    }
