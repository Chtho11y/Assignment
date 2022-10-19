import java.util.Scanner;

public class T5 {

    static void stringSwap(char[] a,int l,int r){
        char c=a[l];
        a[l]=a[r];
        a[r]=c;
    }

    static void stringTrans(char[] s){
        stringSwap(s,0,6);
        stringSwap(s,1,7);
        stringSwap(s,2,4);
        stringSwap(s,3,5);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char[] s=new char[8];
        int n=input.nextInt();
        n--;
        s=input.next().toCharArray();
        stringTrans(s);
        System.out.print(s);
        while(n-->0){
            s=input.next().toCharArray();
            stringTrans(s);
            System.out.print(" ");
            System.out.print(s);
        }
    }
}
