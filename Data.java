package com.Topik2;

import java.util.ArrayList;

class Jurusan {
    private String kode,nama;
    private ArrayList<Mahasiswa> mahasiswa;

    Jurusan(String kode, String nama){
        this.kode = kode;
        this.nama = nama;
        mahasiswa = new ArrayList<>();
    }

    void addMH(Mahasiswa mahasiswa){
        this.mahasiswa.add(mahasiswa);

    }

    public String getKode(){
        return kode;
    }

    public String getNama(){
        return nama;
    }

    public ArrayList<Mahasiswa>getMahasiswa(){
        return mahasiswa;
    }
}

class Mahasiswa {
    private String nim,nama;

    Mahasiswa(String nim, String nama){
        this.nim = nim;
        this.nama = nama;
    }

    public String getNim(){
        return nim;
    }

    public String getNama(){
        return nama;
    }
}


public class Data {
    public static void main(String[] args) {
        Jurusan rpla = new Jurusan ("D3IF","RPLA");

        Mahasiswa mahasiswa1 = new Mahasiswa("6706204004","Martin");
        rpla.addMH(mahasiswa1);
        Mahasiswa mahasiswa2 = new Mahasiswa("6706204001","Chaca");
        rpla.addMH(mahasiswa2);
        Mahasiswa mahasiswa3 = new Mahasiswa("6706204002","Agus");
        rpla.addMH(mahasiswa3);
        System.out.println(rpla.getKode()+ " "+rpla.getNama());
        for (Mahasiswa mahasiswa:rpla.getMahasiswa()){
            System.out.println(mahasiswa.getNim()+" - "+ mahasiswa.getNama());
        }

        System.out.println();

        Jurusan si= new Jurusan("D3SI","Sistem Informasi");

        Mahasiswa mahasiswa4= new Mahasiswa("6706200100","Dea");
        si.addMH(mahasiswa4);
        Mahasiswa mahasiswa5= new Mahasiswa("6706200101","Ucup");
        si.addMH(mahasiswa5);
        Mahasiswa mahasiswa6= new Mahasiswa("6706200102","Ijat");
        si.addMH(mahasiswa6);
        System.out.println(si.getKode()+" "+si.getNama());
        for (Mahasiswa mahasiswa:si.getMahasiswa()
        ) {
            System.out.println(mahasiswa.getNim()+" - "+mahasiswa.getNama());
        }


    }
}
