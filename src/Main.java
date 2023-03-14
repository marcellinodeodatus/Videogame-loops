/* Date: 3/14/2020
--------------------------- Video Game Mania ------------------------------
Billy loves video games! in fact, he spends all of his money on them. He has a weekly allowance and each game costs
a certain amount of money. (Both of these are values entered by the user.) The program will simulate Billy's spending
habits for a particular number of weeks (values also entered by the user). At the end of each week, the program will
print whether or not Billy buys a video game. Also, any money not spent on a video game carries over to the following week.
At the end of the program, it will print how much money Billy has left and how many video games he has bought.
* */

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int allowance = 0;
        int cost = 0;
        int weeks = 0;
        int wallet = 0;
        int games = 0;

        System.out.println("Please enter Billy's weekly allowance in dollars: ");
        allowance = sc.nextInt();

        System.out.println("Please enter the cost of a video game in dollars: ");
        cost = sc.nextInt();

        System.out.println("Please enter the number of weeks to follow Billy's spending habits: ");
        weeks = sc.nextInt();

        for (int i = 0; i < weeks; i++){
            wallet += allowance;

            if (wallet >= cost){
                System.out.println("After week " + (i+1) +", Billy has " + wallet + " dollars and then buys a video game!");
                wallet = wallet - cost;
                games++;
            } else {
                System.out.println("After week " + (i+1) +", Billy has " + wallet + " dollars and does not buy a video game.");
            }

        }

        System.out.println("At the end of " + weeks +" weeks, Billy has " + wallet + " dollars and " + games + " video games.");

    } // end driver


}//end class Main