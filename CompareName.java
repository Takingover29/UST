import java.util.ArrayList;
import java.util.Scanner;

public class CompareName{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input names
        System.out.print("Enter names separated by spaces: ");
        String[] namesArray = scanner.nextLine().split(" ");
        ArrayList<String> namesList = new ArrayList<>();
        for (String name : namesArray) {
            namesList.add(name);
        }

        // Input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Compare number with names list
        compareNumberWithName(namesList, number);

        scanner.close();
    }

    private static void compareNumberWithName(ArrayList<String> namesList, int number) {
        if (number >= 1 && number <= namesList.size()) {
            String selectedName = namesList.get(number - 1);
            System.out.println("The name at position " + number + " is: " + selectedName);
        } else {
            System.out.println("Invalid number. Please enter a number between 1 and " + namesList.size());
        }
    }
}
