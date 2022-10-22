import java.util.Scanner;

public class Main {
    public static void main(String[] argv){
        Scanner ip=new Scanner(System.in);
        int T=ip.nextInt();
        while(T-->0){
            double a=ip.nextDouble(),b=ip.nextDouble(),c=ip.nextDouble(),d=ip.nextDouble(),e=ip.nextDouble();
            System.out.printf("%.1f\n",(d-b)/(c-a)*(e-a)+b);
        }
    };
}