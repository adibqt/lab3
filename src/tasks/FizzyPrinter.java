package tasks;

public class FizzyPrinter {
    public String printFizzy (int n, boolean toUpperCase){
        String result = "";
        if (n % 3 == 0) {
            result += "Fizz";
        }
        else if (n % 5 == 0) {
            result += "Buzz";
        }
        else if (n % 7 == 0) {
            result += "Bang";
        }
        else if(n % 3 == 0 && n % 5 == 0){
            result = "FizzBuzz";
        } else if (n % 3 == 0 && n % 5 == 0 && n % 7 == 0) {
            result = "FizzBuzzBang";

        }
         return (toUpperCase) ? result.toUpperCase() : result;


    }

    public static void main(String[] args) {
        FizzyPrinter printer = new FizzyPrinter();
        System.out.println(printer.printFizzy(3, false));

    }
}
