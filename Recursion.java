class Recursion {
    // public static void printnum(int n){
    //     if(n==0){
    //         return;
    //     }
    //     System.out.print(n);
    //     printnum(n-1);
    // }
    // public static void print_a(int a){
    //     if(a==6){
    //         return;
    //     }
    //     System.out.print(a);
    //     print_a(a+1);       
    // }
    // public static void printsum(int x , int i , int sum){
    //     if(i==x){
    //         sum +=i;
    //         System.out.println(sum);
    //         return;
    //     }
    //     sum +=1;
    //     printsum(x+1, i, sum);
    // }

    public static int calcfactorial(int n ){
        if(n==1 || n==0){
            return 1;
        }
        int fact_num1  = calcfactorial(n-1);
        int fact_n = n * fact_num1;
        return fact_n;
    }


    public static void main(String[] args){

        // Q-- print number from 5 to 1
        // int n = 5;
        // printnum(n);
        // System.out.println();

        // // Q-- print number 1 to 5
        // int a = 1;
        // print_a(a);

        // Q-- > print factorial of a number n 
        int n = 5;
        int ans = calcfactorial(n);




    

   
    }
}
