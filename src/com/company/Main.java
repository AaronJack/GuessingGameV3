package com.company;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        System.out.println("What do you want to play? (You guess/I guess)");
        Scanner choice = new Scanner(System.in);
        String userchoice = choice.nextLine();
        if (userchoice.equalsIgnoreCase("I guess")) {
            int randomnum = (int) (10 * Math.random());
            System.out.println("Guess My Number");
            Scanner guess = new Scanner(System.in);
            int userguess = guess.nextInt();
            if (userguess != randomnum) {
                while (userguess != randomnum) if (userguess < randomnum) {
                    System.out.println("Too Low");
                    userguess = guess.nextInt();
                } else if (userguess > randomnum) {
                    System.out.println("Too High");
                    userguess = guess.nextInt();
                }
                if (userguess == randomnum) {
                    System.out.println("Correct!");
                }
            }
        } else if (userchoice.equalsIgnoreCase("You guess")) {
            Scanner answer = new Scanner(System.in);
            System.out.println("I'm going to guess your number. If im too high say 'high', if I'm too low say 'low', and if I'm correct say 'correct'!");
            System.out.println("Are you ready");
            String userans = answer.nextLine();
            if (userans.equalsIgnoreCase("yes") || userans.equalsIgnoreCase("ready")) {
                System.out.println("Is your number 5?");
                userans = answer.nextLine();
                if (userans.equalsIgnoreCase("correct") || userans.equalsIgnoreCase("yes")) {
                    System.out.println("Yay!");
                    userans = answer.nextLine();
                } else if (userans.equalsIgnoreCase("low")) {
                    System.out.println("Is your number 10");
                    userans = answer.nextLine();
                    if (userans.equalsIgnoreCase("correct") || userans.equalsIgnoreCase("yes")) {
                        System.out.println("Yay!");
                        userans = answer.nextLine();
                    } else if (userans.equalsIgnoreCase("high")) {
                        System.out.println("Is your number 7?");
                        userans = answer.nextLine();
                        if (userans.equalsIgnoreCase("correct") || userans.equalsIgnoreCase("yes")) {
                            System.out.println("Yay!");
                            userans = answer.nextLine();
                        } else if (userans.equalsIgnoreCase("low")) {
                            System.out.println("Is your number 8?");
                            userans = answer.nextLine();
                            if (userans.equalsIgnoreCase("correct") || userans.equalsIgnoreCase("yes")) {
                                System.out.println("Yay!");
                                userans = answer.nextLine();
                            } else if (userans.equalsIgnoreCase("low")) {
                                System.out.println("Is your number 9?");
                                userans = answer.nextLine();
                                if (userans.equalsIgnoreCase("correct") || userans.equalsIgnoreCase("yes")) {
                                    System.out.println("Yay!");
                                }
                            }
                        } else if (userans.equalsIgnoreCase("high")) {
                            System.out.println("Is your number 6?");
                            userans = answer.nextLine();
                            if (userans.equalsIgnoreCase("correct") || userans.equalsIgnoreCase("yes")) {
                                System.out.println("Yay!");
                            }
                        }
                    }
                }
            }
        }
    }
}