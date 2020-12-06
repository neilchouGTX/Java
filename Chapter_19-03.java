import java.util.*;
import java.math.BigDecimal;
public class Main {
    //@SuppressWarnings(value={"unchecked"})
    @Deprecated
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp,data;
        temp = sc.next();
        sc.nextLine();
        data = sc.nextLine();
        
        if(temp.equals("Integer")){
            ArrayList<Integer> a = new ArrayList<>();
            int tmp;
            StringTokenizer st = new StringTokenizer(data," ");
            while (st.hasMoreTokens()) {
                a.add(Integer.valueOf(st.nextToken()));
            }
            a = removeDuplicates(a);
            int size = a.size();
            for(int i=0; i<size-1; i++){
                System.out.print(a.get(i) + " ");
            }
            System.out.println(a.get(size-1));
        }
        else if(temp.equals("Double")){
            ArrayList<Double> a = new ArrayList<>();
            double tmp;
            StringTokenizer st = new StringTokenizer(data," ");
            while (st.hasMoreTokens()) {
                a.add(Double.valueOf(st.nextToken()));
            }
            a = removeDuplicates(a);
            int size = a.size();
            for(int i=0; i<size-1; i++){
                System.out.printf("%.3f ",a.get(i));
            }
            System.out.printf("%.3f\n",a.get(size-1));
        }
        else if(temp.equals("Character")){
            ArrayList<Character> a = new ArrayList<>();
            String tmp;
            StringTokenizer st = new StringTokenizer(data," ");
            while (st.hasMoreTokens()) {
                a.add(st.nextToken().charAt(0));
            }
            a = removeDuplicates(a);
            int size = a.size();
            for(int i=0; i<size-1; i++){
                System.out.print(a.get(i) + " ");
            }
            System.out.println(a.get(size-1));
        }
        else if(temp.equals("String")){
            ArrayList<String> a = new ArrayList<>();
            String tmp;
            StringTokenizer st = new StringTokenizer(data," ");
            while (st.hasMoreTokens()) {
                a.add(st.nextToken());
            }
            a = removeDuplicates(a);
            int size = a.size();
            for(int i=0; i<size-1; i++){
                System.out.print(a.get(i) + " ");
            }
            System.out.println(a.get(size-1));
        }

    }
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
        ArrayList<E> newList = new ArrayList<E>();
        int size = list.size();
        int i=0;
        size = list.size();
        while(i < size){
            if(!newList.contains(list.get(i))){
                newList.add(list.get(i));
            }
            i++;
        }
        return newList;
    }
}