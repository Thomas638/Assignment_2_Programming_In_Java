package Assignment2_ThomasCarroll;

import java.util.Scanner;

/**
 * A game in with you can play with chickens. You can feed them, hit them, play with them, and get eggs from them.
 *
 * @author Thomas Carroll
 */

public class ChickenView {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create the chickens
        ChickenCraft chicken1 = new ChickenCraft();
        ChickenCraft chicken2 = new ChickenCraft();
        ChickenCraft chicken3 = new ChickenCraft();
        ChickenCraft chicken4 = new ChickenCraft();

        // Set the chicken's name
        System.out.println("Please choose four names to give to your chickens");
        chicken1.name = scanner.next();
        chicken2.name = scanner.next();
        chicken3.name = scanner.next();
        chicken4.name = scanner.next();
        System.out.println("The names you have chosen are: " + chicken1.name + ", " + chicken2.name + ", " + chicken3.name + ", " + chicken4.name + " ");


        // Interact with the chickens
        while (chicken1.alive == true || chicken2.alive == true || chicken3.alive == true || chicken4.alive == true) {
            System.out.println("Please choose a chicken to interact with:");
            System.out.println("1.  " + chicken1.name + "    2. " + chicken2.name + "    3. " + chicken3.name + "    4. " + chicken4.name + "    5. Quit");

            // This is how the user chooses what chicken to interact with
            int chickenNumber = scanner.nextInt();

            // This is where the user chooses what to do with chicken 1
            if (chickenNumber == 1) {
                if (chicken1.alive == true) {
                    System.out.println("Please choose an action for " + chicken2.name + ":");
                    if (chicken1.happiness == true) {
                        System.out.println(chicken1.name + " is happy");
                    } else {
                        System.out.println(chicken1.name + " is sad");
                    }
                    System.out.println("1. Feed     2. Play     3. Hit     4. Get Eggs    5. Return to Selection");

                    // This is where the user chooses what action to take with the chicken based on the number they entered
                    int action = scanner.nextInt();
                    switch (action) {
                        case 1 -> {
                            System.out.println("How many times would you like to feed " + chicken1.name + "?" + " Be careful, feeding it too much will kill it!");
                            chicken1.Feed(scanner.nextInt());
                        }
                        case 2 -> chicken1.Play();
                        case 3 -> {
                            System.out.println("How many times would you like to hit " + chicken1.name + "?" + " Be careful, hitting it too much will kill it!");
                            chicken1.Hit(scanner.nextInt());
                        }
                        case 4 -> chicken1.GetEggs();
                        case 5 -> {
                            break;
                        }
                        default -> System.out.println("Please enter a valid action");
                    }
                } else {
                    System.out.println(chicken1.name + " is dead");
                    System.out.println("");
                }
            }

            // This is where the user chooses what to do with chicken 2
            if (chickenNumber == 2) {
                if (chicken2.alive == true) {
                    System.out.println("Please choose an action for " + chicken2.name + ":");
                    if (chicken1.happiness == true) {
                        System.out.println(chicken2.name + " is happy");
                    } else {
                        System.out.println(chicken2.name + " is sad");
                    }
                    System.out.println("1. Feed     2. Play     3. Hit     4. Get Eggs    5. Return to Selection");

                    // This is where the user chooses what action to take with the chicken based on the number they entered
                    int action = scanner.nextInt();
                    switch (action) {
                        case 1 -> {
                            System.out.println("How many times would you like to feed " + chicken2.name + "?" + " Be careful, feeding it too much will kill it!");
                            chicken2.Feed(scanner.nextInt());
                        }
                        case 2 -> chicken2.Play();
                        case 3 -> {
                            System.out.println("How many times would you like to hit " + chicken2.name + "?" + " Be careful, hitting it too much will kill it!");
                            chicken2.Hit(scanner.nextInt());
                        }
                        case 4 -> chicken2.GetEggs();
                        case 5 -> {
                            break;
                        }
                        default -> System.out.println("Please enter a valid action");
                    }
                }

                // This is where the user chooses what to do with chicken 3
                if (chickenNumber == 3) {
                    if (chicken3.alive == true) {
                        System.out.println("Please choose an action for " + chicken2.name + ":");
                        if (chicken3.happiness == true) {
                            System.out.println(chicken3.name + " is happy");
                        } else {
                            System.out.println(chicken3.name + " is sad");
                        }
                        System.out.println("1. Feed     2. Play     3. Hit     4. Get Eggs    5. Return to Selection");

                        // This is where the user chooses what action to take with the chicken based on the number they entered
                        int action = scanner.nextInt();
                        switch (action) {
                            case 1 -> {
                                System.out.println("How many times would you like to feed " + chicken3.name + "?" + " Be careful, feeding it too much will kill it!");
                                chicken3.Feed(scanner.nextInt());
                            }
                            case 2 -> chicken2.Play();
                            case 3 -> {
                                System.out.println("How many times would you like to hit " + chicken3.name + "?" + " Be careful, hitting it too much will kill it!");
                                chicken3.Hit(scanner.nextInt());
                            }
                            case 4 -> chicken2.GetEggs();
                            case 5 -> {
                                break;
                            }
                            default -> System.out.println("Please enter a valid action");
                        }
                    }

                    // This is where the user chooses what to do with chicken 4
                    if (chickenNumber == 4) {
                        if (chicken4.alive == true) {
                            System.out.println("Please choose an action for " + chicken2.name + ":");
                            if (chicken4.happiness == true) {
                                System.out.println(chicken4.name + " is happy");
                            } else {
                                System.out.println(chicken4.name + " is sad");
                            }
                            System.out.println("1. Feed     2. Play     3. Hit     4. Get Eggs    5. Return to Selection");

                            // This is where the user chooses what action to take with the chicken based on the number they entered
                            int action = scanner.nextInt();
                            switch (action) {
                                case 1 -> {
                                    System.out.println("How many times would you like to feed " + chicken4.name + "?");
                                    chicken4.Feed(scanner.nextInt());
                                }
                                case 2 -> chicken2.Play();
                                case 3 -> {
                                    System.out.println("How many times would you like to hit " + chicken4.name + "?" + " Be careful, hitting it too much will kill it!");
                                    chicken4.Hit(scanner.nextInt());
                                }
                                case 4 -> chicken2.GetEggs();
                                case 5 -> {
                                    break;
                                }
                                default -> System.out.println("Please enter a valid action");
                            }
                        }

                        // This is for ending the game
                        if (chickenNumber == 5) {
                            // Exits the program
                            System.out.println("Thank you for playing ChickenCraft!");
                            System.exit(0);
                        }
                    }
                    System.out.println("You killed all of your chickens!!!");
                    System.out.println("Thank you for playing ChickenCraft!");
                    // End of program
                }
            }
        }
    }
}
