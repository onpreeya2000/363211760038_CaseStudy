import java.util.InputMismatchException;
import java.util.Scanner;

public class ExchangeCurrency {
    public static void main(String[] args) {

        ExChangeAPI obj = new ExChangeAPI();
        Scanner Scanner = new Scanner(System.in);

        try {
            System.out.println("#### Currency Exchange System ####");
            System.out.print("Please, enter your current currency: ");
            String currentCurrency = Scanner.nextLine();
            if (obj.getConnection(currentCurrency) == false)
                System.out.println("Sorry, we can't find this currency rate.");
            else {
                System.out.print("Amount: ");
                double amount = Double.parseDouble(Scanner.nextLine());

                System.out.print("Enter new currency: ");
                String newCurrency = Scanner.nextLine();

                double rate = obj.getEachRate(newCurrency);

                System.out.println("\nExchange "+currentCurrency+"to"+newCurrency);
                System.out.println("\t"+currentCurrency+": "+amount);
                System.out.println("\t"+newCurrency+": "+(amount*rate));

            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }

    }//main
}//class
