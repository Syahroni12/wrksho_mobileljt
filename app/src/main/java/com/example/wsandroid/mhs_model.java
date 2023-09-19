package com.example.wsandroid;

public class mhs_model {
    private  String nama_mhs;
    private int foto_mhs;

    public mhs_model(String nama_mhs, int foto_mhs) {
        this.nama_mhs = nama_mhs;
        this.foto_mhs = foto_mhs;
    }

    public String getNama_mhs() {
        return nama_mhs;
    }

    public void setNama_mhs(String nama_mhs) {
        this.nama_mhs = nama_mhs;
    }

    public int getFoto_mhs() {
        return foto_mhs;
    }

    public void setFoto_mhs(int foto_mhs) {
        this.foto_mhs = foto_mhs;
    }
}
