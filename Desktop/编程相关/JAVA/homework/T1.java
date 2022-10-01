import java.util.Scanner;

public class Main {
    static String[] Days={"","yes","no","yes","no","yes","no","yes","yes","no","yes","no","yes"};
    public static void main(String[] argv){
        Scanner ip=new Scanner(System.in);
        int T=ip.nextInt();
        while(T-->0){
            System.out.println(Days[ip.nextInt()]);
        }
    };
}