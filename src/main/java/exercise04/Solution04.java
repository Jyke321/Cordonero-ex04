package exercise04;

/*
*  UCF COP3330 Fall 2021 Assignment 1 Solution
*  Copyright 2021 Jacob Cordonero
 */

import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args) {
        //prompts user for a noun, a verb,
        //an adverb, and an adjective
        //and stores them into strings
        //then prints them into a story
        //using concatenation
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
