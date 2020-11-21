import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
import java.math.BigDecimal;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str,temp;
        String[] strSplit = new String[100];
        Stack<String> staS = new Stack<String>();
        sort A = new sort();
        int time,op;
        str = sc.nextLine();
        strSplit = A.oriSplit(str);
        time = A.printTimes();
        strSplit = A.postfix(strSplit);
        op = A.printIndexTimes();
        for(int i=0; i<op; i++){
            if(strSplit[i].equals("+") || strSplit[i].equals("-") || strSplit[i].equals("*") || strSplit[i].equals("/") || strSplit[i].equals("%")){
                BigDecimal right = new BigDecimal(staS.peek());
                staS.pop();
                BigDecimal left = new BigDecimal(staS.peek());
                staS.pop();
                BigDecimal result = A.compute(left,right,strSplit[i].charAt(0));
                staS.push(result.toString());
            }
            else{
                staS.push(strSplit[i]);
            }
        }
        System.out.printf("%.2f\n",Float.valueOf(staS.peek()));
        staS.pop();      
    }
    
}
class sort{
    private int times;
    private int indexTimes;
    public sort(){}

    int printIndexTimes(){
        return indexTimes;
    }
    int printTimes(){
        return times;
    }

    String[] oriSplit(String s){
        String[] strReturn = new String[100];
        int i=0;
        StringTokenizer stt = new StringTokenizer(s,"+-*/()%",true);
        while (stt.hasMoreTokens()){
            strReturn[i] = stt.nextToken();
            i++;
        }
        times = i;
        return strReturn;
    }
    String[] postfix(String[] s){
        String[] strReturn = new String[100];
        String temp;
        Stack<Character> sta = new Stack<Character>();
        int priority=0,newPri,count=0,index=0,wastecount=0;
        while (count < times) {
            temp = s[count];
            if(temp.charAt(0)>='0' && temp.charAt(0)<='9'){
                strReturn[index] = temp;
                index++;
            }
            else{
                if(temp.equals("+") || temp.equals("-")){
                    while(!sta.empty() && sta.peek()!='('){
                        strReturn[index] = sta.peek().toString();
                        index++;
                        sta.pop();
                    }
                    sta.push(temp.charAt(0));
                    priority = 1;
                }
                else if (temp.equals("*") || temp.equals("/") || temp.equals("%")){
                    while(!sta.empty() && sta.peek()!='('){
                        newPri = 2;
                        if(newPri>priority){
                            break;
                        }
                        else if(newPri==priority){
                            strReturn[index] = sta.peek().toString();
                            index++;
                            sta.pop();
                            break;
                        }
                    }
                        sta.push(temp.charAt(0));
                        priority = 2; 
                    
                }
                else if (temp.equals("(")){
                    sta.push(temp.charAt(0));
                    wastecount++;
                }
                if(temp.equals(")")){
                    while(sta.peek()!='('){
                        strReturn[index] = sta.peek().toString();
                        index++;
                        sta.pop();
                    }
                    sta.pop();
                    if(!sta.empty() && (sta.peek()=='*' || sta.peek()=='/' || sta.peek()=='%'))
                        priority = 2;
                    else if(!sta.empty() && (sta.peek()=='+' || sta.peek()=='-'))
                        priority = 1;
                }
            }
            count++;
        }
        while(!sta.empty()){
            if(sta.peek()=='('){
                sta.pop();
                continue;
            }
            strReturn[index] = sta.peek().toString();
            index++;
            sta.pop();           
        } 
        indexTimes = index;
        return strReturn;
    }
    BigDecimal compute(BigDecimal x, BigDecimal y, char sym){
        if(sym == '+')
            return x.add(y);
        else if(sym == '-')
            return x.subtract(y);
        else if(sym == '*')
            return x.multiply(y);
        else if(sym == '/')
            return x.divide(y);
        else
            return x.remainder(y);
    }
}