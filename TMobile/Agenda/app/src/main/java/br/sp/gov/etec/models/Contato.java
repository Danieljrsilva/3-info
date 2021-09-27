package br.sp.gov.etec.models;

import com.google.gson.annotations.SerializedName;

public class Contato {
    //atributos
    private int ID;
    private String nome;
    private String email;

    @SerializedName("telefone")
    private long tel;

    @SerializedName("celular")
    private long cel;

    //get e set
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public long getCel() {
        return cel;
    }

    public void setCel(long cel) {
        this.cel = cel;
    }
}
