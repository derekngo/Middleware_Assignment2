import java.util.ArrayList;


public class Brokers {
	ArrayList <String> itemList = new ArrayList<String>();
	
	public boolean isItemInList(String item){
		if(itemList.contains(item)){
			return true;
		}else{
			return false;
		}
	}
	
	public void update(){
		//updates list of items
	};
}
