
public class Item {
	private static String uniqueID;
	private static String[] attributes;
	private static double minBid;
	
	//Constructor that will store the necessary characteristics all item must have in the local variables.
	public Item (String uniqueID, String[] attributes, double minBid){
		this.uniqueID = uniqueID;
		this.attributes = attributes;
		this.minBid = minBid;
	}

	public static String getUniqueID(){
		return uniqueID;
	}
	
	public static String[] getAttributes(){
		return attributes;
	}
	
	public static double getMinBid(){
		return minBid;
	}
}
