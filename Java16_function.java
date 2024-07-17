public class Java16_function {
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
            
        }
        return fact;
    }
    public static int binomial(int num , int r){
        int numfact=factorial(num);
        int rfact =factorial(r);
        int nrfact=factorial(num-r);
        return numfact/(rfact*nrfact);
    }
    public static void main(String[] args) {
        
        System.out.println(binomial(5, 3));
    }
}
