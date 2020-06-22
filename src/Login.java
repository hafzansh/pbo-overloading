import java.util.Scanner;

public class Login extends Toko {
    public Login(String username, String password){
        String status;
        System.out.println("Login");
        System.out.println("Username : "+username);
        System.out.println("Password : "+password);
        if (username == "Admin") {
            status = "Admin";
        }
        else{
            status = "Guest";
        }
        System.out.println("Status : "+status);

    }
}
