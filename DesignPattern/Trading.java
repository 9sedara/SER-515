import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;


public class Trading {

	private Product p;

	private OfferingList offerList;
	public void Bidvalue(String item) throws FileNotFoundException
	{
		System.out.println("Visitor design Pattern");
		int result=0;
		File file=new File("data/UserProduct.txt");
		Scanner sc=new Scanner(file);
		while(sc.hasNextLine())
		{
			String st[]=sc.nextLine().split(":");
			if(st[1].equals(item))
			{
				result++;

			}
		}
		System.out.println(result+" users have ordered this item");
	}



	public void accept(NodeVisitor visitor) {

	}

}
