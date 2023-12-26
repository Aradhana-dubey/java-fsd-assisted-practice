package regularExpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularExp {

	    public static void main(String[] args) {
	        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

	        String[] testEmails = {
	            "user@example.com",
	            "user.name@domain.co",
	            "user@123.com",
	            "invalid.email",
	            "user@domain",
	            "@example.com"
	        };

	        Pattern pattern = Pattern.compile(emailRegex);

	        for (String email : testEmails) {
	            Matcher matcher = pattern.matcher(email);
	            boolean isValid = matcher.matches();
	            System.out.println(email + " is " + (isValid ? "valid" : "invalid"));
	        }
	    }
	

}
