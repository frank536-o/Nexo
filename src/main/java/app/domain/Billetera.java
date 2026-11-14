package app.domain;

public class Billetera {

    private Integer id_Billetera;
    private Integer id_Cliente;
    private Integer id_Prestador;
    private Double saldo;

    // Constructores

    public Billetera(Integer id_Billetera, Integer id_Cliente, Integer id_Prestador, Double saldo) {
        this.id_Billetera = id_Billetera;
        this.id_Cliente= id_Cliente;
        this.id_Prestador= id_Prestador;
        this.saldo = saldo;
    }

    public Billetera() {

    }

    //Getter and setter

    public Integer getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(Integer id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public Integer getId_Prestador() {
        return id_Prestador;
    }

    public void setId_Prestador(Integer id_Prestador) {
        this.id_Prestador = id_Prestador;
    }

    public Integer getId_Billetera() {
        return id_Billetera;
    }

    public void setId_Billetera(Integer id_Billetera) {
        this.id_Billetera = id_Billetera;
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

    public void actualizarBilletera(){

    }

    public void eliminarBilletera(int id){

    }
}
