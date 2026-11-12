package app.domain;

public class Billetera {

    private Integer idBilletera;
    private Integer idDueno;
    private Double saldo;

    // Constructores

    public Billetera(Integer idBilletera, Integer idDueno, Double saldo) {
        this.idBilletera = idBilletera;
        this.idDueno = idDueno;
        this.saldo = saldo;
    }

    //Getter and setter

    public Integer getIdBilletera() {
        return idBilletera;
    }

    public void setIdBilletera(Integer idBilletera) {
        this.idBilletera = idBilletera;
    }

    public Integer getidDueno() {
        return idDueno;
    }

    public void setidDueno(Integer idDueno) {
        this.idDueno = idDueno;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    // Metodo vacio sin argumentos

    public void createBilletera(){

    }
    // Metodo vacio con argumentos

    public void selectBilleteranById(int id){

    }

    public void selectAllBilletera(){

    }

    public void updateBilletera(){

    }

    public void deleteBilletera(int id){

    }
}
