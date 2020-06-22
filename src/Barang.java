public class Barang extends Toko {
    public Barang(String id, String nama, double harga, Integer stok){
        System.out.print(id+" | ");
        System.out.print(nama +" | ");
        System.out.print(harga +" | ");
        System.out.println(stok);
    }

    public void id_nama(){
        System.out.println("---------Tampil ID dan Nama----------");
        System.out.println("ID Barang | Nama Barang");
    }
    public void id_harga(){
        System.out.println("--------Tampil ID dan Harga----------");
        System.out.println("ID Barang | Harga");
    }
    public void id_stok(){
        System.out.println("---------Tampil ID dan Stok----------");
        System.out.println("ID Barang | Stok");
    }
}
