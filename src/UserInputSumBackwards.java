import java.util.Scanner;

public class UserInputSumBackwards {
        public static void main(String[] args) {
        /*  i| 1 2 3 4 05 06 07 08 09 10 STOP
             ----------------------------
          sum| 0 1 3 6 10 15 21 28 36 45 55
        */
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter a number greater than 1 and less than 100");
            int num = keyboard.nextInt();
            int sum = 0;
            // sum is set to 0 index set to equal to or less than user input. sum increases with each pass with index plus current sum
            for (int i = 1; i <= num; i++) {
                sum  += i;
                System.out.println(sum);
            }
        }
    }


