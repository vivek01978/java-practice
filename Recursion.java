class Recursion {
    public static void printnum(int n){
        if(n==0){
            return;
        }
        System.out.print(n);
        printnum(n-1);
    }
    public static void print_a(int a){
        if(a==6){
            return;
        }
        System.out.print(a);
        print_a(a+1);
    }
    public static void main(String[] args){

        // Q-- print number from 5 to 1
        int n = 5;
        printnum(n);
        System.out.println();

        // Q-- print number 1 to 5
        int a = 1;
        print_a(a);

    

   
    }
}
