package dowhile;
import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Enter the number limit:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		
		while(i<n)
		{
			i++;
			if(i%2==0)
			{
			System.out.println(i+" Even Number");
			
			}
			else
			{
				System.out.println(i+" Odd Number");
			}
		}
	

	}
	}

