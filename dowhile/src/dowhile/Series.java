package dowhile;
import java.util.Scanner;
import java.math.*;
public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		double c;
		double result = 0.0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of a :");
double a = sc.nextInt();
System.out.println("Enter the value of b :");
double b = sc.nextInt();
n=sc.nextInt();
for(int i=0;i<n;i++) {
	for(int j=0;j<i;j++) {
		result+=((Math.pow(2, j))*b);
		
	}
	c=a+result;
	System.out.print(c+",");
result=0.0;
	
}



	}

}
