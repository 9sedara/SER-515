import java.io.*;
import java.util.Scanner;

public class login {

    public boolean authenticate(String uname, String pwd) throws FileNotFoundException {
        File file1 = new File("C:\\Users\\dell\\Downloads\\gitclone\\SER-515\\DesignPattern\\data\\BuyerInfo.txt");
        File file2 = new File("C:\\Users\\dell\\Downloads\\gitclone\\SER-515\\DesignPattern\\data\\SellerInfo.txt");
        Scanner sc = new Scanner(file1);
        while (sc.hasNextLine()){
            String str= sc.nextLine();
            String strArray[]=str.split(":");
            String uuname= strArray[0];
            String ppwd=strArray[1];
            if(uuname.equals(uname) && pwd.equals(ppwd))
                return true;
        }
        Scanner sc2 = new Scanner(file2);
        while (sc.hasNextLine()){
            String str= sc2.nextLine();
            String strArray[]=str.split(":");
            String uuname= strArray[0];
            String ppwd=strArray[1];
            if(uuname.equals(uname) && pwd.equals(ppwd))
                return true;
        }
        return false;
    }
}
