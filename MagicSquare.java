import java.util.Scanner;

public class MagicSquare{
    public static void main(String[] args){
        int number;
        boolean first = true;
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            number = input.nextInt();
            if(first != true){
                System.out.println();
            }

            if(number%2 == 0){
                System.out.println("It is not an odd number.");
            }
            else{
                int[][] arr = new int[number][number];
                for(int i=0; i<arr.length; i++){
                    for(int j=0; j< arr[0].length; j++){
                        arr[i][j] = 0;
                    }
                }
                arr[number-1][(number-1)/2] = 1;

                int itemp = number-1;
                int jtemp = (number-1)/2;
                int temp = 2;
                int flag = 0;
                while(temp<=number*number){
                    if(flag == 0){
                        itemp = ((++itemp)%number);
                        jtemp = ((++jtemp)%number);
                    }
                    else
                        flag = 0;

                    if(arr[itemp][jtemp] != 0){
                        itemp = ((--itemp)%number);
                        itemp = ((--itemp)%number);
                        jtemp = ((--jtemp)%number);
                        if(itemp<0)
                            itemp+=number;
                        if(jtemp<0)
                            jtemp+=number;
                        flag = 1;
                    }
                    else{
                        arr[itemp][jtemp] = temp;
                        temp++;
                    }
                }
                int count = 0;
                for(int i=0; i<arr.length; i++){
                    count+=arr[i][0];
                }
                System.out.println(count);
                for(int i=0; i<arr.length; i++){
                    for(int j=0; j< arr[0].length; j++){
                        System.out.printf("%5d",arr[i][j]);
                    }
                    System.out.println();
                }

            }
            first = false;
        }

    }
}