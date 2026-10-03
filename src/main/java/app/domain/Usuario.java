package app.domain;

import java.util.Date;

public class Usuario {

    //atributos
    private int id;
    private String docType;
    private String name;
    private String lasName;
    private String phone;
    private String email;
    private String address;
    private String password;
    private Date birthdate ;


    //constructores

    public Usuario(){

    }

    public Usuario(int id, String docType, String name, String lasName, String phone,
                   String email, String address, String password, Date birthdate) {
        this.id = id;
        this.docType = docType;
        this.name = name;
        this.lasName = lasName;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.password = password;
        this.birthdate = birthdate;
    }

    //Getter and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }


    //metodo vacio sin argumentos

    public void create(){

    }

    //metodo vacio con argementos

    public void selectById(int id){

    }


    public void selectAll(){

    }

    public void update(){

    }

    public void delete(int id ){

    }



}
