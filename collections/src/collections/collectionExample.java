package collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class collectionExample {

	    public static void main(String[] args) {
	        ArrayList<String> fruitName = new ArrayList<>();
	        fruitName.add("Apple");
	        fruitName.add("Banana");
	        fruitName.add("Orange");

	        System.out.println("fruitName elements:");
	        for (String fruit : fruitName) {
	            System.out.println(fruit);
	        }

	        HashMap<Integer, String> languageName = new HashMap<>();
	        languageName.put(1, "Java");
	        languageName.put(2, "Python");
	        languageName.put(3, "C++");

	        System.out.println("\nlanguageName elements:");
	        for (Map.Entry<Integer, String> entry : languageName.entrySet()) {
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }

	        HashSet<String> colorName = new HashSet<>();
	        colorName.add("Red");
	        colorName.add("Green");
	        colorName.add("Blue");

	        System.out.println("\ncolorName elements:");
	        Iterator<String> iterator = colorName.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	

}
