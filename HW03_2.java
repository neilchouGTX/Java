import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Character> sta = new Stack<Character>();
        String str,temp;
        int priority=0,newPri;
        str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str,"+-*/()%",true);
        while (st.hasMoreTokens()) {
            temp = st.nextToken();
            if(temp.charAt(0)>='0' && temp.charAt(0)<='9'){
                System.out.print(temp + " ");
            }
            else{
                if(temp.equals("+") || temp.equals("-")){
                    while(!sta.empty() && sta.peek()!='('){
                        System.out.print(sta.peek() + " ");
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
                            System.out.print(sta.peek() + " ");
                            sta.pop();
                            break;
                        }
                    }
                        sta.push(temp.charAt(0));
                        priority = 2; 
                    
                }
                else if (temp.equals("(")){
                    sta.push(temp.charAt(0));
                }
                if(temp.equals(")")){
                    while(sta.peek()!='('){
                        System.out.print(sta.peek() + " ");
                        sta.pop();
                    }
                    sta.pop();
                    if(!sta.empty() && (sta.peek()=='*' || sta.peek()=='/' || sta.peek()=='%')){
                        priority = 2;
                    }
                    else if(!sta.empty() && (sta.peek()=='+' || sta.peek()=='-')){
                        priority = 1;
                    }
                }

            }
        }
        while(!sta.empty()){
            if(sta.peek()=='('){
                sta.pop();
                continue;
            }
            System.out.print(sta.peek() + " ");
            sta.pop();
        }
        System.out.println();
    }
    
}