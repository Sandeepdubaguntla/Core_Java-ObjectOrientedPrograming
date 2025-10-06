package constructor;
import java.util.Scanner;
public class Login{
    String username;
    String Password;
    public Login(String arg1,String arg2)
    {
        username=arg1;
        Password=arg2;
    }
    public String login(String expUsername,String expPassword){
        // if(Password.equals(expUsername) && username.equals(expPassword)){
        //     System.out.println("Login Successful .... Good Morning");
        // }
        // else{
        //     System.out.println("InCorrect Usernname/Password.");
        // }
        String status="Invalid Username/Password";
        if(username.equals(expUsername) && username.equals(expPassword)){
             status="Login Successfull";
         }
         return status;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       
        Login l =new Login("Manager","Admin@123");
        System.out.println("Enter the Username and Password");
        System.out.println(l.login(sc.nextLine(),sc.nextLine()));
        sc.close();

    }
}