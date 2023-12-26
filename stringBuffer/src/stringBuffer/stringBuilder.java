package stringBuffer;

public class stringBuilder {

	 public static void main(String[] args) {
	        String originalString = "Hello, World!";

	        StringBuffer stringBuffer = new StringBuffer(originalString);
	        System.out.println("String to StringBuffer conversion:");
	        System.out.println("Original String: " + originalString);
	        System.out.println("StringBuffer: " + stringBuffer);

	        StringBuilder stringBuilder = new StringBuilder(originalString);
	        System.out.println("\nString to StringBuilder conversion:");
	        System.out.println("Original String: " + originalString);
	        System.out.println("StringBuilder: " + stringBuilder);
	    }

}
