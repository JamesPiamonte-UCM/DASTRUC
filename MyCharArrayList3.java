import java.util.Scanner;

public class MyCharArrayList3 {

    private char[] arr;
    private int counter;

    // Constructor
    public MyCharArrayList3(int size) {
        arr = new char[size];
        counter = 0;
    }

    public boolean isEmpty() {
        return counter == 0;
    }

    public boolean add(char element) {
        if (counter == arr.length) {
            System.out.println("Cannot add: ArrayList is full");
            return false;
        }
        arr[counter++] = element;
        return true;
    }

    // Remove by value
    public boolean remove(char item) {
        if (isEmpty()) {
            System.out.println("Cannot remove: ArrayList is empty");
            return false;
        }
        int index = -1;
        for (int i = 0; i < counter; i++) {
            if (arr[i] == item) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Element '" + item + "' not found");
            return false;
        }

        // Swap with last
        arr[index] = arr[counter - 1];
        arr[counter - 1] = ' ';
        counter--;
        return true;
    }

    // Remove by index
    public boolean remove(int location) {
        if (isEmpty() || location < 0 || location >= counter) {
            System.out.println("Invalid location or list is empty");
            return false;
        }

        arr[location] = arr[counter - 1];
        arr[counter - 1] = ' ';
        counter--;
        return true;
    }

    // Display in [Element] Index format
    public void displayList() {
        System.out.println();
        for (int i = 0; i < counter; i++) {
            System.out.println("[" + arr[i] + "] " + i);
        }
        System.out.println("Counter: " + counter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyCharArrayList3 list = new MyCharArrayList3(6);

        // Add initial elements
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');
        list.add('F');

        // Display initial list
        list.displayList();

        // Ask user which element to remove
        System.out.print("\nEnter character to remove: ");
        char toRemove = sc.next().charAt(0);

        list.remove(toRemove);

        // Display updated list
        list.displayList();

        // Press any key to continue
        System.out.println("\nPress any key to exit...");
        sc.nextLine(); // Consume leftover newline
        sc.nextLine(); // Wait for user to press Enter

        sc.close();
    }
}