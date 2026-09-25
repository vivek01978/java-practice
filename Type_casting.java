import java.util.*;

public class Type_casting {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        StringBuilder name = new StringBuilder("vivek");
        StringBuilder name1 = new StringBuilder("vivek");
        
        // System.out.println(name.charAt(0));
        // name.setCharAt(0,'A');
        // System.out.println(name);
        // name.append(" what are doing Mr. Aivek ");
        // System.out.println(name);
        // name.insert(1,"v");
        // System.out.println(name);
        // name.delete(0,1);
        // System.out.println(name);

        // System.out.println(name.charAt(4));
        // name.setCharAt(4,'a');
        // System.out.println(name);
        // name.append(" what are doing Mr. Aivek ");
        // name.insert(4, 'k');
        // name.delete(5,6);
        // System.out.println(name.length());
        // System.out.println(name.compareTo(name1));
        // if(name.compareTo(name1) == 0){
        //     System.out.println("name and name1 are equal");
        // }else{
        //     System.out.println("name and name1 are not equal");
        // }

        // type casting
        // int a =24;
        // float decimal = (float) a;
        // System.out.println(decimal);

        // int b = 50;
        // // double two = b;
        // double two = (double)b;
        // System.out.println(two);

        // double c = 55.55;
        // int integer =(int) c;
        // System.out.println(integer);

        // long d = 50000L;
        // int I = (int) d;
        // System.out.println(I);

        // int e = 24;
        // int f = 5;
        // float divied = (float)e/f;
        // System.out.println(divied);

        // char ch = 'A';
        // int g = (int)ch;
        // System.out.println(g);

        // int num = 66;
        // char cha = (char)num;
        // System.out.println(cha);

        // byte by = 10;
        // int bb = 20;
        // double add = (double) by+bb;
        // System.out.println(add);

        int a = 7;
        int b = 2;
        float division = (float)a/b;
        System.out.println(division);

        float floa = 87.65f;
        int flo = (int) floa;
        System.out.println(flo);

        char ch = 'z';
        int num = (int) ch;
        System.out.println(num);

        int ascii = 97;
        char asci = (char)ascii;
        System.out.println(asci);

        int x = sc.nextInt();
        float x_float = (float)x;
        System.out.println(x_float);

        double d_double = (double)x;
        System.out.println(d_double);





    }

}