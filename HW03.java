import java.util.Scanner;
import java.util.StringTokenizer;
public  class Main{
    public static void main(String[] args){
        int count=0;
        float total = 0;

        Scanner scanner = new Scanner(System.in);
        float[] array = new float[1000];
        String[] sarray = new String[1000]; 

        String original;
        original = scanner.next();

        StringTokenizer st = new StringTokenizer(original,"*/+-()%");
        sarray[count] = st.nextToken();
        while (st.hasMoreTokens()) {
            count++;
            sarray[count] = st.nextToken();
        }
        for(int i=0; i<count; i++)
            System.out.print(sarray[i] + " ");
        System.out.println(sarray[count]);
        
        int flag = 1;
        for(int i=0; i<original.length(); i++){
            if((original.charAt(i) == '+')||(original.charAt(i) == '-')||
                (original.charAt(i) == '*')||(original.charAt(i) == '/')||
                (original.charAt(i) == '(')||(original.charAt(i) == ')')||(original.charAt(i) == '%')){
                if(flag==0)
                    System.out.print(" " + original.charAt(i));
                else{
                    System.out.print(original.charAt(i));
                    flag = 0;
                }

            }
        }
        System.out.println();


        count = -1;
        StringTokenizer stn = new StringTokenizer(original,"*/+-()%");
        while (stn.hasMoreTokens()) {
            count++;
            array[count] = Float.parseFloat(stn.nextToken());
        }
        for(int i=0; i<=count; i++){
            total+=array[i];
        }
        System.out.printf("%.3f\n",total);

    }
}