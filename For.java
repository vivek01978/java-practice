import java.util.*;
class For{
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum = 0;
        // for (int z= 0; z<=n;z++){
        //     sum = sum + z;
        // }
        // System.out.println(sum);


        // Difference b/w while & do While
        // int i = 12;
        
        //     System.out.println("hello vivek");
        // }
        // // difference for out put

        // do{
        //     System.out.println("vivek");
        // }while(i<10);





        // int k =0;
        // do { 
        //     System.out.println("hello Mr vivek");
        // } while (k<10);

        //  While loop
        // int j=0;
        // while(j<10){
        //     System.out.println("what's up vivek");
        //     j++;
        // }

// for loop
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for ( int  counter = 0; counter < n; counter++){
        // for ( int i = 0; i < 101 ; i++){
        //    System.out.println(i);
        // }

         // Q--19 find the sum of digits of a number
        // int a = 12345;
        // int summ = 0;
        // while(a>0){
        //     summ++;
        // }
        // System.out.println(summ);

        // Q--20 find the product digit in a number.
        int n = sc.nextInt();
        int product = 1;
        while(n>0){
            int digit = n % 10;
            product = product * digit;
            n = n*10;
        }
        System.out.println(n);
    }        
}