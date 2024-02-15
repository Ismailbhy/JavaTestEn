package collectionFramework;
import java.util.ArrayList;

public class ArrarList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> food=new ArrayList<>();
		food.add("Apple");
		food.add("Banana");
		food.add("Orange");
		food.set(0, "Pizza");
		food.remove(1);
		food.clear();
		
		for(int i=0;i<food.size();i++) {
			System.out.println(food.get(i));
		}

	}

}
