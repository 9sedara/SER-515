import java.io.*;
import java.util.Scanner;

public class login {

    public boolean authenticate(String uname, String pwd) throws FileNotFoundException {

        File file0 = new File("data/BuyerInfo.txt");
        File file1 = new File("data/SellerInfo.txt");
        Scanner sc = new Scanner(file0);
        while (sc.hasNextLine()){
            String str= sc.nextLine();
            String strArray[]=str.split(":");
            String u_uname= strArray[0];
            String p_pwd=strArray[1];
            if(u_uname.equals(uname) && pwd.equals(p_pwd))
                return true;
        }
        Scanner sc1 = new Scanner(file1);
        while (sc.hasNextLine()){
            String str= sc1.nextLine();
            String strArray[]=str.split(":");
            String u_uname= strArray[0];
            String p_pwd=strArray[1];
            if(u_uname.equals(uname) && pwd.equals(p_pwd))
                return true;
        }
        return false;
    }
}
