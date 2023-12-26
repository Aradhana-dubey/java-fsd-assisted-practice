package callingMethod;

public class callingMtd {

	 public void simpleMethod() {
	        System.out.println("This is a simple method with no parameters and no return value.");
	    }

	    public void methodWithParameters(int a, int b) {
	        int sum = a + b;
	        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
	    }

	    public int add(int x, int y) {
	        return x + y;
	    }

	    public static void staticMethod() {
	        System.out.println("This is a static method.");
	    }

	    public static void main(String[] args) {
	    	callingMtd example = new callingMtd();

	        example.simpleMethod();

	        example.methodWithParameters(5, 7);

	        int result = example.add(10, 20);
	        System.out.println("Result of addition: " + result);

	        staticMethod();  

	        example.staticMethod();
	    }

}
