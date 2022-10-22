import java.util.Scanner;
import java.util.Arrays;

public class T4 {

    static class Poker{

        int rank;
        char suit;
        Poker(char c,int r){
            suit=c;
            rank=r;
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Poker[] hand=new Poker[5];
        for (int i = 0; i < 5 ; i++) {
            hand[i]=new Poker(input.next().charAt(0),input.nextInt());
        }
        Arrays.sort(hand,(a,b)->a.rank-b.rank);
        int type=0;
        if(hand[4].rank-hand[0].rank==4)
            type=6;
        boolean flag=true;
        for(int i=1;i<5;++i)
            if(hand[i].suit!=hand[0].suit)
                flag=false;
        if(flag)type+=5;
        int len=1,maxLen=1;
        for (int i = 1; i < 5; i++) {
            len=(hand[i].rank==hand[i-1].rank)?len+1:1;
            maxLen=Math.max(len,maxLen);
        }
        if(type==0)type=maxLen;
        String[] str= {"","High Card","Pair","Three of a Kind","Three of a Kind","Flush","Straight","","","","","Straight Flush"};
        System.out.println(str[type]);
    }
}
