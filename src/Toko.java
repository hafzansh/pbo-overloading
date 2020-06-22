public class Toko {
    String status,username,password;
    String id_barang,nama_barang;
    Double harga,total;
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
    public void showLogin(){
        System.out.println("Username : " + getUsername());
        System.out.println("Password : " + getPassword());
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
        System.out.println(qty +" | ");
    }

    public void pembelian(String id,double harga,Integer qty,double total){
        System.out.print(id+" | ");
        System.out.print(harga +" | ");
        System.out.print(qty +" | ");
        System.out.println(stok);
    }
}
