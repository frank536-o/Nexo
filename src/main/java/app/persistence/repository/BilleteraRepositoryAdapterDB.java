package app.persistence.repository;

import app.domain.Billetera;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class BilleteraRepositoryAdapterDB implements BilleteraRepositoryImpl{

    private final Connection dbConnetion;

    BilleteraRepositoryAdapterDB(Connection dbConnetion){
        this.dbConnetion = dbConnetion;
    }

    @Override
    public Billetera savedBilletera(Billetera billetera) {

        String sql = "INSERT INTO billetera(id_billetera  , id_owner , saldo)VALUES(?,?,?)";

        try(PreparedStatement ps= dbConnetion.prepareStatement(sql)) {

        }catch (SQLException e){
            throw new RuntimeException("No se pudo crear la billetera" + e.getMessage());

        }

        return billetera;
    }



    private void setBilleteraParams(PreparedStatement ps, Billetera billetera) throws SQLException{
        ps.setInt(1,billetera.getIdBilletera());
    }
}
