package com.example;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args)
    {
        String code1 = "11A";
        String code2 = "11A2B";
        String code3 = "1B2B3";
        String code4 = "000Destruct0";
        String input1 = "aaa";
        String input2 = "aaa";
        String input3 = "aaa";
        String input4 = "aaa";
        int t = 30;

        Scanner user_input = new Scanner(System.in);
        System.out.println("What is the initiatal code for initiating the self destruct sequence?");
        input1 = user_input.nextLine();

        while(!input1.equals(code1))
        {
            System.out.println("Error, code not valid, please try again");
            input1 = user_input.nextLine();
        }

        System.out.println("Phase one complete, code " + code1 + " has been verified");
        System.out.println("What is the second code for initiating the self destruct sequence?");
        input2 = user_input.nextLine();

        while(!input2.equals(code2))
        {
            System.out.println("Error, code not valid, please try again");
            input2 = user_input.nextLine();
        }

        System.out.println("Phase two complete, code " + code2 + " has been verified");
        System.out.println("What is the second code for initiating the self destruct sequence?");
        input3 = user_input.nextLine();

        while(!input3.equals(code3))
        {
            System.out.println("Error, code not valid, please try again");
            input3 = user_input.nextLine();
        }

        System.out.println("Phase three complete, code " + code3 + " has been verified");
        System.out.println("What is the second code for initiating the self destruct sequence?");
        input4 = user_input.nextLine();

        while(!input4.equals(code4))
        {
            System.out.println("Error, code not valid, please try again");
            input4 = user_input.nextLine();
        }

        System.out.println("Phase four complete, code " + code4 + " has been verified");
        System.out.println("All self destruct codes have been entered, self destruct in t-30 seconds");

        while (t <= 30)
        {
            System.out.println(t);
            t--;
            if (t == 0)
            {
                System.out.println(t);
                System.out.println("Goodbye");
                break;
            }
        }



    }
}
