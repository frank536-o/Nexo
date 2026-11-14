package app.persistence.mapper;

import app.domain.Billetera;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BilleteraMapper implements RowMapper<Billetera>{
    @Override
    public Billetera mapRow(ResultSet rs) throws SQLException {

        Billetera billetera = new Billetera();
        billetera.setId_Billetera(rs.getInt("id_billetera"));
        billetera.setId_Cliente((Integer) rs.getObject("id_cliente"));
        billetera.setId_Prestador((Integer) rs.getObject("id_prestador"));
        billetera.setSaldo(rs.getDouble("saldo"));
        return billetera;
    }
}