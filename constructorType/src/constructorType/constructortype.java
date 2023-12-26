package constructorType;

public class constructortype {

    public constructortype() {
        System.out.println("Default constructor called.");
    }

    public constructortype(int value) {
        System.out.println("Parameterized constructor called with value: " + value);
    }

    public constructortype(String name, int age) {
        this(); 
        System.out.println("Constructor chaining example - Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        constructortype defaultConstructorExample = new constructortype();

    	constructortype parameterizedConstructorExample = new constructortype(42);

    	constructortype chainingConstructorExample = new constructortype("Prashanth", 25);
    }


}
