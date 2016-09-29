

import java.util.*;

public class AddressBook {
	ArrayList <BuddyInfo>list;
	
	public AddressBook(){
		list = new ArrayList<BuddyInfo>();
		
	}
	
	public void addBuddy(BuddyInfo b){
		list.add(b);
	}
	
	public void removeBuddy(BuddyInfo b){
		list.remove(b);
	}
	
	public BuddyInfo getB(int index){
		return list.get(index);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuddyInfo x1, x2, x3;
		AddressBook temp = new AddressBook();
		
		x1 = new BuddyInfo("Osama", "4000", 446);
		x2 = new BuddyInfo("Rachid", "3000", 992);
		x3 = new BuddyInfo("Atta", "2000", 343);
		
		temp.addBuddy(x1); 
		temp.addBuddy(x2); 
		temp.addBuddy(x3); 
		
		
		System.out.println("Hello " + temp.getB(2).getName() + "!");
		
	}

}
