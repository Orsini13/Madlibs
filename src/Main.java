import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Enter a color");
        String color = keyboardInput.nextLine();
        System.out.println("Enter a pluralNoun");
        String pluralNoun = keyboardInput.nextLine();
        System.out.println("Enter a celebrity");
        String celebrity = keyboardInput.nextLine();

        System.out.println("Roses are " + color + " \t"
                + pluralNoun + " are blue \t"+ "I love " + celebrity);


    }
}