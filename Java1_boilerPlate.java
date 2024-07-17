import java.util.*;
public class Java1_boilerPlate {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
           
            int a=sc.nextInt();
            sc.nextLine(); //it happens bcz the nextInt() method dosent read the newline character
                            // so when u issue the command *nextLine()* the scanner find newline character and give u that as line
            String b=sc.nextLine();
            System.out.println(a);
            System.out.println(b);
            char c=sc.next().charAt(0);
            System.out.println(c);
            boolean hi =sc.nextBoolean();
            System.out.println(hi);

            sc.close();
        
        
        
    } 
    
}
