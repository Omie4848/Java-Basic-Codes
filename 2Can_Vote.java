/*************************************************
CHCK WHETHER THE PERSON IS ABLE TOO VOTE OR NOT
**************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>=18){
		    System.out.println("Can vote");
		}
		else{
		    System.out.println("Can not vote");
		}
		
	}
}
