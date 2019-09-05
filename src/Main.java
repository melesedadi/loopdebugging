import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String userInput = " ";
        System.out.println("Please inter your input: ");
        userInput = keyboard.nextLine();

        while (userInput != " ") {
            System.out.println(userInput);
        }

    }
}
