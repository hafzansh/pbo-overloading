public class Toko {
    String status,username,password;
    String id_barang,nama_barang;
    Double harga,total,bayar,kembalian;
    Integer qty,stok;

    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setBayar(double bayar){
        this.bayar = bayar;
    }
    public double getBayar(){
        return bayar;
    }
    public void setQty(Integer qty){
        this.qty = qty;
    }
    public Integer getQty(){
        return qty;
    }
    public void showLogin(){
        System.out.println("           Username : " + getUsername());
        System.out.println("           Password : " + getPassword());
    }

    public void tampilBarang(String id, String nama){
        System.out.print(id+" | ");
        System.out.println(nama +" | ");
    }
    public void tampilBarang(String id, double harga){
        System.out.print(id+" | ");
        System.out.println(harga +" | ");
    }
    public void tampilBarang(String id, Integer stok){
        System.out.print(id+" | ");
        System.out.println(stok +" | ");
    }
    public void struk(){
        System.out.println();
        System.out.println("---------------------Struk Pembelian----------------------");
        System.out.println("Nama Barang    | Harga  |Qty| Total  | Bayar   | Kembalian");
    }
    public void pembelian(String nama_barang,double harga,Integer qty,double bayar){
        System.out.print(nama_barang+" | ");
        System.out.print(harga +" | ");
        System.out.print(qty +" | ");
        total = qty*harga;
        System.out.print(total+" | ");
        System.out.print(bayar+" | ");
        kembalian = bayar-total;
        System.out.println(kembalian);
    }
}
