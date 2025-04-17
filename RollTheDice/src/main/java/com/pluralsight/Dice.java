package com.pluralsight;

public class Dice {
    int roll(){
        return (int)(Math.random() * 6) + 1;
    }

    public static void main(String[] args) {
        Dice dice = new Dice ();
        int roll1 = 0, roll2 = 0;
        int counter2 = 0, counter4 = 0, counter6 = 0, counter7 = 0;
        int i = 1;
        int sum = 0;

        while ( i < 100){
            i ++;
            roll1 = dice.roll();
            roll2 = dice.roll();
            sum = roll1 + roll2;

            System.out.println("Roll: " + i + " "+ roll1 + " - " + roll2 + " " + "Sum: " + sum);

            if (sum == 2){
                counter2++;
            } else if (sum == 4) {
                counter4++;
            } else if (sum == 6) {
                counter6++;
            } else if (sum == 7) {
                counter7++;
            }

        }




        System.out.println("Sum of 2 rolled: " + counter2 + "times");
        System.out.println("Sum of 4 rolled: " + counter4 + "times");
        System.out.println("Sum of 6 rolled: " + counter6 + "times");
        System.out.println("Sum of 7 rolled: " + counter7 + "times");


    }
}
/*1. Create an instance of Dice named dice. Also create integer variables for
roll1, roll2, and four different counters for the number of times 2, 4, 6
and 7 are rolled
2. Create a loop that executes 100 times.
3. Within the loop, call your dice's roll() method two times:
roll1 = dice.roll();
roll2 = dice.roll();
4. Print the value of each roll of the dice formatted like this:
Roll 1: 4 - 6 Sum: 10
5. Determine if the sum of roll1 and roll2 is 2, and if so increment the
twoCounter.
6. Determine if the sum of roll1 and roll2 is 4, and if so increment the
fourCounter.
7. Determine if the sum of roll1 and roll2 is 6, and if so increment the
sixCounter.
8. Determine if the sum of roll1 and roll2 is 7, and if so increment the
sevenCounter.
9. When the loop terminates, display your counters!
3-12
Now, use this knowledge to go play Craps at your local casino! */




