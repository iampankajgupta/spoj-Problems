import java.util.*;
import java.io.*;
import java.lang.String;
import java.util.EmptyStackException;
public class stack2{
    public static void main (String args[]) throws Exception{
        Stack<Character> stack= new Stack<Character>(); 
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
     // Taking input from user for the test cases //
        int first = Integer.parseInt(obj.readLine());
        for(int i =0;i<first;i++){
            String s = obj.readLine(); 
            String add = " ";
            for(int j = 0;j<s.length();j++){
                if(s.charAt(j)=='(')
                    stack.push(s.charAt(j));
                else if(s.charAt(j) =='+'||s.charAt(j)=='-'||s.charAt(j)=='*'||s.charAt(j) =='/'||s.charAt(j)=='^'){
                if((s.charAt(j)=='*'||s.charAt(j)== '/'||s.charAt(j) =='^')&&(stack.peek()=='+'||stack.peek() =='-'))
                            add = add + stack.pop();
                    else
                    stack.push(s.charAt(j));
                }
                else if (s.charAt(j)==')'){
                    while(stack.peek()!='('){
                        add = add + stack.pop();
                    }
                   stack.pop();
                }
                else
                    add  = add + s.charAt(j);
            }
            System.out.println(add.trim());
        }
    }
}
