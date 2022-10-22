import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        boolean[] cnt=new boolean[n];
        for (int i = 0; i < n; i++) {
            int x=ip.nextInt();
            cnt[x-1]=true;
        }
        boolean  flag=false;
        for (int i = 0; i < n; i++)
            if(!cnt[i]){
                if(!flag)
                    System.out.printf("%d",i+1);
                else System.out.printf(" %d",i+1);
                flag=true;
            }
        if(!flag) System.out.print("NULL");
    }
}
