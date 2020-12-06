import java.util.*;
import java.math.BigDecimal;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp;
        temp = sc.next();
        if(temp.equals("Integer")){
            ArrayList a = new ArrayList();
            int tmp;
            while(sc.hasNextInt()){
                tmp = sc.nextInt();
                a.add(new Integer(tmp));
            }
            a = removeDuplicates(a);
        }
        else if(temp.equals("Double")){
            ArrayList a = new ArrayList();
            double tmp;
            while(sc.hasNextDouble()){
                tmp = sc.nextDouble();
                a.add(new Double(tmp));
            }
            a = removeDuplicates(a);
        }
        else if(temp.equals("Character")){
            ArrayList a = new ArrayList();
            String tmp;
            while(sc.hasNext()){
                tmp = sc.next();
                a.add(tmp.charAt(0));
            }
            a = removeDuplicates(a);
        }
        else if(temp.equals("String")){
            ArrayList a = new ArrayList();
            String tmp;
            while(sc.hasNext()){
                tmp = sc.next();
                a.add(tmp);
            }
            a = removeDuplicates(a);
        }
        //ArrayList a = new ArrayList();

    }
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
        int size = list.size();
        int i=0;
        while(i < size){
            size = list.size();
            if(list.contains(list.get(i))){
                list.remove(i);
                i = 0;
                continue;
            }
            i++;
        }
        return list;
    }
}
