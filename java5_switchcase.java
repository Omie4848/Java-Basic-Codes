import java.util.*;
public class java5_switchcase {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        switch (num) {
            case 1:System.out.println("palak");
            break;
            case 2:System.out.println("samosa");
            break;
            case 3:System.out.println("masale bhat");
            break;
                
        
            default:System.out.println("there is no order for u idiots");
                break;
        }
        sc.close();
    }
}
