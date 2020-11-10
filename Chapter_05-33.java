public class Main{
    public static void main(String[] args){
        int total=0,N = 2;
        for(int i = N; i<=10000; i++){
            total = 0;
            for(int j=1; j<=i/2; j++)
                if(i%j==0)
                    total+=j;
            if(total == i)
                System.out.println(i);
        }
    }
}