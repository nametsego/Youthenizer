package Hiatus;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name ? :");
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName);

        System.out.println("How old are you ?");
        int age = scanner.nextInt();
        int year = LocalDateTime.now().minusYears(age).getYear();
        System.out.println("Your were born in " + year);


        if(age >= 20 && age<25){
            System.out.println("You are in your mid 20's, You are broke with time and energy. Use it!");
        }else if( age >=25 && age <30 ) {
            System.out.println("Welcome to your mid 20s. This is where mastery of self comes in ");
        }else{
            System.out.println("You're on the other side of the matrix");
        }

    }
}
