import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		for(int j=1;j<=num;j++)
		{
		    if(num%j==0){
		        count=count+1;
		        
		    }
		}
		    if(count==2){
		        System.out.println("prime");
		    }
		    else{
		        System.out.println("not prime");
		    }
		
	 }
}

