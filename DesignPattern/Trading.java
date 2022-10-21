import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;


public class Trading {

	private Product p;

	private OfferingList offerList;
	public void Bidvalue(String dish) throws FileNotFoundException
	{
		System.out.println("Visitor design Pattern");
		int result=0;
		File file=new File("UseProduct");
		Scanner sc=new Scanner(file);
		while(sc.hasNextLine())
		{
			String st[]=sc.nextLine().split(":");
			if(st[1].equals(dish))
			{
				result++;
				System.out.println("+result+" );
			}
		}
	}



	public void accept(NodeVisitor visitor) {

	}

}
