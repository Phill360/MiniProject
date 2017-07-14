// By Phillip Attard

package com.company;

import java.util.Scanner;

/*

This program must be written in the programming language you have selected for your project for this course.

As a key part of your project is about 2-dimensional arrays, your miniproject as a group is to create a program that
uses a single dimensional array and modifies its values.

You are to display a menu of items to the user – such as a shopping list, a list of gamesMenu, etc.
It doesn’t matter too much as the purpose of this program is the updating of an array (a list in python).

You are to create an array of whole integers which is the same length of the menu.
At startup, each element should be initialised to 0 and each time a menu item is selected you should increment the
count of items.

When the user elects to quit your program, you should print out how many times each element was called (the contents of
 your array).
You must iterate over the array – it is not enough to simply call print(array) as you are demonstrating in this
miniproject your ability to initialise and manipulate an array.

You must create and use your own functions (beyond the main default function) to implement your program.
You must pass the array / list into functions in order to modify its contents.

In week 8 you will need to give a 5 minute presentation showing what you have achieved in this miniproject.
It is expected in this demonstration that you show your understanding of arrays to a degree sufficient to complete
your project.

*/
public class Main {

    private static String[] gamesMenu = {"Halo", "Call of Duty MW3", "Clash of Clans", "Battlefield", "Mirrors Edge", "Defense Grid"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] countGames = initialiseCounts();
        Boolean running = true;
        int selection;

        // Print Menu
	    printMenu(gamesMenu);

        while( running == true){
            System.out.print("Select a game: ");
            selection = sc.nextInt();

            if(selection == gamesMenu.length) {
                running = false;
            }
            else if(selection <= (gamesMenu.length - 1) ) {
                updateCount(countGames, selection);
            }

        }
        // Print list with updated numbers
        printList(gamesMenu, countGames);

        // Quit list
        System.exit(0);
    }

    public static int[] initialiseCounts() {
        int [] countGames = new int[gamesMenu.length];
        for(int i= 0; i < countGames.length; i++) {
            countGames[i] = 0;
        }
        return countGames;
    }

    public static void updateCount(int[] countGames, int selection) {

        countGames[selection] = countGames[selection] + 1;
    }


    // Print Menu
    public static void printMenu(String [] menu) {
        System.out.println("Game Menu\n------------------");
        for (int i = 0; i < gamesMenu.length; i++) {
            System.out.println(i + ". " + gamesMenu[i]);
        }
        System.out.println(gamesMenu.length + ". To quit program");
    }

    // Print game title with count list
    public static void printList(String[] gamesMenu, int[] countGames) {
        System.out.println("\nUpdated Game Counts\n------------------");
        for(int i = 0; i < gamesMenu.length; i++){
            System.out.println(gamesMenu[i] + " - " + countGames[i]);
        }
    }
}
