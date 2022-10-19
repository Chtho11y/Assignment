import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int T=input.nextInt();
        while(T-->0){

            int m=input.nextInt(),n=input.nextInt();
            int lim=Math.max(m,n);

            int[] a=new int[lim],b=new int[lim];

            for (int i = m-1; i > -1; i--) {
                a[i]=input.nextInt();
            }

            for (int i = n-1; i > -1; i--) {
                b[i]=input.nextInt();
            }

            int[] c=(m>n)?a:b;
            int res=0;
            for(int i=0;i<lim;++i){
                c[i]=(a[i]+b[i]+res);
                if(c[i]>=10){
                    c[i]-=10;
                    res=1;
                }else res=0;
            }
            if(res!=0) System.out.print(res);
            for(int i=lim-1;i>=0;--i)
                System.out.print(c[i]);
            System.out.println("");
        }
    }
}