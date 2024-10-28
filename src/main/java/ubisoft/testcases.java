package ubisoft;
import java.util.Scanner;
public class testcases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		testcases m= new testcases();
        Scanner sc=new Scanner(System.in);

  System.out.println("Enter the amount");
    
    int amount= sc.nextInt();
    
   double d;
   double total;
   
   

if(amount>=3000)
    {
    System.out.println( "20 percent discount");

    d= amount*0.2;
    total=amount-d;
    }
    
    else if(amount==0)
    {
        System.out.println("number is zero");
        d= amount*0.2;
        total=amount-d;
    }
    
    else if(amount<500)
   { 
    System.out.println("no discount" );
    d= amount*0.2;
    total=amount - d;
		
		
	}

}
}
