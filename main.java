// Practicum 13 (while and for loops)
// (TO COMPLETE)


import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        // var declarations
        int n, sum1, sum2;
     
        Scanner input = new Scanner(System.in);

        // prompt user for value of n to sum up to
        // if then enter 5, should add up 1 to 5 (equal to 15)
        System.out.print("Input a number: ");
        n = input.nextInt();

        // use a for loop to sum up the values and assign to sum1
        sum1 = 0;
        for(int i = 0; i <= n; i++)
        {
          sum1 = sum1 + i;
        }

        // use a while loop to sum up the values and assign to sum2
        sum2 = 0;
        while(n >= 0)
        {
          sum2 = sum2 + n;
          n = n - 1;
        }

        // display results
        System.out.println(
          "Sum of 1.." + n + " by use of for loop is " + sum1);

        System.out.println(
          "Sum of 1.." + n + " by use of while loop is " + sum2);
    }
}
