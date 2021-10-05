import java.util.ArrayList;

public class NumbersHandler {
    private double largestCurrentNumber;
    private double smallestCurrentNumber;
    private final ArrayList<Double> listOfNumbers = new ArrayList<>();

    public double getLargestCurrentNumber() {
        return largestCurrentNumber;
    }

    public double getSmallestCurrentNumber() {
        return smallestCurrentNumber;
    }

    public double findAverageCurrent() {
        double sum = 0;
        if(!listOfNumbers.isEmpty()){
            for (Double num : listOfNumbers) {
                sum += num;
            }
            return sum / listOfNumbers.size();
        }
        return 0;
    }

    public void addNumberToList(String inputAsString) {
        double num;
        try {
            num = Double.parseDouble(inputAsString);
            if (listOfNumbers.isEmpty()) {
                largestCurrentNumber = num;
                smallestCurrentNumber = num;
            } else {
                if (num > largestCurrentNumber) {
                    largestCurrentNumber = num;
                }
                if (num < smallestCurrentNumber) {
                    smallestCurrentNumber = num;
                }
            }
            listOfNumbers.add(num);
        } catch (NumberFormatException e) {
            System.err.println("User input is invalid, only numbers allowed");
        }
    }
}
