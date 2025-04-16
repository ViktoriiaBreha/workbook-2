package com.pluralsight;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the names of teams and their scores: ");
        String teams_scores = scanner.nextLine().trim();

        String [] parts = teams_scores.split(Pattern.quote("|"));
        String [] teams = parts[0].split(":");
        String [] scores = parts[1].split(":");

        String team1 = teams[0];
        String team2 = teams[1];
        int score1 = Integer.parseInt(scores[0]);
        int score2 = Integer.parseInt(scores[1]);


        if (score1>score2) {
            System.out.printf("Winner: %s\n", team1);
            //System.out.println("Winner: " + team1);
        }
        else if (score1<score2) {
            System.out.printf("Winner: %s", team2);
            //System.out.println("winner: " + team2);
        } else {
            System.out.println("Teams are tie");
        }
    }
}
// Home:Visitor|21:9