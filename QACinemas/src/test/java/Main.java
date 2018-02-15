import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        int S = 8, O = 6, St = 6, C = 4, discount = 2, i =0, total =0;

        Scanner scanner = new Scanner(System.in);
        BookingsSystem bs = new BookingsSystem();
        bs.displayTicket();
        System.out.println("How many tickets would you like to book");
        int a = scanner.nextInt();
        while(i <= a){
            int input = scanner.nextInt();
            total += input;
            i++;
            if (i == a){
                System.out.println("The Total cost of tickets for this movie is: £" + total);
                break;
            }
        }

    }
}
