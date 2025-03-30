import java.util.*;
public class calculator2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char opertaors = sc.next().charAt(0);
        switch(opertaors){
            case '+':System.out.println(a+b);
            break;
            case '-':System.out.println(a-b);
            break;
            case '*':System.out.println(a*b);
            break;
            case '/':System.out.println(a/b);
            break;
            case '%':System.out.println(a%b);
            
            default:System.out.println("Wrong operator");
        }
        sc.close();
    }
    

}
