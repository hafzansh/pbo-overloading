public class Main {
    public static void main(String[] args){

        System.out.println("---------Login---------");

        Toko toko = new Toko();
        toko.setUsername("Admin");
        toko.setPassword("*****");
        toko.showLogin();

        Login login = new Login(toko.getUsername(),toko.getPassword());
        login.alert();
        

        Gudang gudang = new Gudang();
        gudang.setId_barang("M1");
        gudang.setNama_barang("Indomie Goreng");
        gudang.setHarga((double) 2500);
        gudang.setStok(100);

        Barang barang = new Barang(gudang.getId_barang(),gudang.getNama_barang(),gudang.getHarga(),gudang.getStok());
        barang.id_nama();
        toko.tampilBarang(gudang.getId_barang(),gudang.getNama_barang());
        barang.id_harga();
        toko.tampilBarang(gudang.getId_barang(),gudang.getHarga());
        barang.id_stok();
        toko.tampilBarang(gudang.getId_barang(),gudang.getStok());
    }
}
