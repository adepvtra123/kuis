package com.example.kuismobileprograming;

public class keluarga {
    private String nama, anggota;
    private Integer foto;
    public keluarga(String nama, String anggota, Integer foto) {
        this.nama = nama;
        this.anggota = anggota;
        this.foto = foto;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAnggota() {
        return anggota;
    }

    public void setAnggota(String anggota) {
        this.anggota = anggota;
    }

    public Integer getFoto () {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }

}
