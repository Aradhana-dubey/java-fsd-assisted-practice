package accessModifier;

public class accessModi {
	public void publicMethod() {
        System.out.println("Public method can be accessed from anywhere.");
    }
    private void privateMethod() {
        System.out.println("Private method can only be accessed within this class.");
    }
 protected void protectedMethod() {
        System.out.println("Protected method can be accessed within the same package and by subclasses.");
    }

    void defaultMethod() {
        System.out.println("Default method can be accessed within the same package.");
    }

    public static void main(String[] args) {
    	accessModi Object = new accessModi();

    	Object.publicMethod();

    	Object.privateMethod();

    	Object.protectedMethod();

    	Object.defaultMethod();
    }

}
