import java.util.*;
import java.lang.*;
import java.math.BigDecimal;
public class Main{
    static char[] sym = new char[3];
    public static BigDecimal big3(BigDecimal x, BigDecimal y, BigDecimal z){
        BigDecimal good = new BigDecimal("0");
        if((sym[0]=='*') || (sym[0]=='/') || (sym[0]=='%'))
        {
            if(sym[0]=='*'){
                good = x.multiply(y);
                if(sym[1]=='+')
                    good = good.add(z);
                else if(sym[1] == '-')
                    good = good.subtract(z);
                else if(sym[1]=='*')
                    good = good.multiply(z);
                else if(sym[1] == '/')
                    good = good.divide(z);
                else
                    good = good.remainder(z);

            }
            else if(sym[0]=='/'){
                good = x.divide(y);
                if(sym[1]=='+')
                    good = good.add(z);
                else if(sym[1] == '-')
                    good = good.subtract(z);
                else if(sym[1]=='*')
                    good = good.multiply(z);
                else if(sym[1] == '/')
                    good = good.divide(z);
                else
                    good = good.remainder(z);
            }
            else if(sym[0]=='%'){
                 good = x.remainder(y);
                 if(sym[1]=='+')
                    good = good.add(z);
                else if(sym[1] == '-')
                    good = good.subtract(z);
                else if(sym[1]=='*')
                    good = good.multiply(z);
                else if(sym[1] == '/')
                    good = good.divide(z);
                else
                    good = good.remainder(z);
            }
        }
        else{
            if(sym[1]=='*'){
                 good = y.multiply(z);
                 if(sym[0]=='+')
                    good = good.add(x);
                 else
                    good = x.subtract(good);
            }
            else if(sym[1]=='/'){
                 good = y.divide(z);
                 if(sym[0]=='+')
                    good = good.add(x);
                 else
                    good = x.subtract(good);
            }
            else if(sym[1]=='%'){
                 good = y.remainder(z);
                 if(sym[0]=='+')
                    good = good.add(x);
                 else
                    good = x.subtract(good);
            }
            else if(sym[1]=='+'){
                 if(sym[0]=='+'){
                    good = x.add(y);
                    good = good.add(z);
                 }
                 else{
                    good = x.subtract(y);
                    good = good.add(z);
                 }

            }
            else if(sym[1]=='-'){
                 if(sym[0]=='+'){
                    good = x.add(y);
                    good = good.subtract(z);
                 }
                 else{
                    good = x.subtract(y);
                    good = good.subtract(z);
                 }
                    
            }
        }
        return good;
    }
    public static BigDecimal big2(BigDecimal x, BigDecimal y){
        BigDecimal good = new BigDecimal("0");
        if(sym[0] == '+')
            good = x.add(y);
        else if(sym[0] == '-')
            good = x.subtract(y);
        else if(sym[0] == '*')
            good = x.multiply(y);
        else if(sym[0] == '/')
            good = x.divide(y);
        else if(sym[0] == '%')
            good = x.remainder(y);  
        return good;
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        String ori;
        int flag=0;
        while(sc.hasNextLine()){
            
            String[] num = new String[4];

            int countN=-1;
            int countS=-1;
            ori = sc.nextLine();
            StringTokenizer st = new StringTokenizer(ori,"+-*/% ");
            while (st.hasMoreTokens()) {
                countN++;
                num[countN]=st.nextToken();
            }
            
            StringTokenizer stt = new StringTokenizer(ori,".0123456789 ");
            while (stt.hasMoreTokens()) {
                countS++;
                sym[countS]=stt.nextToken().charAt(0);
            }
            if(ori.charAt(0) == '-'){
                System.out.printf("-%.1f\n",Double.valueOf(num[0]));
            }
            else if(countN==2){
                BigDecimal num1 = new BigDecimal(num[0]);
                BigDecimal num2 = new BigDecimal(num[1]);
                BigDecimal num3 = new BigDecimal(num[2]);
                System.out.printf("%.1f %c %.1f %c %.1f = %.1f\n",num1.doubleValue(),sym[0], num2.doubleValue(), sym[1], num3.doubleValue(), big3(num1,num2,num3).doubleValue());
            }
            else if(countN==1){
                BigDecimal num1 = new BigDecimal(num[0]);
                BigDecimal num2 = new BigDecimal(num[1]);
                System.out.printf("%.1f %c %.1f = %.1f\n",num1.doubleValue(),sym[0], num2.doubleValue(), big2(num1,num2).doubleValue());
            }
            else{
                System.out.printf("%.1f\n",Double.valueOf(num[0]));
            }
        }
        
    }
    
}