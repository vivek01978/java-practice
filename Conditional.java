import java.util.*;
class Conditional{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        



// Q: input a 3 number and print largest number
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // if(a>=b && a>=c ){
        //     System.out.println(a+"largest");
        // }else if (b>=a & b>=c){
        //     System.out.println("largest"+b);
        // }else{
        //     System.out.println("largest"+c);
        // }


// input use se check odd or even
        // int n = sc.nextInt();
        // if(n%2 == 0){
        //     System.out.println("even");
        // }else{
        //     System.out.println("odd");
        // }


// select buttom 1,2,3 and print greating 
        // int buttom = sc.nextInt();
        // switch(buttom){
        //     case 1 : System.out.println("hello");
        //     break;
        //     case 2: System.out.println("namaste");
        //     break;
        //     case 3: System.out.println("bonjour");
        //     break;
        //     default:System.out.println("invalid buttom");
        // }

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // if (a==b){
        //     System.out.println("Equel");
        // }else if (a>b){
        //     System.out.println("a is greter");
        // }else{
        //     System.out.println("a is less");
        // }

// Q FOR BOTH ARE SAME BUT ELSE OR ELSE IF 

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // if (a==b){
        //     System.out.println("Equel");
        // }else{
        //     if(a>b){
        //         System.out.println("a is Greter");
        //     }else{
        //         System.out.println("a is less ");
        //     }
        // }


        // int age = sc.nextInt();
        // if (age>18){
        //     System.out.println("adult");
        // }else{
        //     System.out.println("not adult");
        // }

        // EVEN & ODD CONDITIONAL 
        // int x = sc.nextInt();
        // if (x%2 == 0 ){
        //     System.out.println("Even");
        // }else {
        //     System.out.println("odd");
        // }

        System.out.print("enter number a:");
        int a = sc.nextInt();
        System.out.print("enter number b:");
        int b = sc.nextInt();
        System.out.print("enter number c:");
        int c = sc.nextInt();
        if(a>b && a>c){
                System.out.println("a is largest no.");
        }else if (b>a && b>c){
                System.out.println("b is largest no.");
        }else{
                System.out.println("c is largest no.");
        }



    }
}