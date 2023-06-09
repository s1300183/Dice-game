import java.util.Random;



class Dice{
    public static void main(String[] args){
	int saikoro1;
	int saikoro2;

	Random random = new Random();
	saikoro1 = random.nextInt(6)+1;
	saikoro2 = random.nextInt(6)+1;
        int sum = saikoro1 + saikoro2;

	System.out.println("Rolling dice...");
	System.out.println("Die 1: " + saikoro1);
        System.out.println("Die 2: " + saikoro2);
        System.out.println("Total value: " + sum);
        
	

    } 

}
