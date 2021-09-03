package exercise04;

import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args) {
        //prompts user for a noun, a verb,
        //an adverb, and an adjective
        //and prints them into a story
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun = input.nextLine();
        System.out.print("Enter a verb: ");
        String verb = input.nextLine();
        System.out.print("Enter a adjective: ");
        String adjective = input.nextLine();
        System.out.print("Enter a adverb: ");
        String adverb = input.nextLine();
        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + " That's hilarious!\n");
    }
}
