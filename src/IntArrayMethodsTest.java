import java.util.Scanner;

public class IntArrayMethodsTest {
    public static void main(String[] args) {
        int numItems;
        int[] items;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        numItems = in.nextInt();

        items = new int[numItems];

        if (items.length > 0){
            System.out.print("Enter the value of all item:  ");
            for (int i = 0; i< items.length; i++){
                items[i] = in.nextInt();
            }
        }
        System.out.print("The value are :  ");
        print(items);
        System.out.println("The min is : " + min(items));
        System.out.println("The sum is: "+ sum(items));
        System.out.printf("The average is  %.2f%n ", average(items));
        in.close();
    }
    p
    private static void print(int[] items) {
    }
}
