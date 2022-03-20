import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int orgNum = in.nextInt();
        
        int copyNum = orgNum;
        int revNum = 0;
        
        while(copyNum != 0) {
            int digit = copyNum % 10;
            copyNum /= 10;
            revNum = revNum * 10 + digit;
        }
        
       
        System.out.println("Reversed Number = " + revNum);

	}

}
