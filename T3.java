import java.util.*;

public class T3 {

    static class Subject {
        public int score;
        public int cost;
        public Subject(){}
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int T=input.nextInt();
        while(T-->0){
            Subject[] sub=new Subject[4];
            for (int i = 0; i < 4; i++) {
                sub[i]=new Subject();
            }
            int sum=0,ans=0;
            for (int i = 0; i < 4; i++) {
                sub[i].score=input.nextInt();
                sum+=sub[i].score;
            }
            for (int i = 0; i < 4; i++) {
                sub[i].cost=input.nextInt();
            }

            Arrays.sort(sub,(a,b)->a.cost-b.cost);

            for (int i = 0; i < 4; i++)
                if(sum<100){
                    int delta=Math.min(100-sum,30-sub[i].score);
                    ans+=sub[i].cost*delta;
                    sum+=delta;
                }
            System.out.println(ans);
        }
    }
}
