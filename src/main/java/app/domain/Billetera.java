package app.domain;

public class Billetera {

    private Integer idBilletera;
    private Integer idOwner;
    private Double saldo;

    // Constructores

    public Billetera(Integer idBilletera, Integer idOwner, Double saldo) {
        this.idBilletera = idBilletera;
        this.idOwner = idOwner;
        this.saldo = saldo;
    }

    //Getter and setter

    public Integer getIdBilletera() {
        return idBilletera;
    }

    public void setIdBilletera(Integer idBilletera) {
        this.idBilletera = idBilletera;
    }

    public Integer getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(Integer idOwner) {
        this.idOwner = idOwner;
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
