import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Facade {

	private int userType;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	private Person thePerson;

	public void beginFacade() throws IOException {
		System.out.println("Implementing Facade");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User_Name:");
		String uname = sc.next();
		System.out.println("Enter Password:");
		String pwd = sc.next();
		login obj = new login();
		boolean rt = obj.authenticate(uname, pwd);
		if (rt == true) {
			System.out.println("Successful");
			System.out.println("Implementing Factory");
			System.out.println("Implementing Bridge");
			Scanner sc1 = new Scanner(System.in);
			System.out.println("enter product choice:\n 1. meat \n 2. produce");
			String choose = sc.next();
			if (choose.equals("1")) {
				MeatProductMenu mp = new MeatProductMenu();
				mp.showMenu();
			} else if (choose.equals("2")) {
				ProduceProductMenu pp = new ProduceProductMenu();
				pp.showMenu();
			}
			System.out.println("Implementing Itrerator");
			System.out.println("");
			ProductIterator pi = new ProductIterator();
			pi.hasNext();

			System.out.println("dish you like to order:");
			String dish=sc1.next();
			Trading t=new Trading();
			t.Bidvalue(item);

		}


			else

			System.out.println("Not_Successful");
		}

	public void login() {
	}

	public void addTrading() {

	}

	public void viewTrading() {

	}

	public void decideBidding() {

	}

	public void discussBidding() {

	}

	public void submitBidding() {

	}

	public void remind() {

	}

	public void createUser(UserInfoItem userinfoitem) {

	}

	public void createProductList() {

	}

	public void AttachProductToUser() {

	}

	public void SelectProduct() {

	}

	public void productOperation() {

	}

}
