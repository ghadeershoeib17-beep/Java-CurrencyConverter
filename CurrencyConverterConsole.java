import java.util.Scanner;

public class CurrencyConverterConsole {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] names = {"USD", "EUR", "SAR"};
        double[] rates = {1.0, 0.85, 3.75};

        System.out.println("1.USD  2.EUR  3.SAR");
        System.out.print("From (1-3): ");
        int f = s.nextInt() - 1;
        System.out.print("To (1-3): ");
        int t = s.nextInt() - 1;
        System.out.print("Amount: ");
        double a = s.nextDouble();

        double res = (a / rates[f]) * rates[t];
        System.out.printf("Result: %.2f %s\n", res, names[t]);
        s.close();
    }
}
