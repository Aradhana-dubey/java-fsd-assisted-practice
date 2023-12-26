package maps;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class mapExample {

	    public static void main(String[] args) {
	        Map<String, Integer> studentScores = new HashMap<>();

	        studentScores.put("Prashanth", 90);
	        studentScores.put("Shubham", 85);
	        studentScores.put("hrithik", 95);

	        System.out.println("Student Scores:");
	        Set<String> studentNames = studentScores.keySet();
	        for (String name : studentNames) {
	            System.out.println(name + ": " + studentScores.get(name));
	        }

	        String searchName = "Shubham";
	        if (studentScores.containsKey(searchName)) {
	            System.out.println("\n" + searchName + "'s score: " + studentScores.get(searchName));
	        } else {
	            System.out.println("\n" + searchName + " not found in the student scores.");
	        }

	        String updateName = "Prashanth";
	        int newScore = 95;
	        if (studentScores.containsKey(updateName)) {
	            studentScores.put(updateName, newScore);
	            System.out.println("\nUpdated " + updateName + "'s score to " + newScore);
	        } else {
	            System.out.println("\n" + updateName + " not found in the student scores.");
	        }

	        System.out.println("\nUpdated Student Scores:");
	        for (String name : studentNames) {
	            System.out.println(name + ": " + studentScores.get(name));
	        }
	    }
	

}
