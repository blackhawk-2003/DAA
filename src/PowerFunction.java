import java.util.Scanner;

public class PowerFunction {
    public static int optimisedPower(int a,int n){
        if(n==0){
            return 1;
        }

        int halfsquare=optimisedPower(a, n/2);
        int result=halfsquare*halfsquare;

        if(n%2==1){
            return a*result;
        }
        else{
            return result;
        }

    }
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int n=in.nextInt();
        System.out.println(optimisedPower(a,n));
}
}
