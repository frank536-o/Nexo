package domain;

public class Billetera {

    private Integer idBilletera;
    private Double saldo;

    // Constructores

    public Billetera(Integer idBilletera, Double saldo) {
        this.idBilletera = idBilletera;
        this.saldo = saldo;

    }
    //Getter and setter

    public Integer getIdBilletera() {
        return idBilletera;
    }

    public void setIdBilletera(Integer idBilletera) {
        this.idBilletera = idBilletera;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
