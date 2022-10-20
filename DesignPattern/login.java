import java.io.*;
import java.util.Scanner;

public class login {

    public boolean authenticate(String uname, String pwd) throws FileNotFoundException {
        File file = new File("C:\\Users\\dell\\Downloads\\gitclone\\SER-515\\DesignPattern\\data\\BuyerInfo.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
        return false;
    }
}
