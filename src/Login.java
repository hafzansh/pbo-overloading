
public class Login extends Toko {

    public Login(String username,String password){
        if (username == "Admin") {
            status = "Admin";
        }
        else{
            status = "Guest";
        }
        System.out.println("           Status   : " + status);
    }

    public void alert(){
        System.out.println("------------Login Berhasil-----------");
        System.out.println();
    }
}
