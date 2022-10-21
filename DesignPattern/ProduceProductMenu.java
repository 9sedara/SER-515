import java.io.File;

import java.io.*;
import java.util.Scanner;

public class ProduceProductMenu implements ProductMenu {

	public void showMenu() {
		File file = new File("data/ProductInfo.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		System.out.println("ProduceProductMenu");
		while (sc.hasNextLine()){
			String str= sc.nextLine();
			String strArray[]=str.split(":");
			String nameProduct= strArray[0];
			String itemProduct= strArray[1];
			if(nameProduct.equals("Produce"))
				System.out.println(strArray[1]);

	}}
	public void showAddButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public void showViewButton() {

	}

	public void showComboxes() {

	}

}
