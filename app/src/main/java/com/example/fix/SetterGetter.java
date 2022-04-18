package com.example.fix;

public class SetterGetter {
    String judul;
    String gambarnya;

    public SetterGetter(String judul,String gambarnya){
        this.judul=judul;
        this.gambarnya=gambarnya;


    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getGambarnya() {
        return gambarnya;
    }

    public void setGambarnya(String gambarnya) {
        this.gambarnya = gambarnya;
    }


}
