package Labs.Week_1.scr;
import java.util.Scanner;

public class Patterns {
    public static void main(String args []) {
        int stores;
        String asterisk = "";
        

        Scanner int_input = new Scanner(System.in);
        System.out.print("How many stores are there?: ");
        stores = int_input.nextInt();

        for(int i=0; i < stores; i++){
            System.out.print("Enter today's sales for store " + (i+1) + ": ");
            
        }

        int_input.close();
    }
}
