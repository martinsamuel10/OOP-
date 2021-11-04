class Barang {
	String idProduk;
	String nama;
	double harga;

	// membuat konstruktornya
	Barang(String inputId, String inputNama, double inputHarga){
		this.idProduk = inputId;
		this.nama = inputNama;
		this.harga = inputHarga;
	}

	// method tanpa menggunakan return dan parameter
	void Barang(){
		System.out.println("ID : "+ this.idProduk);
		System.out.println("Nama : "+ this.nama);
		System.out.println("Harga : "+ this.harga);
	}
} 


public class Java {
	public static void main(String[] args){
		// membuat object
		Barang barang1 = new Barang("BRG-001","Tas Gucci",1200);
		Barang barang2 = new Barang("BRG-002","Printer Epson L355",200);
		Barang barang3 = new Barang("BRG-003","Koper",150);
		Barang barang4 = new Barang("BRG-004","Helm",20);

		// memanggil objectnya
		barang1.Barang();
		double totalHarga = barang1.harga + barang3.harga;
		totalHarga = totalHarga + barang4.harga;
		System.out.println("Total Harga : "+ totalHarga);
	}
}
