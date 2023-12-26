package innerClass;

public class innerClassExample {
	 private int outerField = 10;
	
	    public class InnerClass {
	        public void display() {
	            System.out.println("InnerClass: outerField = " + outerField);
	        }
	    }

	
	    public static class StaticNestedClass {
	        public void display() {
	            System.out.println("StaticNestedClass");
	        }
	    }

	    public void outerMethod() {
	        int localVar = 5;

	        class LocalInnerClass {
	            public void display() {
	                System.out.println("LocalInnerClass: outerField = " + outerField);
	                System.out.println("LocalInnerClass: localVar = " + localVar);
	            }
	        }

	        LocalInnerClass localInner = new LocalInnerClass();
	        localInner.display();
	    }

	    public void anonymousInnerClassMethod() {
	        Thread thread = new Thread() {
	            @Override
	            public void run() {
	                System.out.println("Anonymous inner class extending Thread");
	            }
	        };
	        thread.start();

	        Runnable runnable = new Runnable() {
	            @Override
	            public void run() {
	                System.out.println("Anonymous inner class implementing Runnable");
	            }
	        };
	        new Thread(runnable).start();
	    }

	    public static void main(String[] args) {
	    	innerClassExample outerObject = new innerClassExample();

	        InnerClass innerObject = outerObject.new InnerClass();
	        innerObject.display();

	        StaticNestedClass staticNestedObject = new StaticNestedClass();
	        staticNestedObject.display();

	        outerObject.outerMethod();

	        outerObject.anonymousInnerClassMethod();
	    }
	

}
