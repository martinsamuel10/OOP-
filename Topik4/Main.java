package com.Topik4;

class Buku {
    private String judul, pengarang;
    private double harga;

    public Buku(String judul, String pengarang, double harga) {

        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;

    }

    // method set dan get judul
    public void setJudul() {

        this.judul = judul;

    }

    public String getJudul() {

        return judul;

    }

    //method set dan get pengarang
    public void setPengarang() {

        this.pengarang = pengarang;

    }

    public String getPengarang() {

        return pengarang;

    }

    //method set dan get harga
    public void  setHarga() {

        this.harga = harga;

    }

    public double getHarga() {

        return harga;

    }

    //DISPLAY
    public void print() {
        //tampilan output
        System.out.println("Judul : " + getJudul() + "\n" + "Pengarang : " + getPengarang() + "\n" + "Harga : " + getHarga() + "\n");
    
    }


}

public class Main {
    public static void main(String[] args) {
        //Nilai buku
        Buku buku1 = new Buku("Harry Potter", "J.K. Rowling",300000);
        Buku buku2 = new Buku("UML","Ivar Jacobson",400000);

        //output nilai buku
        buku1.print();
        buku2.print();
    }
}
