import java.util.Scanner;

public class Main {
    public static void main(String[] argv){
        Scanner ip=new Scanner(System.in);
        int T=ip.nextInt();
        while(T-->0){
            int x=ip.nextInt();
            if(x%4==0&&(x%100!=0||x%400==0)){
                System.out.println("Yes");
                int ans=307;
                for(int i=x+1;i<2000;++i)
                    if(i%4==0&&(i%100!=0||i%400==0))
                        ans+=366;
                    else ans+=365;
                System.out.printf("%d\n",ans);
            }else System.out.println("No");
        }
    };
}