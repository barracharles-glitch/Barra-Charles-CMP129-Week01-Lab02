package Labs.Week_1.scr;
import java.util.Scanner;

public class Patterns {
    public static void main(String args []) {
        int stores, sales;
        String asterisk = "";
        

        Scanner int_input = new Scanner(System.in);
        System.out.print("How many stores are there?: ");
        stores = int_input.nextInt();

        for(int i=0; i < stores; i++){
            System.out.print("Enter today's sales for store " + (i+1) + ": ");
            sales = int_input.nextInt();
            sales = sales/100;
            asterisk = asterisk + "Store " + (i+1) + ": ";
            for (int j=0; j<sales; j++){
                asterisk = asterisk + "*";
            }
            asterisk = asterisk + "\n";
        }

        System.out.println("SALES BAR CHART \n(Each * = $100)\n" + asterisk);

        int_input.close();
    }
}
