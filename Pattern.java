class Pattern{
    public static void main (String args[]){
        // for(int i =1; i<=5 ; i++){
        //     for(int j = 1 ; j<=i ; j++){
        //         if((i+j)% 2 ==0){
        //             System.out.print("1 ");
        //         }else{
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println();
        // }




        // int number = 1;
        // for(int i =1 ; i<=5; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print(number + " ");
        //         number++;
        //     }
        //     System.out.println();
        // }





        // for (int i = 5 ; i<=5; i++){
        //     for(int j = 5 ; j<=5-i+1 ; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        // 1 2 3 4 5
        // 1 2 3 4
        // 1 2 3 
        // 1 2 
        // 1
         



        // for(int i = 1; i<=5 ; i++){
        //     for(int j =1; j<=i; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // 1
        // 12
        // 123
        // 1234
        // 12345





        // int n =4;
        // for(int i= 1; i<=n ; i++){
        //     for(int j=1; j<=n-1;j++){
        //         System.out.print(" ");
        //     }for(int j = 1 ; j<=i ; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }



        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // output

        // *            |****    i=4;i>=1;i--
        // **           |***
        // ***          |**
        // ****         |*


        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=5;j++){
        //         if(i==1 || j==1 || i==4 || j==5){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }

        //     }System.out.println();
        // }
        // output
        // *****
        // *   *
        // *   *
        // *****
       
        // nested loop
        // for (int i=1;i<=4;i++){
        //     for(int j=1; j<=5;j++){
        //         System.out.print("*");
        //     }System.out.println("");
        // }

        // out put 
        // *****
        // *****
        // *****
        // *****

        // for(int i=1; i<=5; i++){
        //     System.out.print("*");
        // }
        // *****

        // for(int i =1; i<=2 ; i++){
        //     for(int j =1; j<=5 ; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i =1 ; i<=4 ; i++){
        //     for(int j = 1 ; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // *
        // **
        // ***
        // ****

        // for(int i = 1 ; i <=4 ; i++ ){
        //     for(int j = 1 ; j<=4 ; j++){
        //         if(i ==1){
        //             System.out.print("*");
        //         }else if(j==1){
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();  
        // }
        // ****
        // *
        // * 
        // * 

        for(int i = 1 ; i<=4 ; i++){
            for(int j = 1 ; j<=4; j++){
                if(i == 1 || j==1 || j ==4){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }



    }
}