import java.util.Scanner;

class Leapyear{
	public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
                 System.out.print("enter the start year : ");
		 int start = sc.nextInt();
                // System.out.print("enter the start year : ");
                // int end = sc.nextInt();
		 //for(int i = start;i<=end;i++){
                 if((start%4==0) && (start%100!=0) || (start%400==0)){
                      System.out.println("leap year");
                 }
                 else{
                   System.out.println("not a leap year");
                 }
	        //}

	   }
}
