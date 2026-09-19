import java.util.*;
class Function {
    public static int printmultiply(int a , int b){
        int multiply = a*b;
        return multiply;
    }
    public static int printsum(int a , int b){
        System.out.println(a+b);
        return 1;
    }

    // 1--
    public static void printName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        printsum(a, b);
        System.out.print(printmultiply(a, b));
        

  

        // 1--
        // System.out.print("enter a name :");
        // String name = sc.next();
        // System.out.println(name);


    }
    
}
