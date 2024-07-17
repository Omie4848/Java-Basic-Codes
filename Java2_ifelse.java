import java.util.*;
public class Java2_ifelse {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=21){
            System.out.println("u can marry");
        }
        else{
            System.out.println("u r vella");
        }
        sc.close();
    }
}