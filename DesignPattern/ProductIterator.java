import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProductIterator {

	private ClassProductList classProductList;

	public boolean hasNext() {
		File file = new File("data/UserProduct.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
		} catch (
				FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		while (sc.hasNextLine()){
			System.out.println(sc.nextLine());
		}
		return false;
	}


	public Product Next() {
		return null;
	}

	public void MoveToHead() {

	}

	public void Remove() {

	}

}
