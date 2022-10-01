import java.util.Scanner;

public class attempt {
    public static void main(String[] argv){
        Scanner ip=new Scanner(System.in);
        int T=ip.nextInt(),a=0,b=0,c=0,d=0;
        while(T-->0){
            int x=ip.nextInt();
            if(x>=90)a++;
            else if(x>=80)b++;
            else if(x>=70)c++;
            else if(x>=60)d++;
        }
        System.out.printf("A: %d\nB: %d\nC: %d\nD: %d\n",a,b,c,d);
    }
}
