import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MeatProductMenu implements ProductMenu {

	public void showMenu() {
			File file = new File("data/ProductInfo.txt");
			Scanner sc = null;
			try {
				sc = new Scanner(file);
			} catch (FileNotFoundException e) {
				throw new RuntimeException(e);
			}
			System.out.println("MeatProductMenu");
			while (sc.hasNextLine()){
				String str= sc.nextLine();
				String strArray[]=str.split(":");
				String nameProduct= strArray[0];
				String itemProduct= strArray[1];
				if(nameProduct.equals("Meat"))
					System.out.println(strArray[1]);

	}}
	public void showAddButton() {

	}

	public void showViewButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public void showComboxes() {

	}

}
