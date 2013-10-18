import java.util.Scanner;


public class Seller {
	private Brokers parentBroker;
	private String sellerID;
	
	public void addItem(){
		String item;
		
		System.out.println("What is the name of your item");
		Scanner input = new Scanner(System.in); 
		item = input.next();
		while (parentBroker.isItemInList(item)){
			System.out.println("There already exists an item with that name, please enter another name");
			item = input.next();
		}
		
	
	}
		
}
