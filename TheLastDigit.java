import java.util.*;
import java.lang.Math;
public class lastDigit{
    static int  pow(int a ,int b,int c){
        if(b == 0)
        return 1;
        else if(b % 2 == 0){
            int y = pow(a , b / 2, c);
            return (y * y) % c;
        }
        else
        return ((a % c) * pow(a, b - 1, c)) %c ;
    }
    public static void main(String args[]){
       Scanner obj = new Scanner(System.in);
       int first = obj.nextInt();
       for(int i = 0; i < first; i++){
           int second = obj.nextInt();
           int third = obj.nextInt();
           System.out.println((pow(second, third, 10)));
       }
    }
}   
