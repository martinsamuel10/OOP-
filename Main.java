class Buku{
    String judul;
    String pengarang;
    double harga;

    //membuat konstruktor
    Buku(String judul, String  pengarang, double harga ){
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;

    }

    //method tanpa return dan parameter
    void Buku(){
        System.out.println("Judul : "+ this.judul);
        System.out.println("Pengarang : "+ this.pengarang);
        System.out.println("Harga : "+ this.harga);

    }
}

public class Main{
    public static void main(String[] args){
        //membuat object
        Buku buku1 = new Buku("Harry Potter","J.K Rowling",300000);
        Buku buku2 = new Buku("UML","Ivar Jacobson",400000);

        //memanggil object
        buku1.Buku();
        buku2.Buku();
    
    }
}