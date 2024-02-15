package collectionFramework;
import java.util.ArrayList;

public class DArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<String>> foodlist=new ArrayList();
		
		ArrayList<String> BakeryList=new ArrayList<>();
		BakeryList.add("Bread");
		BakeryList.add("Cake");
		BakeryList.add("DONUTS");
		System.out.println(BakeryList.get(0));
		
		ArrayList<String> ProduceList=new ArrayList<>();
		ProduceList.add("TOMATO");
		ProduceList.add("Egg");
		ProduceList.add("milk");
		System.out.println(ProduceList.get(0));
		
		ArrayList<String> DrinkList=new ArrayList<>();
		DrinkList.add("Tea");
		DrinkList.add("Coffee");
		DrinkList.add("Juice");
		System.out.println(DrinkList.get(0));
		
		foodlist.add(BakeryList);
		foodlist.add(ProduceList);
		foodlist.add(DrinkList);
		
		System.out.println(foodlist.get(2).get(1));
		
		System.out.println(foodlist);
		

	}

}
