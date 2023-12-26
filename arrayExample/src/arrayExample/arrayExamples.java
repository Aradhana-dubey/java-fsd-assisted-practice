package arrayExample;

public class arrayExamples {


    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};

        // Access and print elements of the array
        System.out.println("Array elements:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Element at index " + i + ": " + intArray[i]);
        }

        int sum = 0;
        for (int num : intArray) {
            sum += num;
        }
        System.out.println("\nSum of array elements: " + sum);

        String[] stringArray = {"Java", "C", "Python"};

        System.out.println("\nString Array elements:");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("Element at index " + i + ": " + stringArray[i]);
        }

        int[][] twoDArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("\n2D Array elements:");
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
    }

}
