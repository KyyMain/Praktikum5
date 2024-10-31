package IndoApril;
import java.util.Date;

public class main {
    public static void main(String[] args) {
        // Membuat beberapa produk
        elektronik tv = new elektronik("TV", 5000000, 10, 2);
        pakaian kaos = new pakaian("Kaos", 80000, 15, "L", "Merah");
        makanan roti = new makanan("Roti", 5000, 20, new Date());

        // Membuat keranjang belanja
        keranjangBelanja keranjang = new keranjangBelanja();

        // Menambahkan produk ke keranjang
        keranjang.tambahProduk(tv, 1);
        keranjang.tambahProduk(kaos, 2);
        keranjang.tambahProduk(roti, 5);

        // Menampilkan isi keranjang
        keranjang.displayKeranjang();
    }
}
