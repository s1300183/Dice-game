import java.util.Random;
import java.util.Scanner;



class Dice{
    public static void main(String[] args){
	int saikoro1;
	int saikoro2;
	Scanner sc = new Scanner(System.in);

	Random random = new Random();
	saikoro1 = random.nextInt(6)+1;
	saikoro2 = random.nextInt(6)+1;
        int sum = saikoro1 + saikoro2;

	
	System.out.println("What is your name?");
        String name = sc.next();
	System.out.println("Hello, " + name + "!");


	
	System.out.println("Rolling dice...");
	System.out.println("Die 1: " + saikoro1);
        System.out.println("Die 2: " + saikoro2);
        System.out.println("Total value: " + sum);
        
	

    } 

}
