public class Gudang extends Toko {
    public Gudang(){
        System.out.println("----------------GUDANG---------------");
        System.out.println("ID Barang | Nama Barang | Harga | Qty");
    }
    public String getId_barang(){
        return id_barang;
    }
    public void setId_barang(String id_barang){
        this.id_barang = id_barang;
    }
    public String getNama_barang(){
        return nama_barang;
    }
    public void setNama_barang(String nama_barang){
        this.nama_barang = nama_barang;
    }
    public Double getHarga(){
        return harga;
    }
    public void setHarga(Double harga){
        this.harga = harga;
    }
    public Integer getStok(){
        return stok;
    }
    public void setStok(Integer stok){
        this.stok = stok;
    }
}
