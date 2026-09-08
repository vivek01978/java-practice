import java.util.*;
class Practice{
    public static void main(String[] args) {

        // Q1-- print numbers from 1 to 100
        // for(int i=0 ; i<=100 ; i++){
        //     System.out.println(i);
        // }

        // Q2--print all the numbers from 100 to 1
        // for(int i=100; i>=1; i--){
        //     System.out.println(i);
        // }

        // Q3--print all the even numbers from 1 to 100
        // for (int i = 0; i<=100; i++){
        //     if(i%2==0){
        //         System.out.println(i);
        //     }
        // }

        // Q4-- print all the odd numbers from 1 to 100
        // for (int i = 0 ; i<=100 ; i++){
        //     if (i%2!=0){
        //         System.out.println(i);
        //     }
        // }

        // Q5-- print all the numbers which are divisible by 5 from 1 to 100
        // for(int i =0 ; i<=100 ; i++){
        //     if (i%5==0){
        //         System.out.println(i);
        //     }
        // }
        
        // Q-- print all the numbers which are divisible by 3 and 5 from 1 to 100
        // for (int i = 1 ; i<=100 ; i++){
        //     if (i%3==0 && i%5==0){
        //         System.out.println(i);
        //     }
        // }
        
        // Q--6 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i<=n; i++){
            if(i%2==0){
                sum = i+sum;
                System.out.println(sum);


            }
        }

        
    }
}