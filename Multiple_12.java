import java.util.Scanner;

public class Multiple_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner reader = new Scanner(System.in);
         System.out.println("Enter a number!");
         int num1 = reader.nextInt();
         reader.nextLine();
        
        

         if ((num1 %12) == 0 && num1<=100) {
             System.out.println("Yes! " + num1 + " is  multiple of " +12);
         } else {
             System.out.println("No" +" "+ num1 + " "+""+"is not multiple of "+" "+ 12);
         }
         
         reader.close();
	}

}
