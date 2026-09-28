public class OB {
    public static void main(String[] args){
        // int a = 10;
        // int b  = 0;
        // b = --a;
        // System.out.println(a);
        // System.out.println(b); 
        // // 
        // int c = 100;
        // int d = 0;

       
        int a[]={1,0,0};
        int b[]={4,6};
        int  sizee=a.length;
        int[] ans = new int[ sizee];
        int i=a.length-1;
        int j=b.length-1;
        int k=sizee-1;
        int borrow=0;
        while(i>=0){
            int x=a[i];
            int y=(j>=0)?b[j]:0;
            int sub=x-y-borrow;
            if(sub<0){
                sub += 10;
                borrow=1;
            }
            else {
                borrow=0;
            }
            ans[k]=sub;
            i--;
            j--;
            k--;
        }
        for( int x=0; x<sizee; x++){
         System.out.println(ans[x]);
        }
        

    }
}
