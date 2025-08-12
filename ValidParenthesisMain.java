// MainApp.java
import java.util.Scanner;

class ValidParenthesisMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exercise ex = new Exercise();

        System.out.print("Enter a string of brackets: ");
        String input = sc.nextLine();

        boolean result = ex.isValid(input);
        System.out.println("The validity of the input character is : " + result);
    }
}

