import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        NumbersHandler numbersHandler = new NumbersHandler();
        Scanner input = new Scanner(System.in);

        String inputAsString = "";

        while (!inputAsString.equals("E")){
            System.out.println("Controls: L - largest number, S - smallest number, A - average of numbers, E - exit");
            System.out.print("Your input: ");

            inputAsString = input.nextLine();
            switch (inputAsString) {
                case "L":
                    System.out.println("Largest number is: " + numbersHandler.getLargestCurrentNumber());
                    break;
                case "S":
                    System.out.println("Smallest number is " + numbersHandler.getSmallestCurrentNumber());
                    break;
                case "A":
                    System.out.println("Average of numbers is: " + numbersHandler.findAverageCurrent());
                    break;
                case "E":
                    System.out.println("Quitting the program");
                    break;
                default:
                    numbersHandler.addNumberToList(inputAsString);
            }
        }
    }
}
