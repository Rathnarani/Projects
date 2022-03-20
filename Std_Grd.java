import java.util.Scanner;

public class Std_Grd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner reader = new Scanner(System.in);
		 String Grade = new String();
         System.out.println("Enter the Marks :");
         int marks, index;
         marks=reader.nextInt();
         reader.nextLine();
         index = marks/10;
         switch(index)
         {
        	 case  10: 
        	         
        	 case  9:Grade = "Excellent";
        	 break;
        		 
        	 case  8:Grade = "good";
        	  break;
        	 case 7:
        		
        	 case 6: Grade = "just passed"; 
        	     break;
        	 
        	 	 
         
         default: Grade = "fail";
        	     break;
         }
        System.out.println(Grade);
	}

}