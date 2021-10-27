package Assesment;

public class Main {
    public static void main(String[] args){
        //Asuransi dan Dropship
        PengirimanBarang barang1 = new PengirimanBarang(1, "N0001", "JNE", 21000, "Dropship1", "Surabaya", "Bejo", "DayeuhKolot", true, true, 40000);
        
	//Asuransi
	PengirimanBarang barang2 = new PengirimanBarang(2, "N0003", "J&T", 21000, "Eiger", "Bandung Kopo", "Tini", "DayeuhKolot", true, 40000);
        
	//Normal
	PengirimanBarang barang3 = new PengirimanBarang(3, "N0004", "Pos Indonesia", 23000, "Eiger", "Bandung Kopo", "Bambang","DayeuhKolot");
        
	//Dropship
	PengirimanBarang barang4 = new PengirimanBarang(4, "N0002", "Si Cepat", 24000, "Dropship2", "Pontianak", "Joko","DayeuhKolot", true);
    }
}